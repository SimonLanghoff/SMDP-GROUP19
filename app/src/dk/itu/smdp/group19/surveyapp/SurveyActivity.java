package dk.itu.smdp.group19.surveyapp;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import dk.itu.smdp.group19.surveyapp.parser.Action;
import dk.itu.smdp.group19.surveyapp.parser.AnswerCollector;
import dk.itu.smdp.group19.surveyapp.parser.DefaultAnswerChangeListener;
import dk.itu.smdp.group19.surveyapp.parser.UserControlGenerator;
import dk.itu.smdp.group19.surveyapp.parser.XmlParser;
import dk.itu.smdp.group19.surveyapp.parser.elements.Page;
import dk.itu.smdp.group19.surveyapp.parser.elements.Question;
import dk.itu.smdp.group19.surveyapp.parser.elements.QuestionPage;
import dk.itu.smdp.group19.surveyapp.parser.elements.QuestionType;
import dk.itu.smdp.group19.surveyapp.parser.elements.Survey;

public class SurveyActivity extends Activity {
	public final String TAG = "SurveyActivity";
	private final String APPDIR = MainActivity.getAppDir();
	private String SURVEY_FILE_NAME;

	private UserControlGenerator controlGenerator;
	private List<Question> allQuestions;
	private List<PageFragment> pageFragments;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey);

		SURVEY_FILE_NAME = getIntent().getStringExtra("filename");

		String filePath = APPDIR + "/" + SURVEY_FILE_NAME;

		controlGenerator = new UserControlGenerator(this);

		XmlParser parser = new XmlParser(filePath);
		Survey survey = parser.parse();

		if (survey != null)
			generateSurvey(survey);

		allQuestions = collectQuestions(survey);
		applyDependencies(allQuestions);

		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		removeFocusFromAllElements();
	}
	
	@Override
	public void onBackPressed() {
	   DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
		    @Override
		    public void onClick(DialogInterface dialog, int which) {
		        switch (which) {
		        case DialogInterface.BUTTON_POSITIVE:
		            finish();
		            break;

		        case DialogInterface.BUTTON_NEGATIVE:
		        	// do nothing, I guess.
		            break;
		        }
		    }
		};

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Exit Survey?")
			.setMessage("This will exit the survey, and all data will be lost. Are you sure?")
			.setPositiveButton("Yes", dialogClickListener)
			.setNegativeButton("No", dialogClickListener)
			.show();
	}

	private void generateSurvey(Survey survey) {
		// make it possible to enable/disable questions based on dependencies
		Action answerChangedCallback = new Action() {
			@Override
			public void doAction() {
				applyDependencies(allQuestions);
			}
		};

//		LinearLayout layout = (LinearLayout) findViewById(R.id.root);
//
//		TextView surveyTitle = new TextView(this);
//		surveyTitle.setText(survey.getTitle());
//		layout.addView(surveyTitle);

		ActionBar actionBar = getActionBar();
		actionBar.setTitle(survey.getTitle());
		
		pageFragments = new ArrayList<PageFragment>();
		
		for (Page page : survey.getPages()) {
			LinearLayout layout = new LinearLayout(this);
			layout.setOrientation(LinearLayout.VERTICAL);
			
			layout.addView(controlGenerator.makePageHeader(page));

			if (page.getClass() == QuestionPage.class) {
				QuestionPage questionPage = (QuestionPage) page;

				for (Question question : questionPage.getQuestions()) {
					layout.addView(controlGenerator.makeQuestionHeader(question));

					ViewGroup answers = null;

					if (question.getType() == QuestionType.SINGLE) {
						answers = controlGenerator.makeSingleChoiceAnswers(question.getAnswers(), new DefaultAnswerChangeListener(answerChangedCallback));
					} else if (question.getType() == QuestionType.MULTI) {
						answers = controlGenerator.makeMultiChoiceAnswers(question.getAnswers(), new DefaultAnswerChangeListener(answerChangedCallback));
					} else if (question.getType() == QuestionType.FREETEXT) {
						answers = controlGenerator.makeFreetextAnswers(question.getAnswers(), new DefaultAnswerChangeListener(answerChangedCallback));
					}

					layout.addView(answers);
					question.setAnswerViewGroup(answers);
				}
			}
			
			PageFragment pageFragment = new PageFragment();
			pageFragment.setLayout(layout);
			
			pageFragments.add(pageFragment);
		}
		
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.add(R.id.root, pageFragments.get(0), "0");
//		transaction.addToBackStack(null);
		transaction.commit();
		
		addNavigationButtons();
		addSendButton();
	}
	
	private void addNavigationButtons() {
		for(int i = 0; i < pageFragments.size(); i++) {
			final int currentIndex = i;
			LinearLayout layout = pageFragments.get(i).getLayout();
			LinearLayout buttonContainer = new LinearLayout(this);
			buttonContainer.setOrientation(LinearLayout.HORIZONTAL);
			
			if(i > 0) {
				Button previous = new Button(this);
				previous.setText("Previous");
				
				previous.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						PageFragment previousFragment = pageFragments.get(currentIndex-1);
						
						FragmentManager manager = getFragmentManager();
						
						FragmentTransaction transaction = manager.beginTransaction();
						transaction.replace(R.id.root, previousFragment, "" + (currentIndex-1));
						transaction.commit();
					}
				});
				
//				layout.addView(previous);
				buttonContainer.addView(previous);
			}
			if(i < pageFragments.size() - 1) {
				Button next = new Button(this);
				next.setText("Next");
				
				next.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						PageFragment nextFragment = pageFragments.get(currentIndex+1);
						
						FragmentManager manager = getFragmentManager();
						
						FragmentTransaction transaction = manager.beginTransaction();
						transaction.replace(R.id.root, nextFragment, "" + (currentIndex+1));
						transaction.commit();
					}
				});
				
//				layout.addView(next);
				buttonContainer.addView(next);
			}
			
			layout.addView(buttonContainer);
		}
	}
	
	private void addSendButton() {
		Button buttonSend = new Button(this);
		buttonSend.setText("Send");
		buttonSend.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(!AnswerCollector.checkMandatoriesHaveAnswers()) {
					AlertDialog.Builder builder = new AlertDialog.Builder(SurveyActivity.this);
					builder.setTitle("Missing Answer")
						.setMessage("Please answer all non-optional questions.")
						.setNeutralButton("OK", null)
						.show();
					
					return;
				}
				
				removeFocusFromAllElements();

				Intent i = new Intent(v.getContext(), SendEmailActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		pageFragments.get(pageFragments.size() - 1).getLayout().addView(buttonSend);
//		layout.addView(buttonSend);
	}

	private void applyDependencies(List<Question> allQuestions) {
		for (Question q : allQuestions) {
			if (q.getRequires() == null || q.getAnswerViewGroup() == null)
				continue;

			// enable or disable the question
			ViewGroup vg = q.getAnswerViewGroup();

			boolean enable = AnswerCollector.isDependencySatisfied(q
					.getRequires());

			setGroupEnabled(vg, enable);
		}
	}

	private List<Question> collectQuestions(Survey s) {
		ArrayList<Question> questions = new ArrayList<Question>();

		for (Page p : s.getPages()) {
			if (p instanceof QuestionPage)
				questions.addAll(((QuestionPage) p).getQuestions());
		}

		return questions;
	}

	private void removeFocusFromAllElements() {
		// TODO: former 'root' is now added dynamically... what to do?
		LinearLayout ll = (LinearLayout) findViewById(R.id.root);
		ll.clearFocus();
//		Log.d("TAG", "child count: " + ll.getChildCount());
//		for (int i = 0; i < ll.getChildCount(); i++) {
//			View v = ll.getChildAt(i);
//			v.clearFocus();
//		}
	}

	private void setGroupEnabled(ViewGroup view, boolean enabled) {
		for (int i = 0; i < view.getChildCount(); i++) {
			View v = view.getChildAt(i);
			if(v instanceof RadioGroup) {
				RadioGroup rg = (RadioGroup) v;
				rg.clearCheck();
				setGroupEnabled(rg, enabled);
			}
			else if (v instanceof ViewGroup) {
				setGroupEnabled((ViewGroup) v, enabled);
			}
			else if (v instanceof CheckBox) {
				CheckBox cb = (CheckBox) v;
				cb.setEnabled(enabled);
				if(!enabled) {
					cb.setChecked(false);
				}
			}
			else {
				v.setEnabled(enabled);
			}
		}
		
		view.setEnabled(enabled);
	}
}

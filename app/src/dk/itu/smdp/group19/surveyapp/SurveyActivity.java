package dk.itu.smdp.group19.surveyapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
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

	private void generateSurvey(Survey survey) {
		// make it possible to enable/disable questions based on dependencies
		Action answerChangedCallback = new Action() {
			@Override
			public void doAction() {
				applyDependencies(allQuestions);
			}
		};

		LinearLayout layout = (LinearLayout) findViewById(R.id.root);

		TextView surveyTitle = new TextView(this);
		surveyTitle.setText(survey.getTitle());
		layout.addView(surveyTitle);

		for (Page page : survey.getPages()) {
			layout.addView(controlGenerator.makePageHeader(page));

			if (page.getClass() == QuestionPage.class) {
				QuestionPage questionPage = (QuestionPage) page;

				for (Question question : questionPage.getQuestions()) {
					layout.addView(controlGenerator
							.makeQuestionHeader(question));

					ViewGroup answers = null;

					if (question.getType() == QuestionType.SINGLE) {
						answers = controlGenerator.makeSingleChoiceAnswers(
								question.getAnswers(),
								new DefaultAnswerChangeListener(
										answerChangedCallback));
					} else if (question.getType() == QuestionType.MULTI) {
						answers = controlGenerator.makeMultiChoiceAnswers(
								question.getAnswers(),
								new DefaultAnswerChangeListener(
										answerChangedCallback));
					} else if (question.getType() == QuestionType.FREETEXT) {
						answers = controlGenerator.makeFreetextAnswers(question
								.getAnswers(), new DefaultAnswerChangeListener(
								answerChangedCallback));
					}

					layout.addView(answers);
					question.setAnswerViewGroup(answers);
				}
			}
		}

		Button buttonSend = new Button(this);
		buttonSend.setText("Send");
		buttonSend.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				removeFocusFromAllElements();

				Intent i = new Intent(v.getContext(), SendEmailActivity.class);
				startActivity(i);
			}
		});
		layout.addView(buttonSend);
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
		LinearLayout ll = (LinearLayout) findViewById(R.id.root);

		for (int i = 0; i < ll.getChildCount(); i++) {
			View v = ll.getChildAt(i);
			v.clearFocus();
		}
	}

	private void setGroupEnabled(ViewGroup view, boolean enabled) {
		for (int i = 0; i < view.getChildCount(); i++) {
			View v = view.getChildAt(i);
			if (v instanceof ViewGroup)
				setGroupEnabled((ViewGroup) v, enabled);
			else
				v.setEnabled(enabled);
		}
		view.setEnabled(enabled);
	}
}

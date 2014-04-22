package dk.itu.smdp.group19.surveyapp;

import java.io.File;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
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
	private final String APPDIR = getAppDir();
	private final String SURVEY_FILE_NAME = "brandts_survey.xml";
	
	private UserControlGenerator controlGenerator;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey);
		
		String filePath = APPDIR + "/" + SURVEY_FILE_NAME;
//		File file = new File(filePath);
		
		controlGenerator = new UserControlGenerator(this);
		
		XmlParser parser = new XmlParser(filePath);
		Survey survey = parser.parse();
		
		if(survey != null) {
			generateSurvey(survey);
		}
		
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	}
	
	private void generateSurvey(Survey survey) {
		LinearLayout layout = (LinearLayout) findViewById(R.id.root);
		
		TextView surveyTitle = new TextView(this);
		surveyTitle.setText(survey.getTitle());
		layout.addView(surveyTitle);
		
		for(Page page : survey.getPages()) {
			layout.addView(controlGenerator.makePageHeader(page));
			
			if(page.getClass() == QuestionPage.class) {
				QuestionPage questionPage = (QuestionPage) page;
				
				for(Question question : questionPage.getQuestions()) {
					layout.addView(controlGenerator.makeQuestionHeader(question));
					
					ViewGroup answers = null;
					
					if(question.getType() == QuestionType.SINGLE) {
						answers = controlGenerator.makeSingleChoiceAnswers(question.getAnswers(), new DefaultAnswerChangeListener());
					}
					else if(question.getType() == QuestionType.MULTI) {
						answers = controlGenerator.makeMultiChoiceAnswers(question.getAnswers(), new DefaultAnswerChangeListener());
					}
					else if(question.getType() == QuestionType.FREETEXT) {
						answers = controlGenerator.makeFreetextAnswers(question.getAnswers(), new DefaultAnswerChangeListener());
					}
					
					layout.addView(answers);
				}
			}
		}
		
		Button buttonSend = new Button(this);
		buttonSend.setText("Send");
		buttonSend.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				
				Intent i = new Intent(v.getContext(), SendEmailActivity.class);
				startActivity(i);
			}
		});
		layout.addView(buttonSend);
	}
	
	
	public String getAppDir() {
		if(isExternalStorageReadable()) {
			File storageDir = Environment.getExternalStorageDirectory();
			File appDir = new File(storageDir, "/SurveyApp");
			Boolean didCreate = appDir.mkdirs();
			Log.i(TAG, "Created app dir: " + didCreate);
			return appDir.getAbsolutePath();
		} else {
			Log.e(TAG, "External storage not available!");
			return null;
		}
	}
	
	/* Checks if external storage is available to at least read */
	public boolean isExternalStorageReadable() {
	    String state = Environment.getExternalStorageState();
	    if (Environment.MEDIA_MOUNTED.equals(state) || Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
	        return true;
	    }
	    
	    return false;
	}
}

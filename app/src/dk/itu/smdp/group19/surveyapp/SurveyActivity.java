package dk.itu.smdp.group19.surveyapp;

import java.io.File;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import dk.itu.smdp.group19.surveyapp.parser.XmlParser;
import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;
import dk.itu.smdp.group19.surveyapp.parser.elements.Page;
import dk.itu.smdp.group19.surveyapp.parser.elements.Question;
import dk.itu.smdp.group19.surveyapp.parser.elements.QuestionPage;
import dk.itu.smdp.group19.surveyapp.parser.elements.Survey;

public class SurveyActivity extends Activity {
	public final String TAG = "SurveyActivity";
	private final String APPDIR = getAppDir();
	private final String SURVEY_FILE_NAME = "SampleSurvey.xml";
	
	XmlParser parser;
	final String xmlFileLocation = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey);
		
		String filePath = APPDIR + "/" + SURVEY_FILE_NAME;
		File file = new File(filePath);
		
		XmlParser parser = new XmlParser(filePath);
		Survey survey = parser.parse();
		
		if(survey != null) {
			generateSurvey(survey);
		}
	}
	
	private void generateSurvey(Survey survey) {
		LinearLayout layout = (LinearLayout) findViewById(R.id.root);
		
		TextView surveyTitle = new TextView(this);
		surveyTitle.setText(survey.getTitle());
		layout.addView(surveyTitle);
		
		makeRuler(layout, Color.BLACK);
		
		for(Page page : survey.getPages()) {
			makePageHeader(layout, page);
			
			makeRuler(layout, Color.RED);
			
			if(page.getClass() == QuestionPage.class) {
				QuestionPage questionPage = (QuestionPage) page;
				
				for(Question question : questionPage.getQuestions()) {
					makeQuestionHeader(layout, question);a
					
					makeRuler(layout, Color.BLUE);
					
					for(Answer answer : question.getAnswers()) {
						TextView answerName = new TextView(this);
						answerName.setText(answer.getName());
						layout.addView(answerName);
						
						makeRuler(layout, Color.BLUE);
					}
					
					makeRuler(layout, Color.RED);
				}
			}
			
			makeRuler(layout, Color.BLACK);
		}
	}
	
	private void makeRuler(LinearLayout parent, int color) {
		View ruler = new View(this);
		ruler.setBackgroundColor(color);
		
		parent.addView(ruler, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 2));
	}
	
	private void makePageHeader(LinearLayout parent, Page page) {
		TextView pageTitle = new TextView(this);
		pageTitle.setText(page.getName());
		parent.addView(pageTitle);
		
		TextView pageDescription = new TextView(this);
		pageDescription.setText(page.getDescription());
		parent.addView(pageDescription);
	}
	
	private void makeQuestionHeader(LinearLayout parent, Question question) {
		TextView questionName = new TextView(this);
		questionName.setText(question.getName());
		parent.addView(questionName);
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

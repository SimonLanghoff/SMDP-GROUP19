package dk.itu.smdp.group19.surveyapp;

import java.io.File;
import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

public class SurveyActivity extends Activity {
	public final String TAG = "SurveyActivity";
	XmlParser parser;
	final String xmlFileLocation = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey);
		
		TextView status = (TextView) findViewById(R.id.textViewStatus);
		
//		parser = new XmlParser(xmlFileLocation);
		
		if(isExternalStorageReadable()) {
			File directory = Environment.getExternalStorageDirectory();
			File appDir = new File(directory + "/SurveyApp");
			
			Log.i(TAG, appDir.getAbsolutePath());
			
			
		} else {
			Log.e(TAG, "Could not read external storage.");
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

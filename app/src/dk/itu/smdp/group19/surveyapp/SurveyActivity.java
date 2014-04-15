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
	private final String APPDIR = getAppDir();
	private final String SURVEY_FILE_NAME = "test.xml";
	
	XmlParser parser;
	final String xmlFileLocation = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey);
		
		TextView status = (TextView) findViewById(R.id.textViewStatus);
		
		String filePath = APPDIR + "/" + SURVEY_FILE_NAME;
		Log.d(TAG, "filePath: " + filePath);
		File file = new File(filePath);
		Log.d(TAG, "file exists: " + file.exists());
		XmlParser parser = new XmlParser(filePath);
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

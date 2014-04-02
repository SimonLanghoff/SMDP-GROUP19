package dk.itu.smdp.group19.surveyapp;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

public class SurveyActivity extends Activity {
	public final String TAG = "SurveyActivity";
	private final File APPDIR = getAppDir();
	private final String SURVEY_FILE_NAME = "text.xml";
	
	XmlParser parser;
	final String xmlFileLocation = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey);
		
		TextView status = (TextView) findViewById(R.id.textViewStatus);
		
		String dir = APPDIR.getPath() + "/" + SURVEY_FILE_NAME;
		Log.d(TAG, dir);
		File fileDir = new File(APPDIR.getPath());
		File[] files = fileDir.listFiles();
		for(File file : files) {
			Log.d(TAG, file.getName());
			Log.d(TAG, "file path: " + file.getPath());
		}
		XmlParser parser = new XmlParser(dir);
	}
	
	public File getAppDir() {
		if(isExternalStorageReadable()) {
			File directory = Environment.getExternalStorageDirectory();
			File appDir = new File(directory, "/SurveyApp");
			Boolean didCreate = appDir.mkdirs();
			Log.i(TAG, "Created app dir: " + didCreate);
			return appDir;
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

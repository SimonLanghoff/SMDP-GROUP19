package dk.itu.smdp.group19.surveyapp;

import java.io.File;
import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import dk.itu.smdp.group19.surveyapp.parser.AnswerCollector;

public class MainActivity extends Activity {
	public static final String TAG = "MainActivity";
	public static final String SAMPLE_SURVEY_NAME = "sample_survey_130514.xml";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayList<String> fileNames = getFileNames();
		Spinner fileSelector = (Spinner) findViewById(R.id.spinnerFileSelector);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fileNames); 
		fileSelector.setAdapter(adapter);
	}
	
	private ArrayList<String> getFileNames() {
		ArrayList<String> fileList = new ArrayList<String>();
		String dir = getAppDir();
		File fileDir = new File(dir);
		for(File file : fileDir.listFiles()) {
			if(file.isFile() && file.getName().endsWith(".xml")) {
				fileList.add(file.getName());
			}
		}
		
		// add sample survey
		fileList.add(SAMPLE_SURVEY_NAME);
		
		return fileList;
	}
	
	public void buttonStartSurveyOnClick(View v) {
		EditText email = (EditText) findViewById(R.id.editTextEmail);
		
		if(!email.getText().toString().contains("@")) {
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Missing E-mail")
				.setMessage("Please enter a valid e-mail address")
				.setNeutralButton("OK", null)
				.show();
			
			return;
		}
		
		AnswerCollector.setRecipient(email.getText().toString());
		
		Spinner fileSelector = (Spinner) findViewById(R.id.spinnerFileSelector);
		String filename = (String) fileSelector.getSelectedItem();
		
		Intent i = new Intent(v.getContext(), SurveyActivity.class);
		i.putExtra("filename", filename);
		startActivity(i);
	}
	
	public static String getAppDir() {
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
	public static boolean isExternalStorageReadable() {
	    String state = Environment.getExternalStorageState();
	    if (Environment.MEDIA_MOUNTED.equals(state) || Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
	        return true;
	    }
	    
	    return false;
	}
}

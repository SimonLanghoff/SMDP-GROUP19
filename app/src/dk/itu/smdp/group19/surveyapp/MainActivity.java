package dk.itu.smdp.group19.surveyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
	public final String TAG = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void buttonStartSurveyOnClick(View v) {
		Log.d(TAG, "Starting survey activity");
		Intent i = new Intent(getApplicationContext(), SurveyActivity.class);
		startActivity(i);
	}
}

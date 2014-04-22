package dk.itu.smdp.group19.surveyapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import dk.itu.smdp.group19.surveyapp.parser.elements.AnswerCollector;

public class SendEmailActivity extends Activity {
	public final String TAG = "SendEmailActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_email);
		
		Log.d(TAG, "Answer string:\n" + AnswerCollector.getAnswersAsString());
	}
}

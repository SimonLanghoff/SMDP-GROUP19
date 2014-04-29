package dk.itu.smdp.group19.surveyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import dk.itu.smdp.group19.surveyapp.parser.AnswerCollector;

public class SendEmailActivity extends Activity {
	public final String TAG = "SendEmailActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_email);
		
		Log.d(TAG, "Answer string:\n" + AnswerCollector.getAnswersAsString());
		
		Intent i = new Intent(Intent.ACTION_SEND);
		i.setType("message/rfc822");
		i.putExtra(Intent.EXTRA_EMAIL, new String[] {"mfli@itu.dk"});
		i.putExtra(Intent.EXTRA_SUBJECT, "New answer to your survey!");
		i.putExtra(Intent.EXTRA_TEXT, AnswerCollector.getAnswersAsString());
		
		try {
		    startActivity(Intent.createChooser(i, "Send mail..."));
		} catch (android.content.ActivityNotFoundException ex) {
		    Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_LONG).show();
		}
	}
}

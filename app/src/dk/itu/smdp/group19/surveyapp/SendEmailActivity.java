package dk.itu.smdp.group19.surveyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
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
		i.putExtra(Intent.EXTRA_EMAIL, new String[] {AnswerCollector.getRecipient()});
		i.putExtra(Intent.EXTRA_SUBJECT, "New answer to your survey!");
		i.putExtra(Intent.EXTRA_TEXT, AnswerCollector.getAnswersAsString());
		
		try {
		    startActivityForResult(Intent.createChooser(i, "Send e-mail"), 1);
		} catch (android.content.ActivityNotFoundException ex) {
		    Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_LONG).show();
		}
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		TextView thanks = (TextView) findViewById(R.id.thankYou);
		thanks.setText(thanks.getText() + " " + AnswerCollector.getRecipient());
		
		AnswerCollector.purge();
	}
}

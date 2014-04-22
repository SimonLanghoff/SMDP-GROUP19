package dk.itu.smdp.group19.surveyapp.parser;

import android.view.View;
import android.widget.EditText;
import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;
import dk.itu.smdp.group19.surveyapp.parser.elements.AnswerCollector;

public class DefaultAnswerChangeListener implements AnswerChangeListener {

	@Override
	public void onAnswerChanged(Answer answer, View answerView) {
		if(answerView.getClass() == EditText.class) {
			EditText et = (EditText) answerView;
			AnswerCollector.addAnswer(answer, et.getText().toString());
		}
		else {
			AnswerCollector.addAnswer(answer);
		}
	}
	
}

package dk.itu.smdp.group19.surveyapp.parser;

import java.util.ArrayList;
import java.util.List;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;
import dk.itu.smdp.group19.surveyapp.parser.elements.Question;

public class DefaultAnswerChangeListener implements AnswerChangeListener {
	private Action callback;
	
	public DefaultAnswerChangeListener(Action callback) {
		this.callback = callback;
	}
	
	@Override
	public void onAnswerChanged(Answer answer, View answerView) {
		if(answerView.getClass() == EditText.class) {
			EditText et = (EditText) answerView;
			AnswerCollector.addAnswer(answer, et.getText().toString());
		}
		else if(answerView.getClass() == CheckBox.class) {
			CheckBox cb = (CheckBox) answerView;
			if(cb.isChecked()) {
				AnswerCollector.addAnswer(answer);
			}
			else {
				AnswerCollector.removeAnswer(answer);
			}
		}
		else if(answerView.getClass() == RadioButton.class) {
			AnswerCollector.removeAllAnswersFromQuestion(answer.getQuestionId());
			AnswerCollector.addAnswer(answer);
		}
		else {
			AnswerCollector.addAnswer(answer);
		}
		
		callback.doAction();
	}
	
}

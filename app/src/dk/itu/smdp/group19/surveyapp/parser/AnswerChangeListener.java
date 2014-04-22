package dk.itu.smdp.group19.surveyapp.parser;

import android.view.View;
import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;

/**
 * Interface for receiving an event when the user changes an answer to a question,
 * e.g. when selecting a check box.
 * For multi choice answers, {onAnswerChanged} will be called both when a check box
 * is checked and unchecked.
 * For single choice answers, it will be called only when a radio button is selected.
 * For free text answers, it will be called when the text in the text box is changed.
 * For free text answers inside choice answers, it will be called in any of these
 * scenarios.
 * @author per
 */
public interface AnswerChangeListener {
	public void onAnswerChanged(Answer answer, View answerView);
}

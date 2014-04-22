package dk.itu.smdp.group19.surveyapp.parser;

import java.util.Map;
import java.util.Map.Entry;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import dk.itu.smdp.group19.surveyapp.parser.elements.Page;
import dk.itu.smdp.group19.surveyapp.parser.elements.Question;

/**
 * Factory class for creating Android user controls (Views) for answers and answer groups.
 * @author per
 */
public class UserControlGenerator {
	private Context context;
	
	public UserControlGenerator(Context context) {
		this.context = context;
	}
	
	/**
	 * Creates a TextEdit view representing a free-text answer.
	 * @param hint The text of the answer.
	 * @param acl The event handler for when the answer is changed.
	 * @return A TextEdit instance.
	 */
	private EditText makeFreetextAnswer(String hint, final AnswerChangeListener acl) {
		final EditText et = new EditText(context);
		et.setHint(hint);
		et.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) { /* do nothing */ }
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) { /* do nothing */ }
			
			@Override
			public void afterTextChanged(Editable s) {
				acl.onAnswerChanged(et.getText().toString(), et);
			}
		});
		
		return et;
	}
	
	public ViewGroup makeFreetextAnswers(Map<String, Boolean> answers, final AnswerChangeListener acl) {
		LinearLayout ll = new LinearLayout(context);
		ll.setOrientation(LinearLayout.VERTICAL);
		LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		ll.setLayoutParams(lparams);
//		lparams.addRule(RelativeLayout.CENTER_VERTICAL); // center text box, i hope
		
		for(Entry<String, Boolean> answer : answers.entrySet()) {
			EditText et = makeFreetextAnswer(answer.getKey(), acl);
			ll.addView(et);
		}
		
		return ll;
	}
	
	/**
	 * Creates a multiple choice answer group where each answer may be a pre-defined answer or a free-text answer.
	 * @param answers A map of answers, where the key is the answer text and the value is a boolean denoting if it is free-text (true) or not (false).
	 * @param acl The event handler.
	 * @return A ViewGroup of the answers containing checkboxes.
	 */
	public ViewGroup makeMultiChoiceAnswers(Map<String, Boolean> answers, final AnswerChangeListener acl) {
		LinearLayout ll = new LinearLayout(context);
		ll.setOrientation(LinearLayout.VERTICAL);
		LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		ll.setLayoutParams(lparams);
//		lparams.addRule(RelativeLayout.CENTER_VERTICAL); // center text box, i hope
		
		for(Entry<String, Boolean> answer : answers.entrySet()) {
			final CheckBox cb = makeCheckBox(answer.getKey());
			ll.addView(cb);
			
			boolean isFreetext = answer.getValue();
			
			if(isFreetext) {
				// add textbox
				EditText et = makeFreetextAnswer("", acl);
				ll.addView(et);
				
				cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						acl.onAnswerChanged(cb.getText().toString(), cb);
					}
				});
			}
			else {
				cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						acl.onAnswerChanged(cb.getText().toString(), cb);
					}
				});
			}
		}
		
		return ll;
	}
	
	/**
	 * Creates a single choice answer group where each answer may be a pre-defined answer or a free-text answer.
	 * @param answers A map of answers, where the key is the answer text and the value is a boolean denoting if it is free-text (true) or not (false).
	 * @param acl The event handler.
	 * @return A ViewGroup of the answers containing radio buttons.
	 */
	public ViewGroup makeSingleChoiceAnswers(Map<String, Boolean> answers, final AnswerChangeListener acl) {
		LinearLayout ll = new LinearLayout(context);
		RadioGroup rg = new RadioGroup(context);
		
		for(Entry<String, Boolean> answer : answers.entrySet()) {
			final RadioButton rb = makeRadioButton(answer.getKey());
			rg.addView(rb);
			
			boolean isFreetext = answer.getValue();
			
			if(isFreetext) {
				// add textbox
				EditText et = makeFreetextAnswer("", acl);
				ll.addView(et);
				
				rb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						if(isChecked)
							acl.onAnswerChanged(rb.getText().toString(), rb);
					}
				});
			}
			else {
				rb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						if(isChecked)
							acl.onAnswerChanged(rb.getText().toString(), rb);
					}
				});
			}
		}
		
		return rg;
	}
	
	public View makeRuler(int color) {
		View ruler = new View(context);
		ruler.setBackgroundColor(color);
		ruler.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 2));
		
		return ruler;
	}
	
	public ViewGroup makePageHeader(Page page) {
		LinearLayout layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.VERTICAL);
		
		TextView pageTitle = new TextView(context);
		pageTitle.setText(page.getName());
		layout.addView(pageTitle);
		
		TextView pageDescription = new TextView(context);
		pageDescription.setText(page.getDescription());
		layout.addView(pageDescription);
		
		return layout;
	}
	
	public View makeQuestionHeader(Question question) {
		TextView questionName = new TextView(context);
		questionName.setText(question.getName());
		
		return questionName;
	}
	
	private CheckBox makeCheckBox(String text) {
		CheckBox cb = new CheckBox(context);
		cb.setText(text);
		return cb;
	}
	
	private RadioButton makeRadioButton(String text) {
		RadioButton rb = new RadioButton(context);
		rb.setText(text);
		return rb;
	}
}

package dk.itu.smdp.group19.surveyapp.parser;

import java.util.Map;
import java.util.Map.Entry;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;

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
	public EditText makeFreetextAnswer(String hint, final AnswerChangeListener acl) {
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
	
	/**
	 * Creates a multiple choice answer group where each answer may be a pre-defined answer or a free-text answer.
	 * @param answers A map of answers, where the key is the answer text and the value is a boolean denoting if it is free-text (true) or not (false).
	 * @param acl The event handler.
	 * @return A ViewGroup of the answers containing checkboxes.
	 */
	public ViewGroup makeMultiChoiceAnswers(Map<String, Boolean> answers, final AnswerChangeListener acl) {
		RelativeLayout ll = new RelativeLayout(context);
		RelativeLayout.LayoutParams lparams = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		lparams.addRule(RelativeLayout.CENTER_VERTICAL); // center text box, i hope
		
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

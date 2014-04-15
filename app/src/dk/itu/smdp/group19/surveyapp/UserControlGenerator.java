package dk.itu.smdp.group19.surveyapp;

import java.util.Map;
import java.util.Map.Entry;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class UserControlGenerator {
	private Context context;
	
	public UserControlGenerator(Context context) {
		this.context = context;
	}
	
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
	
	private CheckBox makeCheckBox(String text) {
		CheckBox cb = new CheckBox(context);
		cb.setText(text);
		return cb;
	}
	
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
	
	private RadioButton makeRadioButton(String text) {
		RadioButton rb = new RadioButton(context);
		rb.setText(text);
		return rb;
	}
}

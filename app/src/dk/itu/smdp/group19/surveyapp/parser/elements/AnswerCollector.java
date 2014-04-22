package dk.itu.smdp.group19.surveyapp.parser.elements;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Environment;

public class AnswerCollector {
	private static HashMap<Integer, ArrayList<String>> answers = new HashMap<Integer, ArrayList<String>>();
	
	public static void addAnswer(Answer answer) {
		String answerString = String.format("(%d) %s", answer.getId(), answer.getName());
		
		if(answers.containsKey(answer.getQuestionId())) {
			answers.get(answer.getQuestionId()).add(answerString);
		}
		else {
			ArrayList<String> list = new ArrayList<String>();
			list.add(answerString);
			answers.put(answer.getQuestionId(), list);
		}
	}
	
	public static void addAnswer(Answer answer, String value) {
		String answerString = String.format("(%d) %s", answer.getId(), value);
		
		if(answers.containsKey(answer.getQuestionId())) {
			answers.get(answer.getQuestionId()).add(answerString);
		}
		else {
			ArrayList<String> list = new ArrayList<String>();
			list.add(answerString);
			answers.put(answer.getQuestionId(), list);
		}
	}
	
	public static String getAnswersAsString() {
		String s = "";
		
		for(int questionId : answers.keySet()) {
			s += "Question " + questionId + ": ";
			
			Boolean first = true;
			for(String answer : answers.get(questionId)) {
				if(!first) {
					s += ", ";
				}
				
				s += answer;
				
				first = false;
			}
			
			s += "\n";
		}
		
		return s;
	}
}

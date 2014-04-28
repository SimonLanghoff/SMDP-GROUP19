package dk.itu.smdp.group19.surveyapp.parser;

import java.util.ArrayList;
import java.util.HashMap;

import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;

import android.os.Environment;

public class AnswerCollector {
	private static HashMap<Integer, ArrayList<AnswerCollectorEntry>> answers = new HashMap<Integer, ArrayList<AnswerCollectorEntry>>();
	
	public static void addAnswer(Answer answer) {
		String answerString = String.format("(%d) %s", answer.getId(), answer.getName());
		AnswerCollectorEntry entry = new AnswerCollectorEntry(answer.getId(), answerString);

		addEntry(answer.getQuestionId(), entry);
	}
	
	public static void addAnswer(Answer answer, String value) {
		String answerString = String.format("(%d) %s", answer.getId(), value);
		AnswerCollectorEntry entry = new AnswerCollectorEntry(answer.getId(), answerString);
		
		addEntry(answer.getQuestionId(), entry);
	}
	
	public static void removeAnswer(Answer answer) {
		ArrayList<AnswerCollectorEntry> list = answers.get(answer.getQuestionId());
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getAnswerId() == answer.getId()) {
				list.remove(i);
			}
		}
	}
	
	public static void removeAllAnswersFromQuestion(int questionId) {
		ArrayList<AnswerCollectorEntry> list = answers.get(questionId);
		if(list != null) {
			list.clear();
		}
	}
	
	private static void addEntry(int questionId, AnswerCollectorEntry entry) {
		if(answers.containsKey(questionId)) {
			ArrayList<AnswerCollectorEntry> list = answers.get(questionId);
			
			// TODO: is this safe? on remove, all elements at indices > i are moved 1 to the left, thus the element at i+1 (moved to i) will be skipped.
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getAnswerId() == entry.getAnswerId()) {
					list.remove(i);
				}
			}
//			for(AnswerCollectorEntry existingEntry : list) {
//				if(existingEntry.getAnswerId() == entry.getAnswerId()) {
//					list.remove(existingEntry);
//				}
//			}
			
			list.add(entry);
		}
		else {
			ArrayList<AnswerCollectorEntry> list = new ArrayList<AnswerCollectorEntry>();
			list.add(entry);
			answers.put(questionId, list);
		}
	}
	
	public static String getAnswersAsString() {
		String s = "";
		
		for(int questionId : answers.keySet()) {
			s += "Question " + questionId + ": ";
			
			Boolean first = true;
			for(AnswerCollectorEntry entry : answers.get(questionId)) {
				if(!first) {
					s += ", ";
				}
				
				s += entry;
				
				first = false;
			}
			
			s += "\n";
		}
		
		return s;
	}
}

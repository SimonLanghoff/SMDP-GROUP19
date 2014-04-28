package dk.itu.smdp.group19.surveyapp.parser;

import java.util.ArrayList;
import java.util.HashMap;

import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;

import android.os.Environment;

public class AnswerCollector {
	private static HashMap<Integer, ArrayList<AnswerCollectorEntry>> answers = new HashMap<Integer, ArrayList<AnswerCollectorEntry>>();
	
	/**
	 * Adds an answer to its associated question (identified by answer.getQuestionId())
	 * @param answer
	 */
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
	
	/***
	 * Removes an answer from its associated question (identified by answer.getQuestionId())
	 * @param answer
	 */
	public static void removeAnswer(Answer answer) {
		ArrayList<AnswerCollectorEntry> oldList = answers.get(answer.getQuestionId());
		ArrayList<AnswerCollectorEntry> newList = new ArrayList<AnswerCollectorEntry>();
		
		// add all answers that do not match the given ID to a new list
		for(AnswerCollectorEntry entry : oldList) {
			if(entry.getAnswerId() != answer.getId()) {
				newList.add(entry);
			}
		}
		
		answers.put(answer.getQuestionId(), newList);
	}
	
	public static void removeAllAnswersFromQuestion(int questionId) {
		answers.put(questionId, new ArrayList<AnswerCollectorEntry>());
	}
	
	private static void addEntry(int questionId, AnswerCollectorEntry entry) {
		if(answers.containsKey(questionId)) {
			ArrayList<AnswerCollectorEntry> oldList = answers.get(questionId);
			ArrayList<AnswerCollectorEntry> newList = new ArrayList<AnswerCollectorEntry>();
			
			// remove existing answer with same ID if it exists (to avoid duplicates)
			// this is done by adding all answers with a different ID to a new list
			for(AnswerCollectorEntry existingEntry : oldList) {
				if(existingEntry.getAnswerId() != entry.getAnswerId()) {
					newList.add(existingEntry);
				}
			}
			
			// add the new answer
			newList.add(entry);
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

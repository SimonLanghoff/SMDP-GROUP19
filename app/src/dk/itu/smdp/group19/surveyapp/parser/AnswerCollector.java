package dk.itu.smdp.group19.surveyapp.parser;

import java.util.ArrayList;
import java.util.HashMap;

import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;
import dk.itu.smdp.group19.surveyapp.parser.elements.Question;

public class AnswerCollector {
	// parameters: <questionId, List<Answer>>
	private static HashMap<Integer, ArrayList<AnswerCollectorEntry>> answers = new HashMap<Integer, ArrayList<AnswerCollectorEntry>>();
	private static HashMap<Integer, String> questions = new HashMap<Integer, String>();
	
	/**
	 * Adds an answer to its associated question (identified by answer.getQuestionId())
	 * @param answer
	 */
	public static void addAnswer(Answer answer) {
		String answerString = String.format("(%s) %s", answer.getId(), answer.getName());
		AnswerCollectorEntry entry = new AnswerCollectorEntry(answer.getId(), answerString);

		addEntry(answer.getQuestionId(), entry);
	}
	
	public static void addAnswer(Answer answer, String value) {
		String answerString = String.format("(%s) %s", answer.getId(), value);
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
	
	public static Boolean hasAnswer(int questionId) {
		return answers.get(questionId).size() > 0;
	}
	
	public static void addQuestion(int questionId, String questionName) {
		questions.put(questionId, questionName);
	}
	
	public static void addQuestion(Question question) {
		addQuestion(question.getId(), question.getName());
	}
	
	public static String getQuestionText(int questionId) {
		return questions.get(questionId);
	}
	
	public static String getAnswersAsString() {
		String s = "";
		
		for(int questionId : answers.keySet()) {
			s += "Question " + questionId + ": \"" + getQuestionText(questionId) + "\"";
			
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

package dk.itu.smdp.group19.surveyapp.parser;

import java.util.ArrayList;
import java.util.HashMap;

import dk.itu.smdp.group19.surveyapp.parser.elements.And;
import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;
import dk.itu.smdp.group19.surveyapp.parser.elements.AnswerRef;
import dk.itu.smdp.group19.surveyapp.parser.elements.Dependency;
import dk.itu.smdp.group19.surveyapp.parser.elements.Not;
import dk.itu.smdp.group19.surveyapp.parser.elements.Or;
import dk.itu.smdp.group19.surveyapp.parser.elements.Question;

public class AnswerCollector {
	// parameters: <questionId, List<Answer>>
	private static HashMap<Integer, ArrayList<AnswerCollectorEntry>> answers = new HashMap<Integer, ArrayList<AnswerCollectorEntry>>();
	private static HashMap<Integer, Question> questions = new HashMap<Integer, Question>();
	private static String recipient;
	
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
				if(!existingEntry.getAnswerId().equals(entry.getAnswerId())) {
					newList.add(existingEntry);
				}
			}
			
			// add the new answer
			newList.add(entry);
			answers.put(questionId, newList);
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
	
	public static void addQuestion(Question question) {
		questions.put(question.getId(), question);
	}
	
	public static String getQuestionText(int questionId) {
		return questions.get(questionId).getName();
	}

	public static boolean isDependencySatisfied(Dependency d) {
		if(d instanceof And) {
			And a = (And) d;
			return isDependencySatisfied(a.getLhs()) && isDependencySatisfied(a.getRhs());
		}
		else if(d instanceof Or) {
			Or o = (Or) d;
			return isDependencySatisfied(o.getLhs()) || isDependencySatisfied(o.getRhs());
		}
		else if(d instanceof Not) {
			Not n = (Not) d;
			return !isDependencySatisfied(n.getDependency());
		}
		else if(d instanceof AnswerRef) {
			AnswerRef ar = (AnswerRef) d;
			
			// look through the answers and see if it's there
			for(ArrayList<AnswerCollectorEntry> aList : answers.values()) {
				for(AnswerCollectorEntry ace : aList) {
					if(ace.getAnswerId().equals(ar.getId()))
						return true;
				}
			}
		}
		
		return false;
	}
	
	public static Boolean checkMandatoriesHaveAnswers() {
		for(Question question : questions.values()) {
			if(!question.isOptional()) {
				if(answers == null || !answers.containsKey(question.getId()) || answers.get(question.getId()) == null) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void setRecipient(String recipient) {
		AnswerCollector.recipient = recipient;
	}
	
	public static String getRecipient() {
		return AnswerCollector.recipient;
	}
	
	public static void purge() {
		AnswerCollector.recipient = "";
		AnswerCollector.answers = new HashMap<Integer, ArrayList<AnswerCollectorEntry>>();
		AnswerCollector.questions = new HashMap<Integer, Question>();
	}
	
	public static String getAnswersAsString() {
		String s = "";
		
		for(int questionId : answers.keySet()) {
			if(answers.get(questionId) != null && answers.get(questionId).size() > 0) {
				s+= String.format("Question: '%s'\nAnswers: ", getQuestionText(questionId));
				
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
		}
		
		return s;
	}
}

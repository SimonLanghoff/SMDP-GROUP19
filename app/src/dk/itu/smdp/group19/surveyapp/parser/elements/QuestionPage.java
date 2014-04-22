package dk.itu.smdp.group19.surveyapp.parser.elements;

import java.util.ArrayList;

public class QuestionPage extends Page {
	private ArrayList<Question> questions;
	
	public QuestionPage(String name, String description) {
		super(name, description);
		
		questions = new ArrayList<Question>();
	}
	
	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void addQuestion(Question question) {
		questions.add(question);
	}
}

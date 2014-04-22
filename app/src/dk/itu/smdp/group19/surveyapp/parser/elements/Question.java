package dk.itu.smdp.group19.surveyapp.parser.elements;

import java.util.ArrayList;

public class Question {
	private String name;
	private ArrayList<Answer> answers;
	
	public Question(String name) {
		this.name = name;
		this.answers = new ArrayList<Answer>();
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Answer> getAnswers() {
		return answers;
	}
	
	public void addAnswer(Answer answer) {
		answers.add(answer);
	}
}

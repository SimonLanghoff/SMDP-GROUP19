package dk.itu.smdp.group19.surveyapp.parser.elements;

import java.util.ArrayList;

public class Question {
	private int id;
	private String name;
	private QuestionType type;
	private ArrayList<Answer> answers;
	
	public Question(int id, String name, QuestionType type) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.answers = new ArrayList<Answer>();
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public QuestionType getType() {
		return type;
	}
	
	public ArrayList<Answer> getAnswers() {
		return answers;
	}
	
	public void addAnswer(Answer answer) {
		answers.add(answer);
	}
}

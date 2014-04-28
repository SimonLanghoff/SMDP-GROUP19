package dk.itu.smdp.group19.surveyapp.parser.elements;

import java.util.ArrayList;

public class Question {
	private int id;
	private String name;
	private QuestionType type;
	private Boolean isOptional;
	private ArrayList<Answer> answers;
	
	public Question(int id, String name, QuestionType type, Boolean isOptional) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.isOptional = isOptional;
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
	
	public Boolean isOptional() {
		return isOptional;
	}
	
	public ArrayList<Answer> getAnswers() {
		return answers;
	}
	
	public void addAnswer(Answer answer) {
		answers.add(answer);
	}
}

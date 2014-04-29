package dk.itu.smdp.group19.surveyapp.parser.elements;

import java.util.ArrayList;

import android.view.ViewGroup;

public class Question {
	private int id;
	private String name;
	private QuestionType type;
	private ArrayList<Answer> answers;
	private Dependency requires;
	private boolean optional;
	private ViewGroup answerViewGroup;
	
	public Question(int id, String name, QuestionType type, boolean optional) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.answers = new ArrayList<Answer>();
		this.optional = optional;
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
	
	public boolean isOptional() {
		return optional;
	}
	
	public void setRequires(Dependency dependency) {
		this.requires = dependency;
	}
	
	public Dependency getRequires() {
		return requires;
	}
	
	public ViewGroup getAnswerViewGroup() {
		return answerViewGroup;
	}
	
	public void setAnswerViewGroup(ViewGroup viewGroup) {
		this.answerViewGroup = viewGroup;
	}
}

package dk.itu.smdp.group19.surveyapp.parser.elements;

public class Answer {
	private String name;
	private AnswerType type;
	
	public Answer(String name, AnswerType type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	
	public Boolean isFreetext() {
		return type == AnswerType.FREETEXT;
	}
	
	public AnswerType getType() {
		return type;
	}
}

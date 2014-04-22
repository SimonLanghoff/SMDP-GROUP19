package dk.itu.smdp.group19.surveyapp.parser.elements;

public class Answer {
	private int id;
	private String name;
	private AnswerType type;
	
	public Answer(int answerId, int questionId, String name, AnswerType type) {
		this.id = answerId;
		this.name = name;
		this.type = type;
	}

	public int getId() {
		return id;
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

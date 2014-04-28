package dk.itu.smdp.group19.surveyapp.parser.elements;

public class Answer {
	private String id;
	private int questionId;
	private String name;
	private AnswerType type;
	
	public Answer(String answerId, int questionId, String name, AnswerType type) {
		this.id = answerId;
		this.questionId = questionId;
		this.name = name;
		this.type = type;
	}

	public String getId() {
		return id;
	}
	
	public int getQuestionId() {
		return questionId;
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

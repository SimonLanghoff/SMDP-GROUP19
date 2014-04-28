package dk.itu.smdp.group19.surveyapp.parser.elements;

public class AnswerRef extends Dependency {
	private String id;
	
	public AnswerRef(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}

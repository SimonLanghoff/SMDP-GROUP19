package dk.itu.smdp.group19.surveyapp.parser;

public class AnswerCollectorEntry {
	private String answerId;
	private String formattedString;
	
	public AnswerCollectorEntry(String answerId, String formattedString) {
		this.answerId = answerId;
		this.formattedString = formattedString;
	}
	
	public String getAnswerId() {
		return answerId;
	}
	
	public String getFormattedString() {
		return formattedString;
	}
	
	@Override
	public String toString() {
		return formattedString;
	}
}

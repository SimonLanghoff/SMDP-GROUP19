package dk.itu.smdp.group19.surveyapp.parser;

public class AnswerCollectorEntry {
	private int answerId;
	private String formattedString;
	
	public AnswerCollectorEntry(int answerId, String formattedString) {
		this.answerId = answerId;
		this.formattedString = formattedString;
	}
	
	public int getAnswerId() {
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

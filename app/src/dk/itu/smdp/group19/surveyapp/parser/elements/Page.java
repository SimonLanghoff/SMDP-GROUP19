package dk.itu.smdp.group19.surveyapp.parser.elements;

public class Page {
	private String name;
	private String description;
	
	public Page(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

}

package dk.itu.smdp.group19.surveyapp.parser.elements;

public abstract class Dependency {
	private Dependency parent;
	
	public void setParent(Dependency d) {
		this.parent = d;
	}
	
	public Dependency getParent() {
		return parent;
	}
}

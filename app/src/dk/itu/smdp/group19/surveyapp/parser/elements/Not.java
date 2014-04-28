package dk.itu.smdp.group19.surveyapp.parser.elements;

public class Not extends Dependency {
	private Dependency dependency;
	
	public Not() {
		this(null);
	}
	
	public Not(Dependency dependency) {
		this.dependency = dependency;
	}
	
	public Dependency getDependency() {
		return dependency;
	}
	
	public void setDependency(Dependency d) {
		this.dependency = d;
	}
}

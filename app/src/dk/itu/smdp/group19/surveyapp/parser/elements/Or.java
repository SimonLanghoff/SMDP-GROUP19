package dk.itu.smdp.group19.surveyapp.parser.elements;

public class Or extends Expression {
	public Or() {
		super(null, null);
	}
	
	public Or(Dependency lhs, Dependency rhs) {
		super(lhs, rhs);
	}
}

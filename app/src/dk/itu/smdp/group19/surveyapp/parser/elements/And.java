package dk.itu.smdp.group19.surveyapp.parser.elements;

public class And extends Expression {
	public And() {
		super(null, null);
	}
	
	public And(Dependency lhs, Dependency rhs) {
		super(lhs, rhs);
	}
}

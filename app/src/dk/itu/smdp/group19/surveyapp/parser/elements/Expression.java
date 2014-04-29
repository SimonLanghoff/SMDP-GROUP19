package dk.itu.smdp.group19.surveyapp.parser.elements;

import java.util.ArrayList;

public abstract class Expression extends Dependency {
	private Dependency lhs;
	private Dependency rhs;
	
	public Expression(Dependency lhs, Dependency rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public Dependency getLhs() {
		return lhs;
	}
	
	public void setLhs(Dependency lhs) {
		this.lhs = lhs;
	}
	
	public Dependency getRhs() {
		return rhs;
	}
	
	public void setRhs(Dependency rhs) {
		this.rhs = rhs;
	}
}

package edu.umn.grounder.constraint;


public class NotEqual extends AbstractConstraint {
	public NotEqual(Comparable lhs, Comparable rhs) {
		super(lhs, rhs);
		this.setOperator("!=");
	}
	
	public boolean isSatisfied() {
		if (this.getLhs().getCurrentValue() != this.getRhs().getCurrentValue()) {
			return true;
		} else {
			return false;
		}
	}
}

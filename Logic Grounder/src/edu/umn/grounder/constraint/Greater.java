package edu.umn.grounder.constraint;


public class Greater extends AbstractConstraint {
	public Greater(Comparable lhs, Comparable rhs) {
		super(lhs, rhs);
		this.setOperator(">");
	}
	
	public boolean isSatisfied() {
		if (this.getLhs().getCurrentValue() > this.getRhs().getCurrentValue()) {
			return true;
		} else {
			return false;
		}
	}
}

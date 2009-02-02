package edu.umn.grounder.constraint;

public class Greater extends AbstractConstraint {

	public boolean isSatisfied() {
		if (this.getVariable().getNextValue() > this.getNumber()) {
			return true;
		} else {
			return false;
		}
	}

}

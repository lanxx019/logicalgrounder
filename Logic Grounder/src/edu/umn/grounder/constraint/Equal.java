package edu.umn.grounder.constraint;

public class Equal extends AbstractConstraint {

	public boolean isSatisfied() {
		if (this.getVariable().getCurrentValue() == this.getNumber()) {
			return true;
		} else {
			return false;
		}
	}

}
package edu.umn.grounder.constraint;

import edu.umn.grounder.instance.Variable;

public abstract class AbstractConstraint implements Constraint {
	private int number;
	private Variable variable;
	
	public AbstractConstraint() {
		this.number = -1;
		this.variable = null;
	}
	
	public AbstractConstraint(int number, Variable variable) {
		this.number = number;
		this.variable = variable;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Variable getVariable() {
		return this.variable;
	}
	
	public void setVariable(Variable variable) {
		this.variable = variable;
	}
}

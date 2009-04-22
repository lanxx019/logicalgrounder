package edu.umn.grounder.constraint;


public abstract class AbstractConstraint implements Constraint {
	private Comparable lhs;
	private Comparable rhs;
	private String operator;
	
	public AbstractConstraint() {
		this.lhs = null;
		this.rhs = null;
		this.operator = null;
	}
	
	public AbstractConstraint(Comparable lhs, Comparable rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public Comparable getLhs() {
		return this.lhs;
	}
	
	public void setLhs(Comparable lhs) {
		this.lhs = lhs;
	}
	
	public Comparable getRhs() {
		return this.rhs;
	}
	
	public void setRhs(Comparable variable) {
		this.rhs = variable;
	}
	
	public String getOperator() {
		return this.operator;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String toString() {
		return lhs.toString() + " " + this.getOperator() + " " + rhs.toString();
	}
}

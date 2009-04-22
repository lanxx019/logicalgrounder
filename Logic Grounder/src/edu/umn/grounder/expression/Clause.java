package edu.umn.grounder.expression;

import java.util.ArrayList;
import java.util.List;

import edu.umn.grounder.constraint.Constraint;
import edu.umn.grounder.instance.Variable;

public class Clause implements Node {
	private List<Literal> literals;
	private List<Variable> variables;
	private List<Constraint> constraints;
	
	public Clause() {
		this.literals = new ArrayList<Literal>();
		this.variables = new ArrayList<Variable>();
		this.constraints = new ArrayList<Constraint>();
	}
	
	public void addLiteral(Literal literal) {
		this.literals.add(literal);
	}
	
	public void addVariable(Variable variable) {
		this.variables.add(variable);
	}
	
	public void addConstraint(Constraint constraint) {
		this.constraints.add(constraint);
	}
	
	public List<Variable> getVariables() {
		return this.variables;
	}
	
	public boolean areConstraintsSatisfied() {
		boolean result = true;
		for (Constraint constraint : this.constraints) {
			if (!constraint.isSatisfied()) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public boolean updateVariables() {
		for (int i = 0; i < this.variables.size(); i++) {
			Variable variable = this.variables.get(i);
			if (variable.hasNextValue()) {
				variable.updateValue();
				for (int j = 0; j < i; j++) {
					this.variables.get(j).initValue();
				}
				return true;
			}
		}
		return false;
	}
	
	public void initVariables() {
		for (Variable var : this.variables) {
			var.initValue();
		}
	}
	
	public String getCurrentValueString() {
		String result = "";
		int count = 1;
		for (Literal literal : this.literals) {
			if (count == this.literals.size()) {
				result += literal.getCurrentValueString();
			} else {
				result += literal.getCurrentValueString() + " ";
			}
			count++;
		}
		return result;
	}
	
	public String toFDClause() {
		String result = "";
		do {
			if (this.areConstraintsSatisfied()) {
				for (Literal literal : this.literals) {
					result += literal.getCurrentValueString() + " ";
				}
				result += "0\n";
			}
		} while (this.updateVariables());
		this.initVariables();
		return result;
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < this.literals.size(); i++) {
			if (i == (this.literals.size() - 1)) {
				result += this.literals.get(i).toString();
			} else {
				result += this.literals.get(i).toString() + ", ";
			}
		}
		return result;
	}
}

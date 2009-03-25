package edu.umn.grounder.expression;

import java.util.ArrayList;
import java.util.List;

import edu.umn.grounder.constraint.Constraint;
import edu.umn.grounder.instance.Variable;

public class Theory {
	private List<Clause> clauses;
	private List<Variable> variables;
	private List<Constraint> constraints;
	
	public Theory() {
		this.clauses = new ArrayList<Clause>();
		this.variables = new ArrayList<Variable>();
		this.constraints = new ArrayList<Constraint>();
	}
	
	public void addClause(Clause clause) {
		this.clauses.add(clause);
	}
	
	public void addVariable(Variable variable) {
		this.variables.add(variable);
	}
	
	public void addConstraint(Constraint constraint) {
		this.constraints.add(constraint);
	}
	
	public boolean updateVariable() {
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
	
	@Deprecated
	public String getCurrentValueString() {
		String result = "";
		int count = 1;
		for (Clause clause : this.clauses) {
			if (count == this.clauses.size()) {
				result += clause.getCurrentValueString();
			} else {
				result += clause.getCurrentValueString() + " ";
			}
			count++;
		}
		return result + " 0";
	}
	
	public boolean areConstraintsSatisfied() {
		for (Constraint constraint : this.constraints) {
			if (!constraint.isSatisfied()) {
				return false;
			}
		}
		return true;
	}
	
	public void initVariables() {
		for (Variable var : this.variables) {
			var.initValue();
		}
	}
	
	public String toHBTheory() {
		String result = "";
		for (int i = 0; i < this.clauses.size(); i++) {
			if (i == (this.clauses.size() - 1)) {
				result += this.clauses.get(i).toString();
			} else {
				result += this.clauses.get(i).toString() + "; ";
			}
		}
		result += ". ";
		
		for (int i = 0; i < this.constraints.size(); i++) {
			if (i == (this.constraints.size() - 1)) {
				result += this.constraints.get(i).toString();
			} else {
				result += this.constraints.get(i).toString() + ", ";
			}
		}
		return result;
	}
	
	public String toFDTheory() {
		String result = "";
		for (Clause clause : this.clauses) {
			do {
				if (this.areConstraintsSatisfied()) {
					result += clause.getCurrentValueString() + " 0 \n";
				}
			} while (this.updateVariable());
			this.initVariables();
		}
		return result;
	}
	
	public String toString() {
		return this.toHBTheory() + "\n\n" + this.toFDTheory();
	}
}

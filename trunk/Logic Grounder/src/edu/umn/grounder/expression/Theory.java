package edu.umn.grounder.expression;

import java.util.ArrayList;
import java.util.List;

import edu.umn.grounder.instance.Variable;

public class Theory implements Node {
	private List<Clause> clauses;
	private List<Variable> variables;
	
	public Theory() {
		this.clauses = new ArrayList<Clause>();
		this.variables = new ArrayList<Variable>();
	}
	
	public void addClause(Clause clause) {
		this.clauses.add(clause);
	}
	
	public void addVariable(Variable variable) {
		this.variables.add(variable);
	}
	
	public boolean hasNextValue() {
		for (Variable variable : this.variables) {
			if (variable.hasNextValue()) {
				return true;
			}
		}
		return false;
	}
	
	public void updateVariable() {
		for (int i = 0; i < this.variables.size(); i++) {
			Variable variable = this.variables.get(i);
			if (variable.hasNextValue()) {
				for (int j = 0; j < i; j++) {
					this.variables.get(j).initValue();
				}
				variable.updateValue();
			}
		}
	}
	
	public String getCurrentValue() {
		String result = "{";
		int count = 1;
		for (Clause clause : this.clauses) {
			if (count == this.clauses.size()) {
				result += clause.getCurrentValue();
			} else {
				result += clause.getCurrentValue() + ", ";
			}
			count++;
		}
		return result + "}";
	}
}

package edu.umn.grounder.expression;

import java.util.ArrayList;
import java.util.List;

import edu.umn.grounder.instance.Variable;

public class Theory implements Node {
	private List<Clause> clauses;
	private List<Variable> variables;
	
	public Theory() {
		this.clauses = new ArrayList<Clause>();
	}
	
	public void addClause(Clause clause) {
		this.clauses.add(clause);
	}
	
	public void addVariable(Variable variable) {
		this.variables.add(variable);
	}
	
	public boolean updateVariable() {
		boolean update = false;
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
		return update;
	}
	
	public String getCurrentValue() {
		String result = "{";
		int count = 0;
		for (Clause clause : this.clauses) {
			if (count == this.clauses.size()) {
				result += clause.getCurrentValue();
			} else {
				result += clause.getCurrentValue() + ", ";
			}
		}
		return result + "}";
	}
}

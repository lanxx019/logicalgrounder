package edu.umn.grounder.expression;

import java.util.ArrayList;
import java.util.List;

import edu.umn.grounder.instance.Variable;

public class Clause implements Node {
	private List<Literal> literals;
	private List<Variable> variables;
	
	public Clause() {
		this.literals = new ArrayList<Literal>();
		this.variables = new ArrayList<Variable>();
	}
	
	public void addLiteral(Literal literal) {
		this.literals.add(literal);
	}
	
	public void addVariable(Variable variable) {
		this.variables.add(variable);
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

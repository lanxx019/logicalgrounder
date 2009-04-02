package edu.umn.grounder.expression;

import java.util.ArrayList;
import java.util.List;

import edu.umn.grounder.constraint.Constraint;

public class Theory {
	private List<Clause> clauses;
	
	public Theory() {
		this.clauses = new ArrayList<Clause>();
	}
	
	public void addClause(Clause clause) {
		this.clauses.add(clause);
	}
	
	public void addGlobalConstraint(Constraint constraint) {
		for (Clause clause : this.clauses) {
			clause.addConstraint(constraint);
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
		return result;
	}
	
	public String toFDTheory() {
		String result = "";
		for (Clause clause : this.clauses) {
			result += clause.toFDClause();
		}
		return result;
	}
	
	public String toString() {
		return this.toHBTheory() + "\n\n" + this.toFDTheory();
	}
}

package edu.umn.grounder.expression;

import java.util.ArrayList;
import java.util.List;

public class Clause implements Node {
	private List<Literal> literals;
	
	public Clause() {
		this.literals = new ArrayList<Literal>();
	}
	
	public void addLiteral(Literal literal) {
		this.literals.add(literal);
	}
	
	public String getCurrentValue() {
		String result = "{";
		int count = 0;
		for (Literal literal : this.literals) {
			if (count == this.literals.size()) {
				result += literal.getCurrentValue();
			} else {
				result += literal.getCurrentValue() + ", ";
			}
		}
		return result + "}";
	}
}

package edu.umn.grounder;

import edu.umn.grounder.core.*;
import edu.umn.grounder.expression.Clause;
import edu.umn.grounder.expression.Literal;
import edu.umn.grounder.expression.Theory;
import edu.umn.grounder.instance.ConstantFunctionInstance;
import edu.umn.grounder.instance.Variable;

public class Test {

	public static void main(String[] args) {
		Language lan = new Language();
		
		// sorts: S.
		Sort s = new Sort("S");
		lan.addSortContainer(s);
		
		// objects:
		// S: a, b, c.
		ObjectFunction a = new ObjectFunction("a", s);
		s.addObjectTermContainer(a);
		lan.addObjectTermContainer(a);
		
		ObjectFunction b = new ObjectFunction("b", s);
		s.addObjectTermContainer(b);
		lan.addObjectTermContainer(b);
		
		ObjectFunction c = new ObjectFunction("c", s);
		s.addObjectTermContainer(c);
		lan.addObjectTermContainer(c);
		
		// variables:
		// S: v, u, w.
		Variable v = new Variable("v", s);
		lan.addVariable(v);
		Variable u = new Variable("u", s);
		lan.addVariable(u);
		Variable w = new Variable("w", s);
		lan.addVariable(w);
		
		// constants:
		// S: f(S);
		// S: g.		
		ConstantFunction f = new ConstantFunction("f", s);
		f.addArgument(s);
		lan.addConstantTermContainer(f);
		
		ConstantFunction g = new ConstantFunction("g", s);
		lan.addConstantTermContainer(g);
		lan.init();
		
		System.out.println(lan.toString());
		
		ConstantFunctionInstance f_w = new ConstantFunctionInstance(f);
		f_w.addArgument(w);
		Literal first = new Literal(f_w, v);
		ConstantFunctionInstance g_ = new ConstantFunctionInstance(g);
		Literal second = new Literal(g_, u);
		Clause clause_1 = new Clause();
		clause_1.addLiteral(first);
		Clause clause_2 = new Clause();
		clause_2.addLiteral(second);
		Theory t = new Theory();
		t.addClause(clause_1);
		t.addClause(clause_2);
		t.addVariable(u);
		t.addVariable(v);
		t.addVariable(w);
		while (t.hasNextValue()) {
			System.out.println(t.getCurrentValue());
			t.updateVariable();
		}
	}

}

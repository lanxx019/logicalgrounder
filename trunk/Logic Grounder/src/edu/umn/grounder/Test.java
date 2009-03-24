package edu.umn.grounder;

import edu.umn.grounder.core.*;
import edu.umn.grounder.expression.Clause;
import edu.umn.grounder.expression.Literal;
import edu.umn.grounder.expression.Theory;
import edu.umn.grounder.instance.ConstantFunctionInstance;
import edu.umn.grounder.instance.Variable;

public class Test {

	public static void main(String[] args) {
		LogicContext lan = new LogicContext();
		
		// sorts: S.
		Sort s = new Sort("S");
		lan.addSort(s);
		
		// objects:
		// S: a, b, c.
		ObjectFunction a = new ObjectFunction("a", s);
		s.addObjectTermCollection(a);
		lan.addObjectTermCollection(a);
		
		ObjectFunction b = new ObjectFunction("b", s);
		s.addObjectTermCollection(b);
		lan.addObjectTermCollection(b);
		
		ObjectFunction c = new ObjectFunction("c", s);
		s.addObjectTermCollection(c);
		lan.addObjectTermCollection(c);
		
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
		lan.addConstantTermCollection(f);
		
		ConstantFunction g = new ConstantFunction("g", s);
		lan.addConstantTermCollection(g);
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
		do {
			System.out.println(t.getCurrentValueString());
		} while (t.updateVariable());
	}

}

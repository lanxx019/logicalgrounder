package edu.umn.grounder;

import edu.umn.grounder.core.*;

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
		System.out.println(s.getSize());
	}

}

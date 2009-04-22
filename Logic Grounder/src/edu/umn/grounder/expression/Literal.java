package edu.umn.grounder.expression;

import edu.umn.grounder.instance.ConstantFunctionInstance;
import edu.umn.grounder.instance.Instance;

public class Literal implements Node {
	private ConstantFunctionInstance lhs;
	private Instance rhs;
	private boolean sign;
	
	public Literal(ConstantFunctionInstance lhs, Instance rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
		this.sign = true;
	}
	
	public Literal(ConstantFunctionInstance lhs, Instance rhs, boolean sign) {
		this(lhs, rhs);
		this.sign = sign;
	}
	
	public void negate() {
		this.sign = !this.sign;
	}
	
	public String getCurrentValueString() {
		if (this.sign) {
			return lhs.getCurrentValue() + "=" + rhs.getCurrentValue();
		} else {
			return lhs.getCurrentValue() + "!=" + rhs.getCurrentValue();
		}
	}
	
	public String toString(){
		if (this.sign) {
			return lhs.toString() + " = " + rhs.toString();
		} else {
			return lhs.toString() + " != " + rhs.toString();
		}
	}
}

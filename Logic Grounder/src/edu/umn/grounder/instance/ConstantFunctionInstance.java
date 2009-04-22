package edu.umn.grounder.instance;

import edu.umn.grounder.core.ConstantFunction;
import edu.umn.grounder.core.IConstantTermCollection;

public class ConstantFunctionInstance extends AbstractFunctionInstance{
	public ConstantFunctionInstance(ConstantFunction function) {
		super(function);
	}
	
	public ConstantFunctionInstance(IConstantTermCollection function) {
		this((ConstantFunction)function);
	}
}

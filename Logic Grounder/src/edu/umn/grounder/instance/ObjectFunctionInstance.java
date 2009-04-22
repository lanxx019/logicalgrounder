package edu.umn.grounder.instance;

import edu.umn.grounder.core.IObjectTermCollection;
import edu.umn.grounder.core.ObjectFunction;

public class ObjectFunctionInstance extends AbstractFunctionInstance {
	public ObjectFunctionInstance(ObjectFunction function) {
		super(function);
	}
	
	public ObjectFunctionInstance(IObjectTermCollection function) {
		this((ObjectFunction)function);
	}
}

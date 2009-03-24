package edu.umn.grounder.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConstantFunction extends AbstractFunction implements IConstantTermCollection {
	private static Logger log = LoggerFactory.getLogger(ConstantFunction.class);
	
	public ConstantFunction() {
		super();
	}
	
	public ConstantFunction(String name) {
		super(name);
		log.debug("Creating constant function: " + this.getName());
	}
	
	public ConstantFunction(String name, Sort sortType) {
		super(name, sortType);
	}
	
	public String getConstantTerm(int index) {
		return this.getTerm(index);
	}
}

package edu.umn.grounder.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectFunction extends AbstractFunction implements ObjectTermContainer {
	private static Logger log = LoggerFactory.getLogger(ObjectFunction.class);
	
	public String getObjectTerm(int index) {
		return this.getTerm(index);
	}
}

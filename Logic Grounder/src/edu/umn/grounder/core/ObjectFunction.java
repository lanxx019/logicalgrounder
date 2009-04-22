package edu.umn.grounder.core;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.umn.grounder.LogicContext;

public class ObjectFunction extends AbstractFunction implements IObjectTermCollection {
	private List<String> argumentNameList = new ArrayList<String>();
	private static Logger log = LoggerFactory.getLogger(ObjectFunction.class);
	
	public ObjectFunction() {
		super();
	}
	
	public ObjectFunction(String name) {
		super(name);
		log.debug("Creating object function: " + this.getName());
	}
	
	public ObjectFunction(String name, Sort sortType) {
		super(name, sortType);
	}
	
	public String getObjectTerm(int index) {
		return this.getTerm(index);
	}
	
	public void recordArgumentName(String name) {
		this.argumentNameList.add(name);
		log.debug(String.format("Adding %s to %s's argument list", name, this.getName()));
	}
	
	public List<String> getArgumentNameList() {
		return this.argumentNameList;
		
	}
	public void init(LogicContext language) {
		for (String name : this.argumentNameList) {
			this.addArgument(language.getSort(name));
		}
	}
}

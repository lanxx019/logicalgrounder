package edu.umn.grounder.instance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.umn.grounder.core.AbstractSort;
import edu.umn.grounder.core.Sort;

public class Variable implements Instance {
	private String name;
	private AbstractSort sortType;
	private int currentValue;
	private static Logger log = LoggerFactory.getLogger(Variable.class);
	
	public Variable() {
		this.name = null;
		this.sortType = null;
		this.currentValue = 0;
	}
	
	public Variable(String name) {
		this();
		this.name = name;
		log.debug("Creating variable: " + this.name);
	}
	
	public Variable(String name, Sort sortType) {
		this(name);
		this.sortType = sortType;
	}
	
	public String getName() {
		return this.name;
	}

	public AbstractSort getSortType() {
		return this.sortType;
	}
	
	public void setSortType(AbstractSort sortType) {
		this.sortType = sortType;
	}
	
	public void updateValue() {
		if (!this.hasNextValue()) {
			throw new RuntimeException(this.name + ": value out of range.");
		}
		this.currentValue++;
	}
	
	public boolean hasNextValue() {
		if (this.currentValue < this.sortType.getSize() - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void initValue() {
		this.currentValue = 0;
	}
	
	public String toString() {
		return this.name;
	}

	public int getCurrentValue() {
		return this.currentValue;
	}
}

package edu.umn.grounder.instance;

import edu.umn.grounder.core.Sort;

public class Variable implements Instance {
	private String name;
	private Sort sortType;
	private int currentValue;
	
	public Variable() {
		this.name = null;
		this.sortType = null;
		this.currentValue = 0;
	}
	
	public Variable(String name) {
		this();
		this.name = name;
	}
	
	public Variable(String name, Sort sortType) {
		this(name);
		this.sortType = sortType;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sort getSortType() {
		return this.sortType;
	}
	
	public void setSortType(Sort sortType) {
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
		return this.sortType.getName() + ": " + this.name;
	}

	public int getCurrentValue() {
		return this.currentValue;
	}
}

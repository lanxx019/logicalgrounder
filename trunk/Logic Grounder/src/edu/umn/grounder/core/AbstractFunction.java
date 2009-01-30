package edu.umn.grounder.core;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFunction implements TermCollection {
	private String name;
	private int size;
	private int base;
	private Sort sortType;
	private List<Sort> arguments;
	
	public AbstractFunction() {
		this.name = null;
		this.size = 0;
		this.base = -1;
		this.sortType = null;
		this.arguments = new ArrayList<Sort>();
	}
	
	public AbstractFunction(String name, Sort sortType) {
		this.name = name;
		this.size = 0;
		this.base = -1;
		this.sortType = sortType;
		this.arguments = new ArrayList<Sort>();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		if (this.size < 1 ) {
			this.size = this.calculateSize();
		}
		return this.size;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getBase() {
		return this.base;
	}
	
	public void setSortType(Sort sortType) {
		this.sortType = sortType;
	}
	
	public Sort getSortType() {
		return this.sortType;
	}
	
	public void addArgument(Sort arg) {
		this.arguments.add(arg);
	}
	
	public Sort getArgument(int index) {
		return this.arguments.get(index);
	}
	
	public int calculateSize() {
		int size = 1;
		for (Sort sort : this.arguments) {
				size *= sort.getSize();
		}
		return size;
	}
	
	public boolean dependsOn(Sort sort) {
		for (Sort s : this.arguments) {
			if (s == sort) {
				return true;
			}
		}
		return false;
	}
	
	public String getTerm(int index) {
		if (this.arguments.size() == 0) {
			if (index == this.getBase()) {
			return this.getName();
			} else {
				return null;
			}
		} else {
			String result = this.getName() + "(";
			int quot = index;
			int rem = 0;
			for (int i = 0; i < this.arguments.size(); i++) {
				Sort sort = this.arguments.get(i);
				int temp = quot;
				rem = sort.getSize();
				quot = temp / rem;
				rem = temp % rem;
				if (i == (this.arguments.size() - 1)) {
					result += sort.getObjectTerm(rem);
				} else {
					result += sort.getObjectTerm(rem) + ", ";
				}
			}
			return result + ")";
		}
	}
}

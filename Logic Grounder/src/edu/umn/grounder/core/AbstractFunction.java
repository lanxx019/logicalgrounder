package edu.umn.grounder.core;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractFunction implements TermCollection {
	private String name;
	private int size;
	private int base;
	private Sort sortType;
	private List<SortContainer> arguments;
	private static Logger log = LoggerFactory.getLogger(AbstractFunction.class);
	
	public AbstractFunction() {
		this.name = null;
		this.size = 0;
		this.base = -1;
		this.sortType = null;
		this.arguments = new ArrayList<SortContainer>();
	}
	
	public AbstractFunction(String name) {
		this();
		this.name = name;
	}
	
	public AbstractFunction(String name, Sort sortType) {
		this();
		this.name = name;
		this.sortType = sortType;
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
		if (this.base < 0) {
			AbstractFunction.log.debug("Function " + this.getName() + "'s base value is -1.");
		}
		return this.base;
	}
	
	public void setSortType(Sort sortType) {
		this.sortType = sortType;
	}
	
	public Sort getSortType() {
		return this.sortType;
	}
	
	public void addArgument(SortContainer arg) {
		this.arguments.add(arg);
	}
	
	public SortContainer getArgument(int index) {
		return this.arguments.get(index);
	}
	
	public int calculateSize() {
		int size = 1;
		for (SortContainer sort : this.arguments) {
				size *= sort.getSize();
		}
		return size;
	}
	
	public boolean dependsOn(Sort sort) {
		for (SortContainer s : this.arguments) {
			if (s == sort) {
				return true;
			}
		}
		return false;
	}
	
	public String getTerm(int index) {
		if (!this.isLegalIndex(index)) {
			return null;
		} else {
			if (this.size == 1) {
				return this.name;
			} else {
				String result = this.getName() + "(";
				int quot = index;
				int rem = 0;
				for (int i = 0; i < this.arguments.size(); i++) {
					SortContainer sort = this.arguments.get(i);
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
	
	public String getTerm(int[] indexes) {
		// TODO
		return null;
	}
	
	public boolean isLegalIndex(int index) {
		int min = this.getBase();
		int max = this.getBase() + this.getSize();
		if (index >= min && index < max) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String result = this.name;
		if (this.arguments.size() != 0) {
			int count = 1;
			result += "(";
			for (SortContainer container : this.arguments) {
				if (count < this.arguments.size()) {
					result += container.getName() + ",";
				} else {
					result += container.getName();
				}
				count++;
			}
		}
		return result;
	}
}

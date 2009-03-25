package edu.umn.grounder.core;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFunction extends AbstractTermCollection {
	private List<AbstractSort> arguments;
	
	public AbstractFunction() {
		this.setName(null);
		this.setSize(0);
		this.setBase(-1);
		this.setSortType(null);
		this.arguments = new ArrayList<AbstractSort>();
	}
	
	public AbstractFunction(String name) {
		this();
		this.setName(name);
	}
	
	public AbstractFunction(String name, Sort sortType) {
		this(name);
		this.setSortType(sortType);
	}
	
	public void addArgument(AbstractSort arg) {
		this.arguments.add(arg);
	}
	
	public AbstractSort getArgument(int index) {
		return this.arguments.get(index);
	}
	
	public int getNumberOfArguments() {
		return this.arguments.size();
	}
	
	public int calculateSize() {
		int size = 1;
		for (AbstractSort sort : this.arguments) {
				size *= sort.getSize();
		}
		return size;
	}
	
	public boolean dependsOn(AbstractSort sort) {
		for (AbstractSort s : this.arguments) {
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
			if (this.getSize() == 1) {
				return this.getName();
			} else {
				String result = this.getName() + "(";
				int quot = index;
				int rem = 0;
				for (int i = 0; i < this.arguments.size(); i++) {
					AbstractSort sort = this.arguments.get(i);
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
	
	public int getTermIndex(int[] indexes) {
		if (indexes.length != this.arguments.size()) {
			throw new RuntimeException(this.getName() + ": wrong numbers of arguments.");
		}
		if (this.arguments.size() == 0) {
			return this.getBase();
		} else {
			int index = 0;
			int base = 1;
			for (int i = this.arguments.size() - 1; i >= 0; i--) {
				if (!this.arguments.get(i).isValidIndex(indexes[i])) {
					throw new RuntimeException(this.getName() + ": accepting an illegal argument " + indexes[i]);
				}
				index += indexes[i] * base;
				base *= this.arguments.get(i).getSize();
			}
			index += this.getBase();
			if (index < this.getBase() || index >= this.getBase() + this.getSize()) {
				throw new RuntimeException(this.getName() + " returns a impossible value.");
			}
			return index;
		}
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
		String result = this.getName();
		if (this.arguments.size() != 0) {
			int count = 1;
			result += "(";
			for (AbstractSort container : this.arguments) {
				if (count < this.arguments.size()) {
					result += container.getName() + ", ";
				} else {
					result += container.getName();
				}
				count++;
			}
			result += ")";
		}
		return result;
	}
}

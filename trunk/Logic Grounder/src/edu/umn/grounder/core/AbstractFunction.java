package edu.umn.grounder.core;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFunction implements TermCollection {
	private List<Sort> arguments;
	
	public AbstractFunction() {
		this.arguments = new ArrayList<Sort>();
	}
	
	public AbstractFunction(String name, Sort sortType) {
		//super(name, sortType);
		this.arguments = new ArrayList<Sort>();
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

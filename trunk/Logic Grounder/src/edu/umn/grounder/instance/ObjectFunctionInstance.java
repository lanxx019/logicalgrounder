package edu.umn.grounder.instance;

import java.util.ArrayList;
import java.util.List;

import edu.umn.grounder.core.ObjectFunction;
import edu.umn.grounder.core.SortContainer;

public class ObjectFunctionInstance implements Instance {
	private ObjectFunction function;
	private List<Instance> arguments;

	public ObjectFunctionInstance(ObjectFunction function) {
		this.function = function;
		this.arguments = new ArrayList<Instance>();
	}
	
	public void setObjectFunction(ObjectFunction function) {
		this.function = function;
	}
	
	public ObjectFunction getObjectFunction() {
		return this.function;
	}
	
	public void addArgument(Instance arg) {
		if (this.function.getNumberOfArguments() == 0) {
			throw new RuntimeException(this.function.getName() + " doesn't take arguments.");
		} else if (this.function.getArgument(this.arguments.size()) != this.getSortType()) {
			throw new RuntimeException(this.function.getName() + ": wrong type of argument.");
		} else {
			this.arguments.add(arg);
		}
	}
	
	public SortContainer getSortType() {
		return this.function.getSortType();
	}
	
	public int getCurrentValue() {
		int[] temp = new int[this.arguments.size()];
		int count = 0;
		for (Instance instance : this.arguments) {
			temp[count] = instance.getCurrentValue();
			count++;
		}
		return this.function.getTermIndex(temp);
	}
	
	public String toString() {
		String result = this.function.getName();
		if (this.arguments.size() != 0) {
			int count = 1;
			result += "(";
			for (Instance instance : this.arguments) {
				if (count < this.arguments.size()) {
					result += instance.getName() + ",";
				} else {
					result += instance.getName();
				}
				count++;
			}
			result += ")";
		}
		return result;
	}

	public String getName() {
		return this.toString();
	}

	public void setName(String name) {
		
	}
}

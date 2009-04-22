package edu.umn.grounder.instance;

import java.util.ArrayList;
import java.util.List;

import edu.umn.grounder.core.AbstractFunction;
import edu.umn.grounder.core.AbstractSort;

public class AbstractFunctionInstance implements Instance {
	private AbstractFunction function;
	private List<Instance> arguments = new ArrayList<Instance>();

	public AbstractFunctionInstance() {
		this.function = null;
	}
	
	public AbstractFunctionInstance(AbstractFunction function) {
		this.function = function;
	}
	
	public void setFunction(AbstractFunction function) {
		this.function = function;
	}
	
	public AbstractFunction getFunction() {
		return this.function;
	}
	
	public void addArgument(Instance arg) {
		if (this.function.getNumberOfArguments() == 0) {
			throw new RuntimeException(this.function.getName() + " doesn't take arguments.");
		} else if (this.function.getArgument(this.arguments.size()) != arg.getSortType()) {
			throw new RuntimeException(this.function.getName() + ": wrong type of argument.");
		} else {
			this.arguments.add(arg);
		}
	}
	
	public AbstractSort getSortType() {
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
					result += instance.getName() + ", ";
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
}

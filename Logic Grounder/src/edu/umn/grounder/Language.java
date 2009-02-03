package edu.umn.grounder;

import java.util.HashMap;
import java.util.Map;

import edu.umn.grounder.core.*;

public class Language {
	private Map<String, SortContainer> sorts;
	private Map<String, ObjectTermContainer> objectTermContainers;
	private Map<String, Variable> variables;
	private Map<String, ConstantTermContainer> ConstantTermContainers;

	public Language() {
		this.sorts = new HashMap<String, SortContainer>();
		this.objectTermContainers = new HashMap<String, ObjectTermContainer>();
		this.variables = new HashMap<String, Variable>();
		this.ConstantTermContainers = new HashMap<String, ConstantTermContainer>();
	}

	public void addSortContainer(SortContainer container) {
		this.sorts.put(container.getName(), container);
	}

	public SortContainer getSortContainer(String containerName) {
		if (this.sorts.containsKey(containerName)) {
			return this.sorts.get(containerName);
		} else {
			return null;
		}
	}

	public void addObjectTermContainer(ObjectTermContainer container) {
		this.objectTermContainers.put(container.getName(), container);
	}

	public ObjectTermContainer getObjectTermContainer(String containerName) {
		if (this.objectTermContainers.containsKey(containerName)) {
			return this.objectTermContainers.get(containerName);
		} else {
			return null;
		}
	}

	public void addVariable(Variable variable) {
		this.variables.put(variable.getName(), variable);
	}

	public Variable getVariable(String variableName) {
		if (this.variables.containsKey(variableName)) {
			return this.variables.get(variableName);
		} else {
			return null;
		}
	}

	public void addConstantTermContainer(ConstantTermContainer container) {
		this.ConstantTermContainers.put(container.getName(), container);
	}

	public ConstantTermContainer getConstantTermContainer(String containerName) {
		if (this.ConstantTermContainers.containsKey(containerName)) {
			return this.ConstantTermContainers.get(containerName);
		} else {
			return null;
		}
	}

	public void init() {
		for (SortContainer container : this.sorts.values()) {
			try {
				container.init();
			} catch (FinitenessCheckFailedException e) {
				throw new RuntimeException(container.getName()
						+ ": fail the finiteness check.");
			}
		}
	}

	public String toString() {
		// Sorts
		int count = 1;
		String result = "Sorts: ";
		for (SortContainer sort : this.sorts.values()) {
			result += sort.getName();
			if (count == this.sorts.size()) {
				result += ".\n";
			} else {
				result += ",";
			}
			count++;
		}
		result += "\n";
		
		// Objects
		result += "Objects: \n";
		count = 1;
		for (SortContainer sort : this.sorts.values()) {
			result += sort.toString();
			if (count == this.sorts.size()) {
				result += ".\n";
			} else {
				result += ";\n";
			}
			count++;
		}
		result += "\n";
		
		// Variables
		result += "Variables: \n";
		count = 1;
		for (Variable variable : this.variables.values()) {
			result += variable.toString();
			if (count == this.variables.size()) {
				result += ".\n";
			} else {
				result += ";\n";
			}
			count++;
		}
		result += "\n";
		
		// Constants
		result += "Constants: \n";
		count = 1;
		for (ConstantTermContainer container : this.ConstantTermContainers
				.values()) {
			result += ((ConstantFunction) container).getSortType().getName() + ": "
					+ container.toString();
			if (count == this.ConstantTermContainers.size()) {
				result += ".\n";
			} else {
				result += ";\n";
			}
			count++;
		}

		return result;
	}
}

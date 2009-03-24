package edu.umn.grounder;

import java.util.LinkedHashMap;
import java.util.Map;

import edu.umn.grounder.core.*;
import edu.umn.grounder.expression.Theory;
import edu.umn.grounder.instance.Variable;

public class LogicContext {
	private Map<String, AbstractSort> sorts;
	private Map<String, IObjectTermCollection> objects;
	private Map<String, Variable> variables;
	private Map<String, IConstantTermCollection> constants;
	private Theory theory;
	
	public LogicContext() {
		this.sorts = new LinkedHashMap<String, AbstractSort>();
		this.objects = new LinkedHashMap<String, IObjectTermCollection>();
		this.variables = new LinkedHashMap<String, Variable>();
		this.constants = new LinkedHashMap<String, IConstantTermCollection>();
		this.theory = new Theory();
	}

	public void addSort(AbstractSort sort) {
		if (this.hasRecorded(sort.getName())) {
			this.sorts.put(sort.getName(), sort);
		}
	}

	public AbstractSort getSort(String sortName) {
		if (this.sorts.containsKey(sortName)) {
			return this.sorts.get(sortName);
		} else {
			return null;
		}
	}
	
	public boolean hasSort(String sortName) {
		return (this.sorts.containsKey(sortName)) && (this.sorts.get(sortName) != null);
	}
	
	public void recordSortName(String sortName) {
		if (!this.hasRecorded(sortName)) {
			this.sorts.put(sortName, null);
		}
	}
	
	public boolean hasRecorded(String sortName) {
		return this.sorts.containsKey(sortName);
	}
	
	public void addObjectTermCollection(IObjectTermCollection collection) {
		this.objects.put(collection.getName(), collection);
	}

	public IObjectTermCollection getObjectTermCollection(String containerName) {
		if (this.objects.containsKey(containerName)) {
			return this.objects.get(containerName);
		} else {
			return null;
		}
	}
	
	public boolean hasObjectTermCollection(String name) {
		if (this.objects.containsKey(name)) {
			return true;
		} else {
			return false;
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
	
	public boolean hasVariable(String variableName) {
		return this.variables.containsKey(variableName);
	}

	public void addConstantTermCollection(IConstantTermCollection container) {
		this.constants.put(((AbstractCoreEntity) container).getName(), container);
	}

	public IConstantTermCollection getConstantTermCollection(String containerName) {
		if (this.constants.containsKey(containerName)) {
			return this.constants.get(containerName);
		} else {
			return null;
		}
	}
	
	public boolean hasConstantTermCollection(String name) {
		return this.constants.containsKey(name);
	}
	
	public Theory getTheory() {
		return theory;
	}

	public void setTheory(Theory theory) {
		this.theory = theory;
	}

	public void init() {
		// Init all the sort containers.
		for (AbstractSort sort : this.sorts.values()) {
			try {
				sort.init(this);
			} catch (FinitenessCheckFailedException e) {
				throw new RuntimeException(sort.getName()
						+ ": fail the finiteness check.");
			}
		}
		// Update the base value for all ConstantTermContainer
		int base = 1;
		for (IConstantTermCollection constant : this.constants.values()) {
			if (constant instanceof AbstractTermCollection) {
				((AbstractTermCollection)constant).setBase(base);
				base += ((AbstractCoreEntity) constant).getSize();
			}
		}
	}

	public String toString() {
		// Sorts
		int count = 1;
		String result = "Sorts: ";
		for (AbstractSort sort : this.sorts.values()) {
			result += sort.getName();
			if (count == this.sorts.size()) {
				result += ".\n";
			} else {
				result += ", ";
			}
			count++;
		}
		result += "\n";
		
		// Objects
		result += "Objects: \n";
		count = 1;
		for (AbstractSort sort : this.sorts.values()) {
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
			result += variable.getSortType().getName() + ": " + variable.toString();
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
		for (IConstantTermCollection container : this.constants
				.values()) {
			result += ((ConstantFunction) container).getSortType().getName() + ": "
					+ container.toString();
			if (count == this.constants.size()) {
				result += ".\n";
			} else {
				result += ";\n";
			}
			count++;
		}
		result += "\n";
		
		// Theory
		result += this.theory.toString();
		
		return result;
	}
}

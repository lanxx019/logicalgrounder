package edu.umn.grounder;

import java.util.HashMap;
import java.util.Map;

import edu.umn.grounder.core.*;

public class Language {
	private Map<String, SortContainer>sorts;
	private Map<String, ObjectTermContainer>objectTermContainers;
	private Map<String, Variable>variables;
	private Map<String, ConstantTermContainer>ConstantTermContainers;
	
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
}

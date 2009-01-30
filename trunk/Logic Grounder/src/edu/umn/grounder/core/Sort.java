package edu.umn.grounder.core;

import java.util.HashMap;
import java.util.Map;

public class Sort implements SortContainer, ObjectTermCollection {
	private String name;
	private int size;
	private Map<String, ObjectTermCollection> containers;
	
	public Sort(String name) {
		this.name = name;
		this.size = 0;
		this.containers = new HashMap<String, ObjectTermCollection>();
	}
	
	public String getName() {
		return this.name;
	}

	public int getSize() {
		if (this.size == 0) {
			this.size = this.calculateSize();
		}
		return this.size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void addObjectTermContainer(ObjectTermCollection container) {
		if (!(container instanceof TermCollection)) {
			throw new RuntimeException("Sort can only contain TermCollection: " + this.name);
		}
		((TermCollection)container).setSortType(this);
		this.containers.put(container.getName(), container);
	}
	
	public ObjectTermCollection getObjectTermContainer(String name) {
		return this.containers.get(name);
	}
	
	public boolean hasObjectTermContainer(String containerName) {
		return this.containers.containsKey(containerName);
	}
	
	public boolean hasObjectTermContainer(ObjectTermCollection container) {
		return this.containers.containsValue(container);
	}
	
	public void init() throws FinitenessCheckFailedException {
		// Check dependency graph and make sure there is no cycle.
		if (this.dependsOn(this)) {
			throw new FinitenessCheckFailedException(this);
		}
		
		// Call calculateSize() for each Container and calculate the size.
		this.setSize(this.calculateSize());
		
		// Update the startIndex for each Container.
		int base = 0;
		for (ObjectTermCollection container : this.containers.values()) {
			((TermCollection)container).setBase(base);
			base += container.getSize();
		}
	}
	
	public String getObjectTerm(int index) {
		return null;
	}

	public int calculateSize() {
		int size = 0;
		for (Container container : this.containers.values()) {
			size += container.getSize();
		}
		return size;
	}

	public boolean dependsOn(Sort sort) {
		for (Container container : this.containers.values()) {
			if (container.dependsOn(sort)) {
				return true;
			}
		}
		return false;
	}
}

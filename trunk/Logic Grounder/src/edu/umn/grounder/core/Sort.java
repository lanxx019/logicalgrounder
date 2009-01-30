package edu.umn.grounder.core;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sort implements SortContainer, ObjectTermContainer {
	private String name;
	private int size;
	private Map<String, ObjectTermContainer> containers;
	private static Logger log = LoggerFactory.getLogger(Sort.class);

	public Sort(String name) {
		this.name = name;
		this.size = 0;
		this.containers = new HashMap<String, ObjectTermContainer>();
		Sort.log.debug("Create Sort: " + this.name);
	}

	public String getName() {
		return this.name;
	}

	public int getSize() {
		if (this.size == 0) {
			this.size = this.calculateSize();
			Sort.log.debug("The size is: " + this.size);
		}
		return this.size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void addObjectTermContainer(ObjectTermContainer container) {
		if (!(container instanceof TermCollection)) {
			throw new RuntimeException(
					"Trying to add a non TermCollection object:"
							+ container.getName() + " into Sort " + this.name);
		}
		((TermCollection) container).setSortType(this);
		this.containers.put(container.getName(), container);
	}

	public ObjectTermContainer getObjectTermContainer(String name) {
		return this.containers.get(name);
	}

	public boolean hasObjectTermContainer(String containerName) {
		return this.containers.containsKey(containerName);
	}

	public boolean hasObjectTermContainer(ObjectTermContainer container) {
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
		for (ObjectTermContainer container : this.containers.values()) {
			((TermCollection) container).setBase(base);
			base += container.getSize();
		}
	}

	public String getObjectTerm(int index) {
		// TODO How to get ObjectTerm from Sort?
		String result = null;
		for (ObjectTermContainer container : this.containers.values()) {
			if ((result = container.getObjectTerm(index)) != null) {
				return result;
			}
		}
		return result;
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

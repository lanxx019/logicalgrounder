package edu.umn.grounder.core;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.umn.grounder.LogicContext;


public class Sort extends AbstractSort {
	private Map<String, IObjectTermCollection> collections;
	private static Logger log = LoggerFactory.getLogger(Sort.class);

	public Sort(String name) {
		this.setName(name);
		this.setSize(0);
		this.collections = new LinkedHashMap<String, IObjectTermCollection>();
		log.debug("Creating sort: " + this.getName());
	}

	public void addObjectTermCollection(IObjectTermCollection collection) {
		if (!(collection instanceof AbstractTermCollection)) {
			throw new RuntimeException(
					"Trying to add a non TermCollection object:"
							+ collection.getName() + " into Sort " + this.getName());
		}
		collection.setSortType(this);
		this.collections.put(collection.getName(), collection);
	}

	public void addObjectTermCollections(List<IObjectTermCollection> collections) {
		for (IObjectTermCollection collection : collections) {
			this.addObjectTermCollection(collection);
		}
	}
	
	public IObjectTermCollection getObjectTermCollection(String name) {
		return this.collections.get(name);
	}

	public boolean hasObjectTermCollection(String collectionName) {
		return this.collections.containsKey(collectionName);
	}
	
	public boolean hasObjectTermCollection(IObjectTermContainer collection) {
		return this.collections.containsValue(collection);
	}

	public void init(LogicContext language) throws FinitenessCheckFailedException {
		// Init all object term collections
		for (IObjectTermCollection collection : this.collections.values()) {
			collection.init(language);
		}
		
		// Check dependency graph and make sure there is no cycle.
		if (this.dependsOn(this)) {
			throw new FinitenessCheckFailedException(this);
		}

		// Call calculateSize() for each Container and calculate the size.
		this.setSize(this.calculateSize());

		// Update the base for each Container.
		int base = 0;
		for (IObjectTermCollection collection : this.collections.values()) {
			collection.setBase(base);
			base += collection.getSize();
		}
	}

	public String getObjectTerm(int index) {
		// TODO How to get ObjectTerm from Sort?
		String result = null;
		for (IObjectTermCollection collection : this.collections.values()) {
			if ((result = collection.getObjectTerm(index)) != null) {
				return result;
			}
		}
		return result;
	}

	public int calculateSize() {
		int size = 0;
		for (IObjectTermContainer collection : this.collections.values()) {
			size += collection.getSize();
		}
		return size;
	}

	public boolean dependsOn(AbstractSort sort) {
		for (IObjectTermContainer collection : this.collections.values()) {
			if (collection.dependsOn(sort)) {
				return true;
			}
		}
		return false;
	}
	
	public int getNumberOfContainers() {
		return this.collections.size();
	}
	
	public String toString() {
		String result = this.getName() + ": ";
		int count = 0;
		for (IObjectTermContainer container : this.collections.values()) {
			count++;
			if (count < this.collections.size()) {
				result += container.toString() + ", ";
			} else {
				result += container.toString();
			}
		}
		return result;	
	}

	public boolean isValidIndex(int index) {
		if (index >= 0 && index < this.getSize()) {
			return true;
		} else {
			return false;
		}
	}
}

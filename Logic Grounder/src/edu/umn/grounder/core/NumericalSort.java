package edu.umn.grounder.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumericalSort implements SortContainer {
	private String name;
	private int first;
	private int last;
	private int size;
	private static Logger log = LoggerFactory.getLogger(NumericalSort.class);

	public NumericalSort() {
		this.name = null;
		this.first = -1;
		this.last = -1;
		this.size = 0;
	}
	
	public NumericalSort(String name) {
		this();
		this.name = name;
	}
	
	public NumericalSort(String name, int first, int last) {
		this(name);
		if (last < first) {
			throw new RuntimeException(this.name + ": illegal range.");
		}
		this.first = first;
		this.last = last;
	}
	
	public void init() throws FinitenessCheckFailedException {
		
	}

	public int calculateSize() {
		return last - first + 1;
	}

	public boolean dependsOn(Sort sort) {
		return false;
	}

	public int getSize() {
		if (this.size == 0) {
			this.size = this.calculateSize();
		}
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjectTerm(int index) {
		return Integer.toString(this.first + index - 1);
	}

	public String toString() {
		return this.name + this.first + "..." + this.last;
	}

	public boolean isValidIndex(int index) {
		if (index >= 0 && index < this.getSize()) {
			return true;
		} else {
			return false;
		}
	}
}

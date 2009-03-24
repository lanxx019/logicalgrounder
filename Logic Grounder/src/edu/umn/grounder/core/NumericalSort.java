package edu.umn.grounder.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.umn.grounder.LogicContext;

public class NumericalSort extends AbstractSort {
	private int first;
	private int last;
	private static Logger log = LoggerFactory.getLogger(ObjectFunction.class);

	public NumericalSort() {
		this.setName(null);
		this.setSize(0);
		this.first = -1;
		this.last = -1;
	}
	
	public NumericalSort(String name) {
		this();
		this.setName(name);
	}
	
	public NumericalSort(String name, int first, int last) {
		this(name);
		if (last < first) {
			throw new RuntimeException(this.getName() + ": illegal range.");
		}
		this.first = first;
		this.last = last;
		log.debug("Creating numerical sort: " + this.getName());
	}
	
	public void init(LogicContext language) throws FinitenessCheckFailedException {
		this.setSize(this.calculateSize());
	}

	public int calculateSize() {
		return last - first + 1;
	}

	public boolean dependsOn(AbstractSort sort) {
		return false;
	}

	public String getObjectTerm(int index) {
		return Integer.toString(this.first + index - 1);
	}

	public String toString() {
		return this.getName() + ": " + this.first + "..." + this.last;
	}

	public boolean isValidIndex(int index) {
		if (index >= 0 && index < this.getSize()) {
			return true;
		} else {
			return false;
		}
	}
}

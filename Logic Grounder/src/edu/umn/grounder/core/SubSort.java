package edu.umn.grounder.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubSort implements ObjectTermContainer, TermCollection {
	private String name;
	private int size;
	private int base;
	private Sort sortType;
	private Sort sort;
	private static Logger log = LoggerFactory.getLogger(SubSort.class);

	public SubSort() {
		this.name = null;
		this.size = 0;
		this.base = -1;
		this.sortType = null;
		this.sort = null;
	}
	
	public SubSort(Sort sort) {
		this();
		this.sort = sort;
		this.name = "SubSort(" + this.sort.getName() + ")";
	}

	public int getSize() {
		if (this.size < 1) {
			this.size = this.sort.getSize();
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

	public int getBase() {
		if (this.base < 0) {
			
		}
		return this.base;
	}

	public Sort getSortType() {
		return this.sortType;
	}

	public void setBase(int base) {
		this.base = base;	
	}

	public void setSortType(Sort sortType) {
		this.sortType = sortType;
	}
	
	public String getObjectTerm(int index) {
		// TODO Need to varify if this is correct.
		return this.sort.getObjectTerm(index - this.base);
	}

	public int calculateSize() {
		return this.sort.getSize();
	}

	public boolean dependsOn(Sort sort) {
		if (sort == this.sort)
			return true;
		else
			return false;
	}
}

package edu.umn.grounder.core;

import edu.umn.grounder.LogicContext;

public class SubSort extends AbstractTermCollection implements IObjectTermCollection {
	private Sort sort;

	public SubSort() {
		this.setName(null);
		this.setSize(0);
		this.setBase(-1);
		this.setSortType(null);
		this.sort = null;
	}
	
	public SubSort(Sort sort) {
		this();
		this.sort = sort;
		this.setName("SubSort(" + this.sort.getName() + ")");
	}
	
	public String getObjectTerm(int index) {
		// TODO Need to verify if this is correct.
		return this.sort.getObjectTerm(index - this.getBase());
	}

	public int calculateSize() {
		return this.sort.getSize();
	}

	public boolean dependsOn(AbstractSort sort) {
		if (sort == this.sort)
			return true;
		else
			return false;
	}
	
	public void init(LogicContext language) {
		
	}
}

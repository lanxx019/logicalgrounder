package edu.umn.grounder.core;

public abstract class AbstractTermCollection extends AbstractCoreEntity implements ITermCollection {
	private int base;
	private AbstractSort sortType;
	
	public int getBase() {
		return this.base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public AbstractSort getSortType() {
		return sortType;
	}
	
	public void setSortType(AbstractSort sortType) {
		this.sortType = sortType;
	}
}

package edu.umn.grounder.core;

public interface ITermCollection extends ICoreEntity {
	public int getBase();
	public void setBase(int base);
	public AbstractSort getSortType();
	public void setSortType(AbstractSort sortType);
}

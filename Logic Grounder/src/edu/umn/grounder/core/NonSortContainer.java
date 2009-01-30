package edu.umn.grounder.core;

public interface NonSortContainer extends Container {
	
	public void setBase(int startIndex);
	
	public int getBase();
	
	public void setSortType(Sort sortType);
	
	public Sort getSortType();
}

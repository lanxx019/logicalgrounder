package edu.umn.grounder.core;

public interface TermCollection extends Container {
	
	public void setBase(int base);
	
	public int getBase();
	
	public void setSortType(Sort sortType);
	
	public Sort getSortType();
}

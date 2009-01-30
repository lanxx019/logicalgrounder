package edu.umn.grounder.core;

public interface Container {	
	public String getName();
	
	public void setName(String name);
	
	public void setSize(int size);
	
	public int getSize();
	
	public abstract int calculateSize();
	
	public abstract boolean dependsOn(Sort sort);
}

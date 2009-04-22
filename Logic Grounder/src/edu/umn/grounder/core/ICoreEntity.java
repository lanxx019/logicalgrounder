package edu.umn.grounder.core;

public interface ICoreEntity {
	public void setName(String name);
	public String getName();
	public int getSize();
	public void setSize(int size);
	public int calculateSize();
	public boolean dependsOn(AbstractSort sort);
}

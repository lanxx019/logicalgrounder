package edu.umn.grounder.core;

public interface SortContainer extends Container, ObjectTermContainer {
	
	public abstract void init() throws FinitenessCheckFailedException;
	
	public boolean isValidIndex(int index);
}

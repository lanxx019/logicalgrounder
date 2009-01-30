package edu.umn.grounder.core;

public class FinitenessCheckFailedException extends Exception {
	private static final long serialVersionUID = 1L;

	public FinitenessCheckFailedException() {
		super();
	}
	
	public FinitenessCheckFailedException(Sort sort) {
		super("Sort " + sort.getName() + "contains loop dependency.");
	}
}

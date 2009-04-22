package edu.umn.grounder.constraint;


public class IntegerComparable implements Comparable {
	private int value;

	public IntegerComparable(int value) {
		this.value = value;
	}
	
	public IntegerComparable(String value) {
		this.value = Integer.parseInt(value);
	}
	
	@Override
	public int getCurrentValue() {
		return this.value;
	}
	
	public String toString() {
		return String.valueOf(this.value);
	}
}

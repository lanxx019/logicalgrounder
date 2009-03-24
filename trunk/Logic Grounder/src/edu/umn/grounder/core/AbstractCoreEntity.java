package edu.umn.grounder.core;


public abstract class AbstractCoreEntity implements ICoreEntity {
	private String name;
	private int size;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSize() {
		if (this.size == 0) {
			this.setSize(this.calculateSize());
		}
		return this.size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
}

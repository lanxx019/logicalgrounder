package edu.umn.grounder.core;

public interface Container extends Component {

	public void setSize(int size);
	
	public int getSize();
	
	public abstract int calculateSize();
	
	public abstract boolean dependsOn(Sort sort);
}

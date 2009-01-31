package edu.umn.grounder.core;

public abstract class LanguageComponent {
	String name;
	
	public LanguageComponent() {
		this.name = "";
	}
	
	public LanguageComponent(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

package com.anidis.logical.lemda.sampledata;

public class Activity {
	private String name;

	public Activity(String name) {
		super();
		this.name = name;
	}

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Activity [name=" + name + "]";
	}
	

	
}

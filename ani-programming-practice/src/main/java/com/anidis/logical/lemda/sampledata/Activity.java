package com.anidis.logical.lemda.sampledata;

import java.util.List;

public class Activity {
	private String name;
	private List<String> hobby;

	public Activity(String name) {
		super();
		this.name = name;
	}

	public Activity(String name, List<String> hobby) {
		super();
		this.name = name;
		this.hobby = hobby;
	}

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "Activity [name=" + name + "]";
//	}
//	

	
}

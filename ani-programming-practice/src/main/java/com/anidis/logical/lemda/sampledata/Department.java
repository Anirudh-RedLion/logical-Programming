package com.anidis.logical.lemda.sampledata;

import java.util.List;

public class Department {
	
	private String departName;
	
	private List<String> location;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String departName, List<String> location) {
		super();
		this.departName = departName;
		this.location = location;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}
	
	

}

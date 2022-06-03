package com.anidis.logical.lemda;

// 10:41
public class Student {

	private int grade;
	private String name;
	private Integer id;
	private String group;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int grade, String name, Integer id, String group) {
		super();
		this.grade = grade;
		this.name = name;
		this.id = id;
		this.group = group;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}

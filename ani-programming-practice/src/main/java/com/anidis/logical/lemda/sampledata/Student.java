package com.anidis.logical.lemda.sampledata;

import java.util.List;

// 10:41
public class Student {

	private int grade;
	private String name;
	private Integer id;
	private String group;
	private List<Activity> activity;
	private List<Department> department;

	public Student(int grade, String name, Integer id, String group, List<Activity> activity,
			List<Department> department) {
		super();
		this.grade = grade;
		this.name = name;
		this.id = id;
		this.group = group;
		this.activity = activity;
		this.department = department;
	}

	public Student(int grade, String name, Integer id, String group, List<Activity> activity) {
		super();
		this.grade = grade;
		this.name = name;
		this.id = id;
		this.group = group;
		this.activity = activity;
	}

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

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public List<Activity> getActivity() {
		return activity;
	}

	public void setActivity(List<Activity> activity) {
		this.activity = activity;
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

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", name=" + name + ", id=" + id + ", group=" + group + "]";
	}

}

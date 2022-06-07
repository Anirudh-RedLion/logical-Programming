package com.anidis.logical.lemda.sampledata;

import java.util.ArrayList;
import java.util.List;

public class Functional_Java8 {

	public static List<Student> getAllStudents() {

		// Basic way to insertion
		List<Student> studentList = new ArrayList<>();
		studentList.add(
				new Student(3, "Pankaj Gup", 12344, "IT", createActivity("AI", "Manufacturing"), createDepatment("IT","Delhi","Lucknow")));
		studentList.add(new Student(5, "Ram Ji", 44444, "CS", createActivity("Java", "HTML"),createDepatment("CS","Kolkata","Kochi")));
		studentList.add(new Student(2, "Sham JI", 33334, "EE", createActivity("c++", "C"),createDepatment("EE","Gujrat","UP")));
		studentList.add(new Student(7, "Ghan Shayam", 2222, "ME", createActivity("Python", "Djongo"),createDepatment("ME","Delhi","UP")));

		return studentList;

	}

	private static List<Department> createDepatment(String departName, String... names) {
		// TODO Auto-generated method stub

		List<Department> departments = new ArrayList<>();
		departments.add(new Department(departName, List.of(names)));
		return departments;
	}

	private static List<Activity> createActivity(String... names) {
		// TODO Auto-generated method stub

		List<Activity> activities = new ArrayList<>();
		for (String name : names) {
			activities.add(new Activity(name));
		}
		return activities;

	}

}

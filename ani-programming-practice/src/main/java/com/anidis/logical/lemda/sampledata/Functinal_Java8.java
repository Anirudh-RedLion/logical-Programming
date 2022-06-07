package com.anidis.logical.lemda.sampledata;

import java.util.ArrayList;
import java.util.List;

public class Functinal_Java8 {

	public static List<Student> getAllStudents() {

		// Basic way to insertion
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(3, "Pankaj Gup", 12344, "IT",getActivity("AI","Manufacturing")));
		studentList.add(new Student(5, "Ram Ji", 44444, "CS",getActivity("Java","HTML")));
		studentList.add(new Student(2, "Sham JI", 33334, "IT",getActivity("c++","C")));
		studentList.add(new Student(7, "Ghan Shayam", 2222, "ME",getActivity("Python","Djongo")));

		return studentList;

	}

	private static List<Activity> getActivity(String... names) {
		// TODO Auto-generated method stub

		List<Activity> activities = new ArrayList<>();
		for (String name : names) {
			activities.add(new Activity(name));
		}
		return activities;

	}

}

package com.anidis.logical.lemda.sampledata;

import java.util.ArrayList;
import java.util.List;

public class Functinal_Java8 {

	public static List<Student> getAllStudents() {

		// Basic way to insertion
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(3, "Pankaj Gup", 12344, "IT"));
		studentList.add(new Student(5, "Ram Ji", 44444, "CS"));
		studentList.add(new Student(2, "Sham JI", 33334, "IT"));
		studentList.add(new Student(7, "Ghan Shayam", 2222, "ME"));

		return studentList;

	}

}

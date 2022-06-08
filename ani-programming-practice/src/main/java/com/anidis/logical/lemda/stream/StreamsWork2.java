package com.anidis.logical.lemda.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.anidis.logical.lemda.sampledata.Functional_Java8;
import com.anidis.logical.lemda.sampledata.Student;

public class StreamsWork2 {

	private static List<Student> students = Functional_Java8.getAllStudents();

	public static void main(String args[]) {

		System.out.println("===== Filter & To map");
		System.out.println("- Case 2: ");

		Map<String, Student> studentDetail5Gpa = students.stream().filter(s -> s.getGrade() >= 5)
				.collect(Collectors.toMap(Student::getName, Function.identity()));

		// Display
		for (Map.Entry<String, Student> entryset : studentDetail5Gpa.entrySet()) {
			System.out.println(entryset.getKey() + " | " + entryset.getValue());
		}

		// Display 2 - by stream for each
		System.out.println("---- Display 2--------");
		studentDetail5Gpa.forEach((key, value) -> {
			System.out.println(key + "||" + value);
		});

		// 12:53
		System.out.println("Case 3: ");
		List<Student> grade5Students = students.stream().filter(s -> s.getGrade() >= 5).collect(Collectors.toList());

		System.out.println(grade5Students);

		// All Match 12:22
		System.out.println("============ All Match ==============");
		boolean is5PlusGrade = students.stream().allMatch(s -> s.getGrade() >= 5);
		System.out.println(is5PlusGrade);
		// Any Match

		is5PlusGrade = students.stream().allMatch(s -> s.getGrade() >= 5);
		System.out.println(is5PlusGrade);

		// Non Match

		// Find First

		// Find any

		// custome Sort

	}

}

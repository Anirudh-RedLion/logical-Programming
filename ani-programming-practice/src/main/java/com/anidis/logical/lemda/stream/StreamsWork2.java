package com.anidis.logical.lemda.stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.anidis.logical.lemda.sampledata.Activity;
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
		is5PlusGrade = students.stream().anyMatch(s -> s.getGrade() >= 5);
		System.out.println(is5PlusGrade);

		// Non Match
		is5PlusGrade = students.stream().noneMatch(s -> s.getGrade() >= 5);
		System.out.println(is5PlusGrade);

		System.out.println("================= Find First & Find Any ===========");
		
		// Find First
		Optional<Student> stu = students.stream().filter(s -> s.getGrade() > 3).findFirst();
		if (stu.isPresent()) {
			System.out.println("Find First : " + stu.get());
		}		
		
		
		// Find Any no diffrence found , both reponse same
		 stu = students.stream().filter(s -> s.getGrade() > 3).findAny();
		if (stu.isPresent()) {
			System.out.println("Find Any : " + stu.get());
		}		
		
		
		// custome Sort
		
		
//		Consumer<T>
		
		System.out.println("==============6 Aug==================");

		List<Student> shortedStudentByGrade = students.stream().filter(s -> s.getGrade() > 2)
				.collect(Collectors.toList());

		System.out.println("Output 11 >> " + shortedStudentByGrade);

		Map<String, List<String>> shortedStudentByGrade1 = students.stream().filter(s -> s.getGrade() > 2)
//.map(Student::getActivity)
//.flatMap(List::stream)
				.collect(Collectors.toMap(Student::getName,
						a -> a.getActivity().stream().map(aa -> aa.getName()).collect(Collectors.toList())));

		System.out.println(" ====== out 22 >> ");

		shortedStudentByGrade1.entrySet().stream().forEach(s -> {
			System.out.println("Key = " + s.getKey());

			System.out.println(" Value :: " + s.getValue());
		});

	}

}

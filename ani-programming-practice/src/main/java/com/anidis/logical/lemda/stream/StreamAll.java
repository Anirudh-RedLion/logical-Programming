package com.anidis.logical.lemda.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.anidis.logical.lemda.sampledata.Activity;
import com.anidis.logical.lemda.sampledata.Functional_Java8;
import com.anidis.logical.lemda.sampledata.Student;


public class StreamAll {

	public static void main(String... args) {

		System.out.println("----------");

		// Student Object

		List<Student> students = Functional_Java8.getAllStudents();

		// Normal Stream map to get Specific OBject

		List<String> activityNames=students.stream() // Stream<Student>
		.map(s -> s.getActivity()) // Stream<List<Activity>
		.peek(s -> System.out.println(s.get(0).getName()))
		.flatMap(List::stream)
		.map(activity -> activity.getName().toUpperCase())
		.peek(activity -> System.out.println(" 1 >> " + activity))
		.map(Functional_Java8 :: getStudent) // direct call other method
		.map(Student::getActivity)
		.flatMap(List::stream)
		.map(Activity::getName)
		.peek(a1 -> System.out.println("<< 33 <<<< " + a1))
		.sorted() // Sort
		.collect(Collectors.toList());

		System.out.println("====================");
		System.out.println(activityNames);
		
		System.out.println("------1 Use Flat MAP-----------");
//		Simple disply with use stream foreach
		students.stream().map(s1 -> s1.getActivity())
		.flatMap(List:: stream)
		.map(Activity::getName)
		.forEach(System.out::println);
		
		
		System.out.println("--------------2 Normal map with Peek----------");
//		use map with peek to display response
		students.stream().map(s3 -> s3.getName()).peek(System.out::println).collect(Collectors.toList());
		
		
		
		System.out.println("---------- 3 Create Map----");
		// Create Map with Student Name with List Activity

		
		
		
		
		
		// Short Student As per Depatment

		// return Location

		//

	}

}

package com.anidis.logical.lemda.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.anidis.logical.lemda.sampledata.Activity;
import com.anidis.logical.lemda.sampledata.Functional_Java8;
import com.anidis.logical.lemda.sampledata.Student;

public class OptionalExample {

	static List<Student> students = Functional_Java8.getAllStudents();

	public static void main(String args[]) {

		Student stu = null;
//		Student stu = students.get(0);

		// optional.OfNullable
		System.out.println(" ofNullable = " + Optional.ofNullable(stu));

		// oPtional.of
		try {
			System.out.println(" ofe = " + Optional.of(stu));
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(" Exception Got >> " + e.getMessage());
		}

		// Optional.empty
		System.out.println(" empty = " + Optional.empty());

		// optional.isPresent
		Optional<Student> st = Optional.ofNullable(stu);
		System.out.println(" isPresent = " + st.isPresent());
		System.out.println(" isEmpty = " + st.isEmpty());

		// optional.if present - not returning any thing
		st = Optional.ofNullable(stu);
		st.ifPresent(s -> System.out.println(s));

		// optional.of().orElse
		Student st1 = Optional.ofNullable(stu).orElse(new Student());
		System.out.println("orElse =" + st1);
		
		//######################### OR ELSE ######################
		// vs Noraml OfNullable
		Optional<Student> st2 = Optional.ofNullable(stu);
		System.out.println(" vs Noraml OfNullable " + st2);
		
		// OfNullable.orElse vs Of().orElse -- it will fail in case of null
		//st1 = Optional.of(stu).orElse(new Student());
		System.out.println("OfNullable.orElse vs Of().orElse = " + st1);

		// optional orElseGet
		
		String ar = "DF4564,Df878,Df988";

		// Standard 1
		 List<String> output= Optional.ofNullable(ar.split(","))
		.map(Arrays::stream)
		.orElseGet(Stream::empty)
				.collect(Collectors.toList());
		 
		 System.out.println("DISOUTPUT="+output);
		
		 
		 // Another standared 2
			List<String> act = Optional.ofNullable(students)
					.orElse(Collections.emptyList())
					.stream()
					.map(Student::getActivity)
					.flatMap(List::stream)
					.map(Activity::getName)
					.collect(Collectors.toList());

			System.out.println("ACT : "+act);
			
		// optional orElseThrow

	}

}

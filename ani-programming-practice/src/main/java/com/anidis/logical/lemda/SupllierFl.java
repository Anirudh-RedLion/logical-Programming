package com.anidis.logical.lemda;

import java.util.List;
import java.util.function.Supplier;

import com.anidis.logical.lemda.sampledata.Functional_Java8;
import com.anidis.logical.lemda.sampledata.Student;

public class SupllierFl {

	public static void main(String args[]) {
		
		System.out.println("--------------");
		
		Supplier<List<Student>> empData = Functional_Java8 :: getAllStudents;

		
		empData.get().stream().forEach(System.out::println);
		
	}
	
	
}
	
package com.anidis.logical.lemda;

import java.util.function.Consumer;

import com.anidis.logical.lemda.sampledata.Functinal_Java8;
import com.anidis.logical.lemda.sampledata.Student;

public class ConsumerFl {

	

	public static void main(String args[]) {

		// define Consumer functional
		// TODO : define vs declare need to understand
		Consumer<String> nameConsumer = (name) -> System.out.println(" Hello " + name);

		Consumer<Student> idConsumer = (s) -> System.out.print("Hello, " + s.getName().toUpperCase()+" : [ ");

		Consumer<Student> gradeConsumer = (s) -> System.out.println("Grade " + (s.getGrade() + 10)+" ]");

		// senario 1 normal
		System.out.print("Output 1 : ");
		nameConsumer.accept("Anirudh");

		// Senario 2nd : each Student  pass in consumer
		System.out.print("output 2 : ");

		Functinal_Java8.getAllStudents().forEach(idConsumer);

		System.out.println();
		// Senario 3rd > Function chaining : each Student  pass in consumer
		System.out.println("----- output 3 ------");

		Functinal_Java8.getAllStudents().forEach(idConsumer.andThen(gradeConsumer));
		
		
		// Void return method we can not call in SYSOUT statment
		noReturnTest("Test");
		System.out.println();

	}

	// create Void method


	static void noReturnTest(String name) {

		System.out.println(" NO Return >> " + name);

	}
	
	
	/**
	 * 
	 * ----- output 3 ------
		Hello, PANKAJ GUP : [ Grade 13 ]
		Hello, RAM JI : [ Grade 15 ]
		Hello, SHAM JI : [ Grade 12 ]
		Hello, GHAN SHAYAM : [ Grade 17 ]
		 NO Return >> Test
	 * 
	 * 
	 */
	

	
	
}

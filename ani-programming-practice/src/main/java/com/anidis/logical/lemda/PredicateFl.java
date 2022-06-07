package com.anidis.logical.lemda;

import java.util.function.Predicate;

import com.anidis.logical.lemda.sampledata.Functional_Java8;
import com.anidis.logical.lemda.sampledata.Student;

//11:48 -53
public class PredicateFl {

	public static void main(String args[]) {

		// grade prdicate
		Predicate<Student> gradePredicate = s -> s.getGrade() > 4;

		Student stu = Functional_Java8.getAllStudents().get(3);

		System.out.println("OutPut 1 Grade > 4 : " + gradePredicate.test(stu));
		
		 stu = Functional_Java8.getAllStudents().get(0);

		System.out.println("OutPut 2 Grade > 4 : " + gradePredicate.test(stu));

	}

}

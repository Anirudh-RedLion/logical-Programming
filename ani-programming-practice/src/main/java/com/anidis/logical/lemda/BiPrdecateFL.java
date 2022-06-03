package com.anidis.logical.lemda;

import java.util.function.BiPredicate;

import com.anidis.logical.lemda.sampledata.Functinal_Java8;
import com.anidis.logical.lemda.sampledata.Student;

// 55
public class BiPrdecateFL {

	public static void main(String args[]) {

		BiPredicate<Student, Integer> gradePredicate = (s, check) -> s.getGrade() > check;

		Student stu = Functinal_Java8.getAllStudents().get(0);

		System.out.println("output 1 Grade > 4 : " + gradePredicate.test(stu, 4));

		stu = Functinal_Java8.getAllStudents().get(3);

		System.out.println("output 2 Grade > 4 : " + gradePredicate.test(stu, 4));

	}

}

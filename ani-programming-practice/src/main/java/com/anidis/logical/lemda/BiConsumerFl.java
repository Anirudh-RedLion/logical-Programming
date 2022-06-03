package com.anidis.logical.lemda;

import java.util.function.BiConsumer;

import com.anidis.logical.lemda.sampledata.Functinal_Java8;
import com.anidis.logical.lemda.sampledata.Student;

//11:37 -47
public class BiConsumerFl {

	public static void main(String ani[]) {

		// Consumer
		BiConsumer<Student, String> studentConsumer = (s, greet) -> {

			System.out.println(greet + " " + s.getName());

		};

		System.out.println("-------- OUTPut --------");
		Functinal_Java8.getAllStudents().forEach(s -> studentConsumer.accept(s, "Hello"));

	}

}

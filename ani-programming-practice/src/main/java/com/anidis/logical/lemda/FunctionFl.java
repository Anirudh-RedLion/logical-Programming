package com.anidis.logical.lemda;

import java.util.function.Consumer;

// 11 pm
public class FunctionFl {

	public static void main(String args[]) {

		// define Consumer functional
		// TODO : define vs declare need to understand
		Consumer<String> nameConsumer = (name) -> System.out.println(" Hello " + name);

		Consumer<Integer> idConsumer = (id) -> System.out.println(" ID -> " + id);

		// senario 1 normal
		System.out.print("Output 1 : ");
		nameConsumer.accept("Anirudh");

		// Senario 2nd
		System.out.print("output 2 : ");

		idConsumer.accept(343545);

		// Void return method we can not call in SYSOUT statment
		noReturnTest("Test");
		System.out.println();

	}

	// create Void method

	static void noReturnTest(String name) {

		System.out.println(" NO Return >> " + name);

	}

}

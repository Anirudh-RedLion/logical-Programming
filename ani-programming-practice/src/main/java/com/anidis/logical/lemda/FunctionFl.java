package com.anidis.logical.lemda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.anidis.logical.lemda.sampledata.Activity;
import com.anidis.logical.lemda.sampledata.Functinal_Java8;
import com.anidis.logical.lemda.sampledata.Student;

// 6:06 pm
/**
 * @author Anirudh
 *
 */
public class FunctionFl {

	static Function<List<Student>, Map<String, Student>> studentFunction = (stuList) -> {

		Map<String, Student> stuMap = new HashMap<>();
		stuList.forEach(stu -> {

			stuMap.put(stu.getName(), stu);

		});

		return stuMap;
	};

	public static void main(String args[]) {

		Map<String, Student> stuMap = studentFunction.apply(Functinal_Java8.getAllStudents());
		displayStudent(stuMap);

		Function<Student, List<Activity>> stuNameFunction = Student::getActivity;
		// Method Refrence
		System.out.println("Activity --------------");
		System.out.println(stuNameFunction.apply(Functinal_Java8.getAllStudents().get(1)));

	}

	private static void displayStudent(Map<String, Student> stuMap) {
		// TODO Auto-generated method stub

		stuMap.entrySet().stream().forEach(m -> {

			System.out.println(m.getKey() + " |= " + m.getValue());
			System.out.println();

		});

	}

}

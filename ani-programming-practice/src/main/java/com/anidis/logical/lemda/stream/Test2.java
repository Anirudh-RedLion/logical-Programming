package com.anidis.logical.lemda.stream;


class Test1{
	
	Test1(){
		
		System.out.println("---- TEST1 - Constructor");
	}
	
}



public class Test2 extends Test1{

	int a, b;

	

private   Test2() {

	super();
	System.out.println("------CONSTRU-1--------");
}

	public void myMeth() {

		System.out.println("---11---------");

	}

	/*// in overloading return type change not allowed, return type should be same  
	 * public int myMeth(String a) {
	 * 
	 * System.out.println("---11---------"); return 0; }
	 */	
	public void myMeth(String a) {

		System.out.println("---11---------");
//return 0;
	}
//	public void myMeth(int a) {
//
//		System.out.println("---11---------");
//
//	}
	
	{
		System.out.println("---22---------");

	}

	static {

		System.out.println("---STATIC---------");
	}
	
	public void Test2() {
		System.out.println("---COnstructor---------");

	}


	public static void main(String args[]) {

		String a = "hh";
		String b = new String("hh");
		String c = "hh";
		String d = new String("hh");
		System.out.println((a == b));
		System.out.println((a == c));
		System.out.println((b == d));

		System.out.println(a);

		A aObj = new A();
		System.out.println(aObj.aa);

		System.out.println("-----------------======");
		Test2 aaO = new Test2();
		aaO.Test2();
		aaO.myMeth();

		//------ 17 Aug
		Test1 aa= new Test2();
		
	}
}

class A {

	public final int aa = 99;
	public static int bb = 19;

	A() {

		System.out.println("----- call A--------");
	}
}

class B extends A {

	public final int aa = 990;
	public static int bb = 1910;

	B() {

		System.out.println("----- call BBB--------");
		
		Comparable cc;
//		Comparator dd;
	}
	
	
	

}
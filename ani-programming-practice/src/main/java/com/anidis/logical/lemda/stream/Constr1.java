package com.anidis.logical.lemda.stream;


public class Constr1 {
	int id;
	String name;
	static int aa;
	
	Constr1(int id, String name){
		aa++;	
	this.id=id;
	this.name=name;
		
	}
	
	Constr1(int id, String name,String text){
		aa++;
		//Constr1(1,"");
	this.id=id;
	this.name=name;
		
	}
	
	public Constr1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void display() {
		
		name="MR "+name;
		System.out.println("Static aa: "+aa);
		System.out.println("id : "+id);
		System.out.println("name : "+name);		
	}
	
	public static void main(String args[]) {
		
//	name ="";	
		Constr1 ob= new Constr1(11, "Anirudh");
		ob.display();
		
		Constr1 ob1= new Constr1();
		
		ob1.display();
	}
	
	
	
	

}

package com.xworkz.core_java.inheritance.association;

public class RelationShipDemo {

	public static void main(String[] args) {
		
		Library sharada=new Library();
		
		
		sharada.student=new Student();
		

		System.out.println("Library name :"+sharada.name);
		System.out.println("Library noOBooks :"+sharada.noOfBooks);
		System.out.println("Library location :"+sharada.location);
		System.out.println("Student name :"+sharada.student.name);
		System.out.println("Student id :"+sharada.student.id);
		System.out.println("Student collage :"+sharada.student.collage);
		
		
		
		
	}
}

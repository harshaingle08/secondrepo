package com.seconddemo;

public class Student {

	private int rollno;
	
	private String name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String[] args) {
		
		Student s = new Student(1,"aaa");
		System.out.println(s.rollno);
		System.out.println(s.name);
		
	}

}

package com.polymorphism;

public class Student2 extends College{

	@Override
	public void studentName(String name) {
		
		super.studentName(name);
	}

	@Override
	public void studentDetails(int age, String fn, String dob) {
		
		super.studentDetails(age, fn, dob);
	}

	@Override
	public void studentMarks(int t1, int t2) {
		
		super.studentMarks(t1, t2);
	}
	public static void main(String[]args) {
		Student2 obj= new Student2();
		obj.studentName("Murugan");
		obj.studentDetails(20, "Siva", "10-02-1995");
		obj.studentMarks(400, 1110);
	}
	

}

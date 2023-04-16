package com.polymorphism;

public class Student1 extends College {

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
	public static void main(String[] args) {
		Student1 obj = new Student1();
		obj.studentName("Ganesh");
		obj.studentDetails(26, "siva", "12-12-1991");
		obj.studentMarks(490, 1098);
		
	}
	

}
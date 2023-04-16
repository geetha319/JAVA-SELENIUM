package com.scanner;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		//scanner class
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:-");
		String name=sc.nextLine();
		System.out.println("Your name is:-"+name);
		System.out.println("Enter your age:-");
		int age=sc.nextInt();
		System.out.println("Your age is:-"+age);
		System.out.println("Enter yor height:-");
		Float height=sc.nextFloat();
		System.out.println("Your height is:-"+height);
		System.out.println("Enter your initial:-");
		char initial=sc.next().charAt(0);
		System.out.println("your initial is:-"+initial);
		System.out.println("Entr your Gender:-");
		String gender=sc.next();
		System.out.println("Yur gender is:-"+gender);
		
	}

}

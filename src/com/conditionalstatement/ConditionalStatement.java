package com.conditionalstatement;

public class ConditionalStatement {
	public static void main(String[]args) {
		//if statement
		int a=1000;
		if(a>100) {
			System.out.println("Yes it is true");
		}
		//if else statement
		if(a>10000) {
			System.out.println("Yes it is true");
			
		}else {
			System.out.println("No it is false");
			
		}
		//if else if ladder statement or nested if else
		int mark=105;
		if(mark<50) {
			System.out.println("Your Grade is D");
	}else if(mark>=50&&mark<60) {
		System.out.println("Your Grade is C");
	}else if(mark>=60&&mark<80) {
		System.out.println("Your Grade is B");
		
	}else if(mark>=80&&mark<=100) {
		System.out.println("Your Grade is A");
	}else {
		System.out.println("Invalid mark");
	}
		//switch statement
		char day='C';
		switch(day) {
		case 'a':
			System.out.println("Today is monday");
		break;
		case 'b':
			System.out.println("Today is Tuesday");
		break;
		case 'c':
			System.out.println("Today is Wednesday");
		break;
		default:
			System.out.println("InvalidInput");
		}
		
		}
		

}

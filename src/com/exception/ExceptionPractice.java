package com.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionPractice {
	public static void main(String[]args) {
		//Exception
		//int a=10;
		//int b=0;
		//System.out.println(a/b);
		//Null pointer Exception
		//String s=null;
		//int le=s.length();
		//System.out.println(le);
		//Input Mismatch Exception
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter any number:-");
		//int num=sc.nextInt();
		//System.out.println("The number you entered is:-"+num);
		//Array Index out of Based Exception
		//float a1[]=new float[5];
		//a1[0]=4.5f;
		//a1[1]=5.6f;
		//a1[2]=3.3f;
		//a1[3]=2.5f;
		//a1[4]=1.5f;
		//a1[5]=23.4f;
		//for(float it:a1) {
			//System.out.print(it);
			
		//}
		//string index out of bound exception
		//String s3="geetha";
		//char ca=s3.charAt(6);
		//System.out.println(ca);
		//index out of bound exception
		//List<Object>li=new ArrayList<Object>();
		//li.add(24);
		//li.add("Geetha");
		//li.add("Java");
		//li.add("5.5f");
		//li.add(true);
		//System.out.println(li);
		//Object ge=li.get(5);
		//System.out.println(ge);
		//number format exception
		String s2="12345yt";
		System.out.println(s2);
		int p1=Integer.parseInt(s2);
		System.out.println(p1);
		int b1=5;
		System.out.println(s2+b1);
		
		
		
		
	}

}

package com.stringtypes;

public class StringTypesPractice {
	public static void main(String[]args) {
		//Immutable
		String s1="Welcome To Java";
		System.out.println(System.identityHashCode(s1));
		String s2="Welcome To Java ";
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1+""+s2);
		System.out.println(System.identityHashCode(s1+""+s2));
		//mutable string
		StringBuffer s3= new StringBuffer("Geetha");
		System.out.println(System.identityHashCode(s3));
		StringBuffer s4= new StringBuffer("Geetha");
		System.out.println(System.identityHashCode(s4));
		System.out.println(s3.append(s4));
		System.out.println(System.identityHashCode(s3.append(s4)));
		
				
	}

}

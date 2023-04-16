package com.collection1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice1 {
	public static void main(String[]args) {
		//set
		//HashSet
		Set<Integer>s1=new HashSet<Integer>();
		//add
		s1.add(23);
		s1.add(35);
		s1.add(null);
		s1.add(29);
		s1.add(3);
		System.out.println(s1);
		//Linked HashSet
		Set<Integer>s2= new LinkedHashSet<Integer>();
		s2.add(23);
		s2.add(35);
		s2.add(45);
		s2.add(29);
		s2.add(3);
		System.out.println(s2);
	}

}

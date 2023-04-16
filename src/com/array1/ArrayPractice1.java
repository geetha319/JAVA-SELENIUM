package com.array1;

public class ArrayPractice1 {
	public static void main(String[]args) {
		//1)multiply all the elements in the array
		int a[]= {10,25,45,65,75,85};
		int multiply=1;
		for(int i=0;i<a.length;i++) {
			multiply=multiply*a[i];
		}
		System.out.println("the multiply of all elements in the array is:"+multiply);
	}

}

package com.array;

public class ArrayPractice {
	public static void main(String[]args) {
		//1)adding all the elements in the array
		int a[]= {23,33,43,53,63,73,83};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("the addition of all elements in the array is:"+sum);
	}

}

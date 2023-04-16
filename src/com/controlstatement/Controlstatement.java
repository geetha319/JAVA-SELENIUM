package com.controlstatement;

public class Controlstatement {
	public static void main(String[]args) {
		//1)for loop
		for(int i=10;i>=1;i=i-1) {
			System.out.println(i+"");
		}
		//2) while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		//3) do while loop
		int a=100;
		do {
			System.out.println(a);
			a++;
		}while(a<=10);
		//nested for loop
		for(int k=1;k<=5;k=k+1) {
			for(int j=1;j<=5;j++) {
				System.out.println("*"+"");
				
			}
			System.out.println();
				
		}
	}

}

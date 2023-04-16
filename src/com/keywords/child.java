package com.keywords;

public class child extends parent {
	int a=90;

	public void method3() {
		System.out.println(super.a);
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		child obj=new child();
		obj.method3();
	}
}




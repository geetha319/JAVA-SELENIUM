package com.castinginobject;

public class Child extends Parent {
	public void method2() {
		System.out.println("child method1");
	}
	public static void main(String[]args) {
		Child obj=new Child();
		obj.method2();
	}

}

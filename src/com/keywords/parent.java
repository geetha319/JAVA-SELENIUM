package com.keywords;

public /*final*/ class parent {
	int a=12;
	/*final*/ public void method1() {
		System.out.println(a);
		
	}
	public static void main(String[]args) {
		parent obj=new parent();
		obj.method1();
		/*final*/ int a=45;
		int b=20;
		a=b;
		System.out.println(a);
	}

}

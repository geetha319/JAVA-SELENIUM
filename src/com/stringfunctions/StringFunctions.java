package com.stringfunctions;

public class StringFunctions {
	public static void main(String[]args) {
		//string
		String s1="Welcome To Java";
		//string functions
		//1.s.length()
		int len=s1.length();
		System.out.println(len);
		//2.s.equals()
		//String s2="Welcome To Java";
		//boolean eq=s1.equals(s2);
		//System.out.println(eq);
	    //3.s.equalsIgnoreCase()
		//String s2="Welcome To Python";
		//boolean eiq=s2.equalsIgnoreCase(s1);
		//System.out.println(eiq);
		//4.s.toUppercase()
		String uc=s1.toUpperCase();
		System.out.println(uc);
		//5.s.toLowercase()
		String lc=s1.toLowerCase();
		System.out.println(lc);
		//6.startswith()
		//String s2="Welcome To Java";
		//boolean sw=s2.startsWith(s1);
		//System.out.println(sw);
		//7.s.endswith()
		String s2="Welcome To Java";
		boolean ew=s2.startsWith(s1);
		System.out.println(ew);
		//8.s.contains()
		boolean con=s1.contains("Java");
		System.out.println(con);
		//9.s.indexof()
		int io=s1.indexOf('e');
		System.out.println(io);
		//10.s.lastindexof()
		int lio=s1.lastIndexOf('e');
		System.out.println(lio);
		//11.s.charat()
		char ca=s1.charAt(5);
		System.out.println(ca);
		//12.s.replace()
		String rep=s1.replace("Java", "Python");
		System.out.println(rep);
		//13s.isempty()
		boolean em=s1.isEmpty();
		System.out.println(em);
		//14. s.trim()
		String tr=s1.trim();
		System.out.println(tr);
		//15. s.substring()
		String ss=s1.substring(11);
		System.out.println(ss);
		//16.s.spilt()
		String[] sp=s1.split("Java");
		for(String st:sp) {
		
			System.out.print(st);
			
		}
		
		

}
}

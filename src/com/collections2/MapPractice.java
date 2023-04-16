package com.collections2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {
public static void main(String[]args) {
	//map
	//hash map
	Map<Integer, String> m=new HashMap<Integer, String>();
	//put
	m.put(20, "Java");
	m.put(22, "Javascript");
	m.put(23, "C++");
	m.put(24, "HTML");
	m.put(25, "Python");
	System.out.println(m);
	//size
	int s1=m.size();
	System.out.println(s1);
	//get
	String st=m.get(23);
	System.out.println(st);
	//entrySet()
	Set<Entry<Integer,String>>es=m.entrySet();
	System.out.println(es);
	//keySet()
	Set<Integer> ks=m.keySet();
	System.out.println(ks);
	//values()
	Collection<String>va=m.values();
	System.out.println(va);
	//containsKey()
	boolean ck=m.containsKey(22);
	System.out.println(ck);
	//containsValue()
	boolean cv=m.containsValue("HTML");
	System.out.println(cv);
	
	
	
	
	
}
}

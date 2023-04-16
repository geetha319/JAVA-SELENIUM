package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[]args) {
		//list
		//Array list, Linked list,Vector list
		//Array list
		List<Object> li=new ArrayList<Object>();
		//add()
		li.add(24);
		li.add("Geetha");
		li.add("5.5f");
		li.add(true);
		System.out.println(li);
		//size
		int si=li.size();
		System.out.println(si);
		//get
		Object ge=li.get(3);
		System.out.println(ge);
		//set
		li.set(1, "Java");
		System.out.println(li);
		///remove
		li.remove(3);
		System.out.println(li);
		//indexOf()
		int io=li.indexOf(true);
		System.out.println(io);
		//contains()
		boolean con=li.contains(24);
		System.out.println(con);
		//clear()
		li.clear();
		System.out.println(li);
		List<Object> li2=new ArrayList<Object>();
		//add()
		li2.add(242);
		li2.add("Geetha");
		li2.add('y');
		li2.add("5.2f");
		li2.add(false);
		System.out.println(li2);
		//AddAll()
		li.addAll(li2);
		System.out.println(li);
		//RemoveAll()
		li.removeAll(li2);
		System.out.println(li);
		//retainAll()
		li.retainAll(li2);
		System.out.println(li);
		
		
		
		
		
				
		
		
		
	}

}

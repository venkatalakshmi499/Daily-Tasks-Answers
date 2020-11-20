package com.src;

import java.util.ArrayList;

public class ArrayListToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();//arraylist
		al.add("Sruthi");
		al.add("Mounika");
		al.add("Jhari");
		al.add("Divya");
		al.add("Dileep");
		al.add("Naidu");
		System.out.println(al);
		Object[] obj=al.toArray(); //converts into array object
		for(Object obj1:obj) { //foreach
			String name=(String) obj1;
			System.out.println(name);
		}

	}

}

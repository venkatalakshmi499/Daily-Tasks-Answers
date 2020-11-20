package com.maps;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap t=new TreeMap();
		t.put("mail","abc@bbc.com");
		t.put("phonenum","9491787564");
		t.put("address", "andhrapradesh");
		t.put("friend1", "sruthi");
		t.put("friend2", "bavana");
		System.out.println(t.ceilingEntry("mail"));
		System.out.println(t.ceilingEntry("address"));
		System.out.println(t.containsKey("phonenum"));
		System.out.println(t.clone());
		System.out.println(t.ceilingKey("mail"));
		System.out.println(t.descendingMap());
		System.out.println(t.descendingKeySet());
		System.out.println(t.containsValue("9494787564"));
		System.out.println(t.firstKey());
		System.out.println(t.floorKey("address"));
		System.out.println(t.replace("phonenum","805556849"));
		System.out.println(t);
		System.out.println(t.remove("friend2"));
		System.out.println(t);
		System.out.println(t.lastKey());
		System.out.println(t.hashCode());
		

	}

}

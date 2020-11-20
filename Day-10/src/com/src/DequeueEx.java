package com.src;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Deque d=new LinkedList<String>();
     d.add("one");
     d.add("two");
     d.add("three");
     d.add("four");
     d.add("five");
     System.out.println(d);
     d.removeFirst();
     d.removeLast();
     System.out.println(d);
     
	}

}

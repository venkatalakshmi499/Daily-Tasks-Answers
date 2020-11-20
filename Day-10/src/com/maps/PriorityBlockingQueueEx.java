package com.maps;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityBlockingQueue<String> pr=new PriorityBlockingQueue<String>();
		pr.add("violet");
		pr.add("blue");
		pr.add("red");
		pr.add("brown");
		pr.add("white");
		pr.add("yellow");
		pr.add("orange");
		pr.add("skyblue");
		pr.add("pink");
		System.out.println(pr);
	}

}

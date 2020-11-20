package com.src;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat f=new SimpleDateFormat(" EEE MMM dd - YYYY HH:mm:ss");
		String stringDate= f.format(d);
		System.out.println(stringDate);
		

	}

}

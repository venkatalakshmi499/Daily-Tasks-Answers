package com.src;

import java.util.Date;
public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);//current date and time
		System.out.println(d.getDate());//only displays date
		System.out.println(d.getDay());//day number
		System.out.println(d.getHours());//how many hours completed till now
		System.out.println(d.getMinutes());
		System.out.println(d.getMonth());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime());
		System.out.println(d.getTimezoneOffset());
		System.out.println(d.getYear());
		System.out.println(d.toLocaleString());//prints date with time
		System.out.println(d.toString());//prints date ,day and time

	}

}

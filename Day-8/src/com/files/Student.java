package com.files;

public class Student  implements Comparable{
	String name;
	String dob;
	int m1;
	int m2;
	int m3;
	int avg;
	int tot;
	
	public Student(String name, String dob, int m1, int m2, int m3) {
		super();
		this.name = name;
		this.dob = dob;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public int average()
	{
		avg=m1+m2+m3/3;
		return avg;
	}
	public int total()
	{
		tot=m1+m2+m3;
		return tot;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student) o;
		Task1 t=(Task1)o;
		return avg;
		
	}
	
	

}

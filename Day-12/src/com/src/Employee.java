package com.src;

public class Employee {
	int id;
	String name;
	double salary;
	int age;
	int workingyears;
	public Employee(int id, String name, double salary, int age, int workingyears) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.workingyears = workingyears;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		Employee e= (Employee)obj;
		return this.id==e.id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", workingyears="
				+ workingyears + "]";
	}
	

}

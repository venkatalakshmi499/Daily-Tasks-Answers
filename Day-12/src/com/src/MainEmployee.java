package com.src;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=sc.nextInt();
		HashSet<Employee> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the salary");
			double salary=sc.nextDouble();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			System.out.println("Enter the workingyeras");
			int workingyears=sc.nextInt();
			Employee e=new Employee(id,name,salary,age,workingyears);
			hs.add(e);
		}
		System.out.println(hs);
		//Set s=(Set) hs.stream().map((e)->e.workingyears>5 ? e.salary+50000:-1).collect(Collectors.toSet());
		//System.out.println(s);
		List<Integer> li=(List) hs.stream()
				.sorted((i,j)->(Integer)i.workingyears<(Integer)j.workingyears ?-1:1)
				.collect(Collectors.toList());
		System.out.println(li);
		List<Integer> li1=(List) hs.stream().filter((t)->t.workingyears< 2)
				.sorted((i,j)->(Integer)i.id<(Integer)j.id ?-1:1)
				.collect(Collectors.toList());
		System.out.println(li1);
		
		
	}

}

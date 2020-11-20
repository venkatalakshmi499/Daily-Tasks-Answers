package com.src;

import java.util.Scanner;
public class OperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic ar=new Arithmetic();
		Relation r=new Relation();
		Logical l=new Logical();
		Conditional c=new Conditional();
		InDecOperator id=new InDecOperator();
		Scanner sc=new Scanner(System.in);
		System.out.println("choose which operator to perform: ");
		System.out.println("1.Addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.>");
		System.out.println("6.<");
		System.out.println("7.==");
		System.out.println("8.>=");
		System.out.println("9.<=");
		System.out.println("10.!=");
		System.out.println("11.&&");
		System.out.println("13.^");
		System.out.println("12.||");
		System.out.println("14.?:");
		System.out.println("15.+=");
		System.out.println("16.++");
		System.out.println("17.--");
		System.out.println("18.-=");
		System.out.println("19./=");
		System.out.println("20.%=");
		System.out.println("21.=");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
	    System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		
		switch(choice)
		{
		case 1:ar.add(a,b);
		break;
		case 2:ar.sub(a,b);
		break;
		case 3:ar.mul(a,b);
		break;
		case 4:ar.div(a,b);
		break;
		case 5:r.greater(a,b);
		break;
		case 6:r.lessthan(a,b);
		break;
		case 8:r.greaterThanEqual(a,b);
		break;
		case 9:r.lessThanEqual(a,b);
		break;
		case 10:r.notEqual(a,b);
		break;
		case 11:l.logicalAnd(a,b);
		break;
		case 12:l.logicalOr(a,b);
		break;
		case 13:l.power(a,b);
		break;
		case 14:c.conditional(a,b);
		break;
		case 15:id.add2(a,b);
		break;
		case 16:id.postInc(b);
		break;
		case 17:id.postDec(b);
		break;
		case 18:id.div2(a,b);
		break;
		case 20:id.rem(a,b);
		break;
		case 21:id.assign(a,b);
		break;
		default:System.out.println("Invalid input");
		break;
		
		}
		
	}

}


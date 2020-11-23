package com.lamba;

import java.util.*;

public class StreamMain
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("how many students u enter: ");
        final int n = sc.nextInt();
        final ArrayList<StreamStudentEx> al = new ArrayList<StreamStudentEx>();
        for (int i = 0; i < n; ++i) {
            System.out.println("enter name of student:");
            final String name = sc.next();
            System.out.println("enter mathematics marks:");
            final int m1 = sc.nextInt();
            System.out.println("enter social marks:");
            final int m2 = sc.nextInt();
            System.out.println("enter science marks:");
            final int m3 = sc.nextInt();
            final StreamStudentEx s = new StreamStudentEx(name, m1, m2, m3);
            al.add(s);
            final int percent = (int)s.percentage(m1, m2, m3);
            al.add(s);
            s.assignGrades((double)percent, name);
        }
        System.out.println(al);
    }
}
package com.lamba;

import java.util.*;
import java.util.stream.*;

public class StudentMain
{
    public static void main(final String[] args) {
        final ArrayList<StudentMarks> al = new ArrayList<StudentMarks>();
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students : ");
        final int n = sc.nextInt();
        int total = 0;
        StudentMarks sm = null;
        for (int i = 0; i < n; ++i) {
            System.out.println("Enter the name : ");
            final String name = sc.next();
            System.out.println("Enter the physics marks : ");
            final int physicsmarks = sc.nextInt();
            System.out.println("Enter the science marks : ");
            final int sciencemarks = sc.nextInt();
            System.out.println("Enter the social marks : ");
            final int socialmarks = sc.nextInt();
            total = physicsmarks + socialmarks + sciencemarks;
            final int percent = total / 3;
            char grade;
            if (percent > 90) {
                grade = 's';
            }
            else if (percent > 70 && percent < 90) {
                grade = 'a';
            }
            else if (percent > 50 && percent > 70) {
                grade = 'b';
            }
            else {
                grade = 'f';
            }
            sm = new StudentMarks(name, physicsmarks, sciencemarks, socialmarks, total, percent, grade);
            al.add(sm);
            System.out.println(al);
        }
        final ArrayList al2 = al.stream().filter(p -> p.physicsmarks < 50).collect((Collector<? super Object, ?, ArrayList>)Collectors.toList());
        System.out.println("Failed in Physics : ");
        System.out.println(al2);
        final ArrayList al3 = al.stream().filter(p -> p.sciencemarks < 50).map(p -> p).collect((Collector<? super Object, ?, ArrayList>)Collectors.toList());
        System.out.println("Failed in Science : ");
        System.out.println(al3);
        final ArrayList al4 = al.stream().filter(p -> p.socialmarks < 50).map(p -> p).collect((Collector<? super Object, ?, ArrayList>)Collectors.toList());
        System.out.println("Failed in Social : ");
        System.out.println(al4);
        final ArrayList al5 = al.stream().filter(p -> p.physicsmarks > 50).filter(p -> p.sciencemarks > 50).filter(p -> p.socialmarks > 50).map(p -> p).collect((Collector<? super Object, ?, ArrayList>)Collectors.toList());
        System.out.println("Passed in exam : ");
        System.out.println(al5);
    }
}
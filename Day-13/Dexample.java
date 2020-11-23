package com.src;

import java.util.*;

public class Dexample
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        for (int n = sc.nextInt(), i = 0; i < n; ++i) {
            System.out.println(i);
        }
    }
}
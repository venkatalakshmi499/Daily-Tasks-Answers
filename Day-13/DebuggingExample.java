package com.src;

import java.util.*;

public class DebuggingExample
{
    int n;
    Scanner sc;
    
    public DebuggingExample() {
        this.sc = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        final DebuggingExample de = new DebuggingExample();
        de.updateNvalue();
    }
    
    public void printValue(final int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println(i);
        }
    }
    
    public void updateNvalue() {
        System.out.println("enter n value");
        final int n = 4;
        this.printValue(n);
    }
}
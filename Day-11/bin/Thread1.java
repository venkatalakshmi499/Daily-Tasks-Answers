package com.lamba;

public class Thread1
{
    public static void main(final String[] args) {
        new Thread(() -> System.out.println("programming thread")).start();
    }
}
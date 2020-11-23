package com.src;

import java.util.*;

public class FileMain
{
    public static void main(final String[] args) {
        final Fileinput fi = new Fileinput();
        final Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        final String name = s.next();
        fi.files(name);
        System.out.println("file created");
    }
}
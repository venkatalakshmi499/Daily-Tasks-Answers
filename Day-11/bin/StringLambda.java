package com.lamba;

import java.util.*;
import java.util.function.*;

public class StringLambda
{
    public static void main(final String[] args) {
        final String[] a = { "database", "oracle", "java", "connectivity" };
        Arrays.sort(a, (s1, s2) -> s1.length() - s2.length());
        Arrays.asList(a).forEach(System.out::println);
        Arrays.sort(a, (s1, s2) -> s2.length() - s1.length());
        Arrays.asList(a).forEach(System.out::println);
        final char ch;
        final char ch2;
        Arrays.sort(a, (s1, s2) -> {
            ch = s1.charAt(0);
            ch2 = s2.charAt(0);
            if (ch > ch2) {
                return ch2;
            }
            else {
                return ch;
            }
        });
        Arrays.asList(a).forEach(System.out::println);
        final char ch3;
        final char ch4;
        Arrays.sort(a, (s1, s2) -> {
            ch3 = s1.charAt(0);
            ch4 = s2.charAt(0);
            if (ch3 == 'e' || ch3 == 'E') {
                return ch3;
            }
            else {
                return ch4;
            }
        });
        Arrays.asList(a).forEach(System.out::println);
    }
}
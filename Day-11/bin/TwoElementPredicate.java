package com.lamba;

public interface TwoElementPredicate
{
    Object betterEntry(final Object p0, final Object p1);
    
    default void display() {
        System.out.println("The output is : ");
    }
}
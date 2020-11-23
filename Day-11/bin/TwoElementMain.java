package com.lamba;

public class TwoElementMain
{
    public static void main(final String[] args) {
        final Car c = new Car();
        c.setCarname("Audi");
        c.setPrice(800000);
        final Car c2 = new Car();
        c2.setCarname("Ferrari");
        c2.setPrice(4000000);
        final TwoElementPredicate td = (a, b) -> (((Car)a).getCarname().length() > ((Car)b).getCarname().length()) ? a : b;
        final TwoElementPredicate td2 = (a, b) -> (((Car)a).getPrice() > ((Car)b).getPrice()) ? a : b;
        TwoElementPredicate.display();
        System.out.println(td.betterEntry((Object)c, (Object)c2));
        System.out.println(td2.betterEntry((Object)c, (Object)c2));
        final Employee e = new Employee();
        e.setEmpname("Ravichandran");
        e.setSalary(80000);
        final Employee e2 = new Employee();
        e2.setEmpname("Lakshana");
        e2.setSalary(40000);
        final TwoElementPredicate te = (a, b) -> (((Employee)a).getSalary() > ((Employee)b).getSalary()) ? a : b;
        TwoElementPredicate.display();
        System.out.println(te.betterEntry((Object)e, (Object)e2));
    }
}
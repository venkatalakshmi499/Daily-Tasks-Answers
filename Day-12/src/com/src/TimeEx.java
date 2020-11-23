package com.src;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
public class TimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.of(2020, 11, 18);
		System.out.println(ld);
		System.out.println(ld.isLeapYear());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.atTime(14, 14, 30, 3000));
		System.out.println(ld.hashCode());
		System.out.println(ld.lengthOfMonth());
		Clock c=Clock.systemDefaultZone();
		System.out.println(c);
		System.out.println(c.systemUTC());
		System.out.println(c.millis());
		System.out.println(c.offset(c,Duration.ofMillis(1000)));
		System.out.println(c.instant());
		Duration d=Duration.ZERO;
		System.out.println(d);
		

	}

}

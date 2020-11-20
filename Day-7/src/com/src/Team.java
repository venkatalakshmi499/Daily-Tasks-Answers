package com.src;
import java.lang.ThreadGroup;
import java.util.Random;

public class Team {

	public void Race() {
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				System.out.println("stand point");
			}
			Random r = new Random();
			int q = r.nextInt(51);
			counter c = new counter();
			c.count(q);
			int j = 1;
			result w = new result(i, j);
		}
	}

	class counter {
		public void count(int i) {
			int sum = 0;
			for (int j = i; j < 500; j++) {
				sum = sum + i;
			}
		}
	}

	class result {
		result(int i, int j) {
			if (i == 100) {
				System.out.println(j + "reached destination");
			}
		}
	}
}

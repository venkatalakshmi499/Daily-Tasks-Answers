import java.util.Arrays;
import java.util.TreeSet;

public class Problem1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
					String s1 = (String)o1;
					String s2 = (String)o2;
					int a = s1.length();
					int b = s2.length();
					if (a < b)
						return 1; 
					if (a > b)
						return -1; 
					return 0;
				});
		ts.add("venky");
		ts.add("sruthi");
		ts.add("bhavana");
		ts.add("pinky");
		System.out.println(ts);
		System.out.println(Arrays.asList(new TreeSet[] { ts }));
	}
}

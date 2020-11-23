import java.util.TreeSet;

public class ComparatorEx {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
					String s1 = (String)o1;
					String s2 = (String)o2;
					if (s1.compareTo(s2) < 0)
						return 1; 
					return -1;
				});
		ts.add("venky");
		ts.add("sruthi");
		ts.add("bhavana");
		System.out.println(ts);
	}
}

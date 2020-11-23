import java.util.TreeSet;

public class LambdaComparator {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>((a, b) -> {
					String s1 = (String)a;
					String s2 = (String)b;
					if (s1.compareTo(s2) < 0)
						return 1; 
					return -1;
				});
		ts.add("Java");
		ts.add("MySQL");
		ts.add("JDBC");
		System.out.println(ts);
	}
}

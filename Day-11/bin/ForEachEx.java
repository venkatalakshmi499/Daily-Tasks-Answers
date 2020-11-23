import java.util.ArrayList;

public class ForEachEx {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("This");
		al.add("is");
		al.add("Java");
		al.add("8.1");
		al.add("version");
		al.forEach(sr -> System.out.println(sr));
	}
}

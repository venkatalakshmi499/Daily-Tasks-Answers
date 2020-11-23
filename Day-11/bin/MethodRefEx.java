import com.lamba.Greetings;
import com.lamba.SomeClass;
import java.util.ArrayList;

public class MethodRefEx {
	public static void main(String[] args) {
		Greetings g = SomeClass::display;
		g.mrng();
		ArrayList<Integer> al = new ArrayList();
		al.add(Integer.valueOf(56));
		al.add(Integer.valueOf(41));
		al.add(Integer.valueOf(90));
		al.add(Integer.valueOf(80));
		al.forEach(y -> System.out.println(y));
		al.forEach(System.out::println);
	}
}

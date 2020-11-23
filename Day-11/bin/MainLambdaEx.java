import com.lamba.FunctInterface;

public class MainLambdaEx implements FunctInterface {
	public static void main(String[] args) {
		FunctInterface fi = (s1, s2) -> {
				System.out.println(s1.length());
				System.out.println(s2.length());
			};
		fi.display("venkata", "laxmi");
		fi = ((s1, s2) -> 
			
			System.out.println(s1.concat(s2)));
		fi.display("sruthi", "dhaval");
		fi = ((s1, s2) -> 
			
			System.out.println(s1.compareTo(s2)));
		fi.display("madhavi", "madhu");
	}
	
	public void display(String s1, String s2) {}
}

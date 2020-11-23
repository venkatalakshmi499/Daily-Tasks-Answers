import com.lamba.BetterStringEx;

public class BetterStringMain {
	public static void main(String[] args) {
		BetterStringEx bs = (a, b) -> (a.length() > b.length()) ? a : b;
		String l = bs.betterString("venkata", "laxmi");
		BetterStringEx.print();
		System.out.println(l);
		BetterStringEx bs1 = (a, b) -> a;
		String l1 = bs1.betterString("venkata", "laxmi");
		BetterStringEx.print();
		System.out.println(l1);
	}
}

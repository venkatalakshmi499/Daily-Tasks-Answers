import com.lamba.LambdaExp;

public class LambaExMain {
	public static void main(String[] args) {
		LambdaExp l = (a, b) -> System.out.println(String.valueOf(a.length()) + " " + b.length());
		l.functn("Venkata", "Laxmi");
		l = ((a, b) -> System.out.println(a.concat(b)));
		l.functn("Venkata", " Laxmi");
		l = ((a, b) -> System.out.println(a.compareTo(b)));
		l.functn("Venkata", "Laxmi");
	}
}

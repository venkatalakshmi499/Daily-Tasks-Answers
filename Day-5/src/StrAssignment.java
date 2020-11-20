import java.util.Scanner;
public class StrAssignment {
	public static void main(String[]args) {
String str[][]= {{"A","B","C","D","E"},{"F","G","H","I","J"},{"K","L","M","N","O"},{"P","Q||Z","R","S","T"},
		         {"U","V","W","X","Y"}};

	for(int i=0;i<str.length;i++)
	{
		for(int j=0;j<str.length;j++)
		{
			System.out.print(str[i][j]+"    ");
		}
		System.out.println(" ");
		
	}
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the input string:");
	String ip=sc.nextLine();
	ip=ip.toUpperCase();
	StringBuilder sb=new StringBuilder(ip);
	char ch[]=ip.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]+"  ");
	}
    
	
	
	
	}
		
}


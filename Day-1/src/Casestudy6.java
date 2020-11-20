
import java.util.*;
public class Casestudy6 {
	
   public static boolean isPrime(int n) {
	   if(n<=1) {
		   return false;
	   }
	   for(int i=2;i<=Math.sqrt(n);i++) {
		   if(n%i==0) {
			   return false;
		   }
	   }
	   return true;
   }
	
   public static boolean isPalindrome(int n) {
	   int num=n,rev=0;
	   while(n!=0) {
		   rev=rev*10+n%10;
		   n/=10;
	   }
	   return (rev==num);
   }
   
   public static boolean isPerfect(int n) {
	   int s=0;
	   for(int i=1;i<n;i++) {
		   if(n%i==0) {
			   s+=i;
		   }
	   }
	   return (s==n);
   }
	
	
   public static boolean isArmstrong(int n) {
	   int num=n,s=0;
	   while(n!=0) {
		   int r=n%10;
		   s+=r*r*r;
		   n/=10;
	   }
	   return (s==num);
   }
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   System.out.println(isPrime(num));
	   System.out.println(isPalindrome(num));
	   System.out.println(isPerfect(num));
	   System.out.println(isArmstrong(num));
   }
}
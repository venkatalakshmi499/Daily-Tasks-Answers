import java.util.*;
class CaseStudy5{
    public static int count(int n){
        int cnt=0;
        while(n!=0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
    public static int sum(int n){
        int s=0;
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(count(num)==3){
            int last=num%10;
            if(last%2==0){
                System.out.println(sum(num));
            }
            else{
                System.out.println(reverse(num));
            }
        }
    }
}

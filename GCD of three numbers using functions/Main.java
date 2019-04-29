import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int m1=sc.nextInt();
      int m2=sc.nextInt();
      int m3=sc.nextInt();
     int temp=gcd(m1,m2);
      int result=gcd(m3,temp);
      System.out.println(result);
	}
	public static int gcd(int n1,int n2){
			if(n1==0)
              return n2;
            if(n2==0)
              return n1;
       		if(n1==n2)
              return n1;
      		if(n1>n2)
              return gcd(n1-n2,n2);
      		return gcd(n1,n2-n1);
      }
     
}
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int rem;
      int sum=0;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      while(n>0)
      {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
      }
      System.out.println(sum);
	}
}
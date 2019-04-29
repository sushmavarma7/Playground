import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int last_digit,sum;
      last_digit=n%10;
      while(n>=10)
      {
		n=n/10;
      }
      sum=n+last_digit;
      System.out.println(sum);
	}
}
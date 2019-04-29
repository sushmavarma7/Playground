import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int sum,n1,n2;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      n1=n/100;
      n2=n%10;
      sum=n1+n2;
      System.out.println(sum);
	}
}
import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n1,n2;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      n1=n/10;
      n2=n1%10;
      System.out.println(n2);
	}
}
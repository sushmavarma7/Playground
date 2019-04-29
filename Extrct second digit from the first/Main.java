import java.util.Scanner;
class Main
{
	public static void main(String args[])
    {
      int second_digit;
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      while(n>=100)
      {
		n=n/10;
      }
	second_digit=n%10;
      System.out.println(second_digit);
    }
}
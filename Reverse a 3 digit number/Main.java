import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int rev=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n>0)
    {
    int rem=n%10;
     rev=rev*10+rem;
      n=n/10;
  }
    System.out.println(rev);
  }
}
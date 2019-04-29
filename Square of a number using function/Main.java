import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int square=function(n);
      System.out.println(square);
	} 
  public static int function(int m)
  {
		int Square=m*m;
    	return Square;
  }
}
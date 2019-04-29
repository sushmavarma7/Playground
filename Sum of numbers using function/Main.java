import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int result=function(n);
      System.out.println(result);
	}
  public static int function(int m)
  {
	if(m!=0)
      return m+function(m-1);
  	else
    return m;
  }
}
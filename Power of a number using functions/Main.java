import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exponent=sc.nextInt();
      int n=pow(base,exponent);
      System.out.println(n);
	}
  public static int pow(int x,int p)
  {
    if(p!=0)
      return(x*pow(x,p-1));
             else 
             return 1;
   }
}
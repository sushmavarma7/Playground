import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int m1=sc.nextInt();
      int m2=sc.nextInt();
      int m3=sc.nextInt();
     int temp=greatest(m1,m2);
      int result=greatest(m3,temp);
      System.out.println(result);
	}
  public static int greatest(int n1,int n2)
  {
    if(n1>n2)
    {
      return n1;
    }
    else{
      return n2;
    }
  }
}
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i<n;i++)
      {
        int flag;
        flag=prime(i);
        if(flag==1)
          System.out.println(i);
      }
	}
  public static int prime(int m)
  {
    int flag=1;
    for(int i=2;i<=m/2;i++)
    {
		if(m%i==0)
        {	
          	flag=0;
          break;
        }
    }
    return flag;
  }
}
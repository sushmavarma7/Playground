import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
  		// Type your code here
      int n=sc.nextInt();
      int flag=0;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
          if(flag==0)
          {
			System.out.print("*");
            flag=1;
          }
          else{
            System.out.print("#");
            flag=0;
          }
        }
        System.out.print("\n");
      }
    }
}
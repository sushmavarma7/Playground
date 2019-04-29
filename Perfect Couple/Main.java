import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      for(int index1=0;index1<=arr_size-1;index1++)
      {
        for(int index2=index1+1;index2<=arr_size-1;index2++)
        {
          if((arr[index1]+arr[index2])==value)
            System.out.println(arr[index1]+","+" "+arr[index2]);
        }
      }
    }
}  

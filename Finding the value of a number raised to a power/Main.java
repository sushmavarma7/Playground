import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exponent=sc.nextInt();
   int power = 1;
   int i = 1;
    while(i <= exponent)
    {
        power = power * base;
        i++;
    }
   System.out.println(power);
    }
}

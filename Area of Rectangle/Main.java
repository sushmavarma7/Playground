import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int area;
      Scanner sc=new Scanner(System.in);
      int breadth=sc.nextInt();
      int length=sc.nextInt();
      area=length*breadth;
      System.out.println(area);
	}
}
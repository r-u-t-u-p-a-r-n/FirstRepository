// 1. Sum of Numbers Between given Range
import java.util.Scanner;
class sumOfNumbers
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter first number : ");  int a = s.nextInt() ;
		System.out.print("\nEnter second number : "); int b = s.nextInt() ;
		System.out.println("\nThe sum from "+a+" to "+b+" is : "+GetSum(a,b));
	}

	public static int GetSum(int a, int b)
	{
      if(a==b) { return a ; }
      else
        {
        int j = 0 ;
        int i = (a<b)?a:b ;
        while(i<=((a<b)?b:a))
          {
            j+=i++ ;
          }
          return j ;
        }
	}
}
// 28. Find the sum of 1 to n numbers using recursion.

import java.util.Scanner;
class sumTillN
{
	static int i,n ;
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter an integer : ");
	  i = 1 ; n = 0 ;
	  sumTillN(s.nextInt());
	}

	public static void sumTillN(int a)
	{
	  if(i<=a)
	  {
	  	n+= i++ ;
	  	sumTillN(a);
	  }
	  else
	  {
	  	System.out.print("The sum upto "+a+" from "+1+" is : "+n);
	  }
	}
}
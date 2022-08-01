// 27. Find the table of given number using recursion.

import java.util.Scanner;
class numberTable
{
	static int i ;
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter a positive integer : ");
	  i = 1 ;
	  numberTable(s.nextInt());
	}

	public static void numberTable(int a)
	{
	  System.out.println("\t"+a*i);
	  if(i<10)
	  {
	    i++ ;
	    numberTable(a);
	  }
	}
}
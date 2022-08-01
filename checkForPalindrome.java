/* 7. Palidrome Number, mr. Lalwani have Some Currency. The currency having number as Palidrome gets
      3 times more than the currency. So help out Mr. Lalwani to check which currency going to give him
      3 times return. */

import java.util.Scanner;
class checkForPalindrome
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter the currency value : ");
	  int V = s.nextInt();
	  System.out.print("Enter the currency number : ");
	  int N = s.nextInt();
	  if(checkForPalindrome(N) && !(V<0) && !(N<0))
	  {
	  	System.out.print("Mr. Lalwani will get "+(V*3)+" Rs. in return.");
	  }
	  else
	  {
	    if((V<0) || (N<0))
	    {
	    	System.out.print("Negative values are not accepted here.");
	    }

	    else
	    {
	    	System.out.print("Mr. Lalwani will get "+V+" Rs. in return.");
	    }
	  }
	}

	public static boolean checkForPalindrome(int a)
	{
	  int a1 = a ;
	  int c = 1 ;
	  while(a1>0)
	  {
	  	a1 = a1 / 10 ;
	  	c = c * 10 ;
	  }
	  c = c / 10 ;
	  a1 = a ;
	  while(a1>0)
	  {
	  	if(a%10 != a1/c) { return false ; }
	  	a = a / 10 ;
	  	a1 = a1 % c ;
	  	c = c / 10 ;
	  }
	  return true ;
	}
}
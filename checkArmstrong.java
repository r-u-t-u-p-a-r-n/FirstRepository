// 19. JAVA program to check given number is Armstrong or not.

import java.util.Scanner;
class checkArmstrong
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter an Integer : ");
	  if(checkArmstrong(s.nextInt()))
	    {
	    	System.out.println("It's an armstrong number .");
	    }
	    else
	    {
	        System.out.println("It's not an armstrong number .");	
	    }
	}

	public static boolean checkArmstrong(int a)
	{
		int n = a ;
		int i = 0 ;
		while(n>0)
		{
			i++ ;
			n = n / 10 ;
		}

		n = 0 ;
		int n1 = a ;
		while(a>0)
		{
			n+= Math.pow(a % 10,i) ;
			a = a / 10 ;
		}
		if(n == n1) { return true ; }
		else { return false ; }
	}
}	
// 20. Java programm to display Armstrong number between two intervals.

import java.util.Scanner;
class armstrongRange
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter lower limit : "); 
		int ll = s.nextInt() ; 
		System.out.print("Enter upper limit : ");
		int ul = s.nextInt() ;
		System.out.print("List of armstrong numbers : ");
		boolean num = true ;
		while(ll<=ul)
		{
			 if(checkArmstrong(ll)) { System.out.print(ll+" "); num = false ; }
			 ll++ ;
		}
		if(num) { System.out.print("None"); }
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
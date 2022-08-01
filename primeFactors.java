// 16. Programm to find all prime factors of given number.

import java.util.Scanner;
class primeFactors
{
public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int N = s.nextInt();
		if(N>=0)
		{
			int i = 2;
			System.out.print("The prime factors of "+N+" are : ");
			while(i>0)
			{
				if(N%i==0 && CH(i)) {N=N/i; System.out.print(i+" "); i = 0 ; }
				i++ ;
			}
		}

		else
		{ 
			System.out.println(N+" is a negative number, can\'t find prime factors of it .");
		}
	}
public static boolean CH(int a)
	{
		int i = 1,j=0 ;
		while(i<=a)
		{
			if(a%i==0) { j++; }
			i++ ;
		}
		if(j == 2) { return true ; }
		else { return false ; }
	}
}
// 15. Programm to find count of all factors of given number.

import java.util.Scanner;
class countFactors
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int N = s.nextInt();
		if(N>=0)
		{
			int i = 1,j=0 ;
			System.out.print("The total number of factors of "+N+" are : ");
			while(i<=N)
			{
				if(N%i==0) { j++ ; }
				i++ ;
			}
			System.out.print(j);
		}
		else
		{
			System.out.println(N+" is a negative number, can\'t find factor's total .");
		}
	}
}	
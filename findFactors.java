// 14. Programm to find all factors of the given number.

import java.util.Scanner;
class findFactors
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int N = s.nextInt();
		if(N>=0)
		{
			int i = 1 ;
			System.out.print("The factors of "+N+" are : ");
			while(i<=N)
			{
				if(N%i==0) { System.out.print(i+" "); }
				i++ ;
			}
		}
		else
		{
			System.out.println(N+" is a negative number, can\'t find factors of it .");
		}
    }
}
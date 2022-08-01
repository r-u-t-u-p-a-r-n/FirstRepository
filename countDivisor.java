// 2. Counting the divisors of a given number.
import java.util.Scanner;
class countDivisor
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any Integer : ");
		System.out.print(countDivisor(s.nextInt()));

	}

	public static int countDivisor(int a)
	{
		int i = 0, n = 1 ;
		while(n<=a)
		{
			if(a%n == 0) { i++ ; }
			n++ ;
		}
		System.out.print("The total number of divisors of "+a+" : ");
		return i ;
	}
}
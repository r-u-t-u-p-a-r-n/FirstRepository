// 17. Java programm to print sum of digits.

import java.util.Scanner;
class sumOfAllDigits
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter an Integer : ");
	  sumOfDigits(s.nextInt()); 
	}

	public static void sumOfDigits(int a)
	{
		int i = 0 ;
		while(a>0)
		{
			i+= a%10 ;
			a = a / 10 ;
		}
		System.out.println("The sum of it\'s digits is : "+i) ;
	}
}
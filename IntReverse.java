// 18. Java programm to reverse the given number.

import java.util.Scanner;
class IntReverse
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter an Integer : ");
	  reverse(s.nextInt()); 
	}

	public static void reverse(int a)
	{
		int i = 0 ;
		while(a>0)
		{
			i+= a % 10 ;
			i = i * 10 ;
			a = a / 10 ;
		}
		System.out.println("Reverse of it is : "+i/10);
	}
}	

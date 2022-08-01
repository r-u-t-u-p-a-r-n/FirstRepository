/* 29. Write a Java program to print following alphabet pattern
		A B C D E
		B C D E
		C D E
		D E
		E  */

import java.util.Scanner;
class patternPrint
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number for letter\'s range : ");
		patternPrint(s.nextInt());
	}

	public static void patternPrint(int a)
	{
		System.out.print("The pattern\n\n");
		int i = 0 ;
		char z = 'A' ;
		char chr[] = new char[a] ;
		while(i<a)
		{
			chr[i++] = z++ ;
		}
		i = 0 ;
		int j ;

		while(i<a)
		{
			j = i ;
			while(j<a)
			{
				System.out.print(chr[j++]+" ");
			}
			System.out.print("\n");
			i++ ;
		}
	}
}
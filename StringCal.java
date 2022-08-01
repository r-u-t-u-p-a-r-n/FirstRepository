/* 42. Java program to accept string and count the number of alphabets, digits, spaces,
    special characters & words in the given string.  */

import java.util.Scanner;
class StringCal
{
	public static void main(String args[])
	{
		System.out.print("\nEnter a sentence : ");
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		System.out.println("\nTotal Words : "+countWords(S));
		System.out.println("\nTotal Spaces : "+countSpaces(S));
		countChars(S);
	}

	public static int countWords(String str)
	{
		int i = 0, j = 0 ;
		while(i<str.length())
		{
			if(str.charAt(i++)!=' ')
			{
				j++ ;
				while(i<str.length() && str.charAt(i)!=' ')
				{
					i++ ;
				}
			}
		}
		return j ;
	}

	public static int countSpaces(String str)
	{
		int i = 0, j = 0 ;
		while(i<str.length())
		{
			if(str.charAt(i++)==' ')
			{
				j++ ;
				while(i<str.length() && str.charAt(i)==' ')
				{
					i++ ;
				}
			}
		}
		return j ;
	}

	public static void countChars(String str)
	{
		char C[] = new char[36] ;
		char Z = '0' ;
		int i = 0 ;
		for(char c : C)
		{
			C[i++] = Z++ ;
			if(i == 10)
				Z = 'A' ;
		}
		i = 0 ;
		int j ;
		int Alpha = 0, digits = 0, sp = 0 ;
		while(i<str.length())
		{
			j = 0 ;
			for(char z : C)
			{
				if(str.charAt(i) == ' ')
					break ;
				else
				{
					if((j>9) && (str.charAt(i) == z || (str.charAt(i)+"").equals((z+"").toLowerCase())))
					{
						Alpha++ ; break ;
					}

					else if((j<10) && str.charAt(i) == z)
					{
						digits++ ; break ;
					}
				}
				j++ ;
			}
			i++ ;
			if(j == C.length)
				sp++ ;
		}
		System.out.println("\nTotal Alphabects : "+Alpha);
		System.out.println("\nTotal Digits : "+digits);
		System.out.println("\nTotal Special Characters : "+sp);
	}
}
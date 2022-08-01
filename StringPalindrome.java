// 41. Java program check given String is Palindrome or not.

import java.util.Scanner;
class StringPalindrome
{
	public static void main(String args[])
	{
		System.out.print("\nEnter a string : ");
		Scanner s = new Scanner(System.in);
		if(checkStringPalindrome(s.next()))
			System.out.println("\nIt\'s a palindrome string.");
		else
			System.out.println("\nIt\'s not a palindrome string.");
	}

	public static boolean checkStringPalindrome(String str)
	{
		int i = 0, j = str.length()-1 ;
		while(i<str.length())
		{
			if(str.charAt(i++)!=str.charAt(j--))
				return false ;
		}
		return true ;
	}
}
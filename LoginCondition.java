/* 40. Java program that let the user choose his/her username and password. The program verifies whether the chosen
       username and password are valid. If either one of them is invalid, it notifies the user by raising exception
       and explain the cause of invalidity. The rules for choosing valid usernames and passwords are :

	A username must be of length 6-15 characters,
	A username must start with an uppercase English alphabet A to Z,
	A password must not be shorter than 8 characters but must not exceed 256,
	There cannot be any types of parentheses or whitespaces in a valid username or password,
	A password cannot contain or be the same as it's associated username. */

import java.util.Scanner;
class LoginCondition
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter User Name : ");
		String U ;
		if(checkValues(U = s.nextLine(),6,15,true))
		{
			String P ;
			System.out.print("\nEnter Password : ");
			if(checkValues(P = s.nextLine(),8,256,false))
			{
				if(P.equals(U))
					System.out.println("\nUsername and Password can\'t be same.");
				else
					System.out.println("\nUsername and Password format is correct.");				
			}
		}
	}

	public static boolean checkValues(String str, int a, int b, boolean M)
	{
		Length L = new Length();
		UpperCase U = new UpperCase();
		SpacesAndBrackets SB = new SpacesAndBrackets();
		boolean B[] = new boolean[3] ;
		try
		{
			if(!L.checkLength(str,a,b))
				throw new Length();
			B[0] = true ;
		}
		catch(Length e)
		{
			if(M)
				System.out.print("\nUser name\'s");
			else
				System.out.print("\nPassword\'s");
			System.out.print(" length should be between "+a+" to "+b+" letters.\n");
			B[0] = false ;
		}

		try
		{
			if(M && (!U.checkFirstLetter(str)))
				throw new UpperCase() ;
			B[1] = true ;
		}

		catch(UpperCase e)
		{
			System.out.println("\nUser name\'s first letter should be capital.");
			B[1] = false ;
		}

		try
		{
			if(SB.spaces_Brackets(str))
				throw new UpperCase() ;
			B[2] = true ;
		}

		catch(UpperCase e)
		{
			if(M)
				System.out.print("\nUser name");
			else
				System.out.print("\nPassword");
			System.out.print(" shouldn\'t contain paranthesis or white spaces.\n");
			B[2] = false ;
		}
		if(!M)
			B[1] = true ;
		for(boolean A : B)
		{
			if(!A)
				return false ;
		}
		return true ;
	}
}

class Length extends Exception
{
	public boolean checkLength(String str,int a, int b)
	{
		if(str.length()>((a<b)?a:b)-1 && str.length()<((a<b)?b:a)+1)
			return true ;
		return false ;
	}
}

class UpperCase extends Exception
{
	public boolean checkFirstLetter(String str)
	{
		char z = 'A' ;
		while(z<='Z')
		{
			if(str.charAt(0) == z++)
				return true ;
		}
		return false ;
	}
}

class SpacesAndBrackets extends Exception
{
	public boolean spaces_Brackets(String str)
	{
		int i = 0 ;
		while(i<str.length())
		{
			if(str.charAt(i) == ' ' || str.charAt(i) == '(' || str.charAt(i++) == ')')
				return true ;
		}
		return false ;
	}
}
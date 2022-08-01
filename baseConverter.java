import java.util.Scanner;
class baseConverter
{
	static Scanner s ;
	public static void main(String args[])
	{
		s = new Scanner(System.in);
		mainMenu();
	}

	public static void mainMenu()
	{
		System.out.print("\nFor decimal input ---------------- Press 1.");
		System.out.print("\nFor binary input ----------------- Press 2.");
		System.out.print("\nFor octal-decimal input ---------- Press 3.");
		System.out.println("\nFor hexa-decimal input------------ Press 4.");
		System.out.println("\nFor Exit ------------------------- Press 0.");
		System.out.print("\nINPUT : ");
		options(s.nextInt());
	}

	public static int convertOptions(String[] ARR)
	{
		int i = 1 ;
		while(i<ARR.length)
		{
			System.out.print("\nPress "+(i)+" ------------ for converting "+ARR[0]+" value to "+ARR[i++]+" value.");
		}
		System.out.print("\nPress "+(0)+" ------------ for Main menu.");
		System.out.print("\n\nINPUT : ");
		return s.nextInt() ;
	}

	public static void options(int a)
	{
		switch(a)
		{
		case 1 :
		   System.out.print("\nEnter a decimal number : "); forDecimal(s.nextLong()); break ;

		case 2 :
		   System.out.print("\nEnter a binary number : "); forBinary(s.nextLong()); break ;

		case 3 :
		   System.out.print("\nEnter an octal number : "); forOctalDecimal(s.nextLong()); break ;

		case 4 :
		   System.out.print("\nEnter a hexa-decimal number : ");  forHexaDecimal(s.next()); break ;

		case 0 : System.out.println("\nEXITED.."); break ;

		default : System.out.println("\nInvalid choice, try again."); 
				  mainMenu();  break ;
		}
	}

	public static void forDecimal(long a)
	{
		int base[] = {10,2,8,16};
		final String ARR[] = {"decimal","binary","octal","hexa-decimal"} ;
		changeBase(""+a,ARR,base);
	}

	public static void forBinary(long a)
	{
		int base[] = {2,10,8,16};
		final String ARR[] = {"binary","decimal","octal","hexa-decimal"} ;
		int i = 0 ; long a1 = a ;
		while(a1!=0)
		{
			if(!(a1%10 > -2 && a1%10 < 2))
			{
				System.out.print("\nGiven input is not in "+ARR[0]+" format, try again.\n");
				options(2);
				break ;
			}
			a1 /= 10 ;
		}
		if(a1 == 0)
			changeBase(""+a,ARR,base);
	}

	public static void forOctalDecimal(long a)
	{
		int base[] = {8,10,2,16};
		final String ARR[] = {"octal","decimal","binary","hexa-decimal"} ;
		long a1 = a ;
		while(a1!=0)
		{
			if(!(a1%10>-8 && a1%10 < 8))
			{
				System.out.print("\nGiven input is not in "+ARR[0]+" format, try again.\n");
				options(3);
				break ;
			}
			a1 = a1 / 10 ;
		}
		if(a1 == 0)
			changeBase(""+a,ARR,base);
	}

	public static void forHexaDecimal(String str)
	{
		int base[] = {16,10,2,8};
		char C[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'} ;
		final String ARR[] = {"hexa-decimal","decimal","binary","octal"} ;
		int i = (str.charAt(0)=='-')?1:0,j ;
		while(i<str.length())
		{
			j = 0 ;
			for(char c : C)
			{
				if(c == str.charAt(i))
					break ;
				j++ ;
			}
			if(j == C.length)
			{
				System.out.print("\nGiven input is not in "+ARR[0]+" format, try again.\n");
				options(4);
				break ;
			}
			i++ ;
	    }
	    if(i == str.length())
	    	changeBase(str,ARR,base);
	}

	public static void changeBase(String str,String[] ARR, int[] base)
	{
		int A = convertOptions(ARR);
		while(A!=0)
		{
			if(A == 1 || A == 2 || A == 3)
			{
				System.out.print("\n("+ARR[0]+") "+str+" = ");
				System.out.print(decToAll(allToDec(str,base[0]),base[A]));
				break ;
			}

			else
			{
				System.out.print("\nInvalid choice, try again.\n");
				A = convertOptions(ARR); continue ;
			}
		}
		if(A!=0)
		{
			System.out.print(" ("+ARR[A]+")\n");
			mainMenu();
		}
		else if(A == 0)
			mainMenu();
	}

	public static String decToAll(long a, int b)
	{
		if(a == 0)
			return "0";
		char C[] = {'A','B','C','D','E','F'};
		String H = "" ;
		int i = 0 ; long n = 0 ;
		boolean b1 = a>0?true:false ;
		a = a>0?a:-a ;
		while(a!=0)
		{
			if(b<10)
				n += (long)Math.pow(10,i++)*(a%b) ;
			else
			{
				if(a%b>=10)
					H += C[(int)((a%b)-10)] ;
				else
					H += a%b ;
			}
			a /= b ;
		}
		if(b<10)
			return H+((b1)?n:-n);
		if(!b1)
			H+= '-' ;
		return reverseString(H);
	}

	public static long allToDec(String str, int a)
	{
		char C[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'} ;
		int i = str.length()-1 ;
		int n1 = (str.charAt(0) == '-')?1:0 ;
		int n = 0, m ; long n2 = 0 ;
		while(i>=n1)
		{
			m = 0 ;
			for(char c : C)
			{
				if(c == str.charAt(i))
				{
					n2 += (long)Math.pow(a,n++)*m ; i-- ; break ;
				}
				m++ ;
			}
		}
		return n2 = (str.charAt(0) == '-')?-n2:n2 ;
	}

	public static String reverseString(String str)
	{
		int i = str.length()-1 ;  String H = "" ;
		while(i>=0)
		{
			H+= str.charAt(i--) ;
		}
		return H ;
	}
}
/* 6. Replace digits with 0 and 1 . Given a string of digits, you should replace any digit below 5 with '0'
      and any digit 5 and above with '1'.
      Return the resulting string. Note : input will never be an empty string  */

import java.util.Scanner;
class replaceStrings
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter a number : ");
	  System.out.print(replaceStrings(s.nextInt()));
	}

	public static String replaceStrings(int a)
	{
	  String H = "" ;
	  while(a>0)
	  {
	  	if(a%10 >=5 ) { H+= '1' ; }
	  	else if(a%10<5) { H+= '0' ;}
	  	a = a / 10 ;
	  }
	  String H_rev = "" ;
	  int i = H.length() ;
	  while(i>0)
	  {
	  	H_rev+= H.charAt(i-1);
	  	i-- ;
	  }
	  System.out.print("String updation : ");
	  return H_rev ;
	}
}
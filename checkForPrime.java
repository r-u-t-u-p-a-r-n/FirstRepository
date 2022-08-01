// 11. Prog. to check given number is prime or not.

import java.util.Scanner;
public class checkForPrime
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter an integer : ");
      if(checkForPrime(s.nextInt()))
      {
      	System.out.print("It\'s a prime number.");
      }
      else
      {
      	System.out.print("It\'s not a prime number.");
      }
    }

    public static boolean checkForPrime(int a)
    {
    	int i = 1, num = i-1 ;
    	while(i<=a)
    	{
    		if(a%(i++) == 0) { num++ ; }
    	}
    	if(num == 2) { return true ; }
	else { return false ; }
    }
}
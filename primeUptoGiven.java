// 13. Programm to count all prime numbers upto given number.

import java.util.Scanner;
public class primeUptoGiven
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a number (must be an integer) : ");
      int ll = s.nextInt();
      int i = 1 ;
      System.out.print("Prime numbers upto given number is : ");
      while(i<=ll)
      {
        if(checkForPrime(i)) { System.out.print(i+" "); }
        i++ ;
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
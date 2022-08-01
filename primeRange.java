// 12. Programm to print all prime numbers between given range .

import java.util.Scanner;
public class primeRange
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter lower limit (must be an integer) : ");
      int ll = s.nextInt();
      System.out.print("Enter upper limit (must be an integer) : ");
      int ul = s.nextInt();
      System.out.print("The range of prime numbers is : ");
      while(ll<=ul)
      {
        if(checkForPrime(ll)) { System.out.print(ll+" "); }
        ll++ ;
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
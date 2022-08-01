/* 8. ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but
      exactly 4 digits or exactly 6 digits.
      If the function is passed a valid PIN string, return true, else return false. */

import java.util.Scanner;
public class validatePin
{
  
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a string : ");
    if(validatePin(s.next()))
    {
      System.out.print("Valid PIN");
    }
    else { System.out.print("Invalid PIN"); }
  }

  public static boolean validatePin(String pin)
  {
    if(pin.length()==4 || pin.length()==6)
      {
        int i = 0 ;
        while(i<pin.length())
          {
            if(!check(pin.charAt(i))) { return false ; }
            i++ ;
          }
        return true ;
      }
    else { return false ; }
    
  }
  public static boolean check(char a)
    {
      char NUM[] = {'0','1','2','3','4','5','6','7','8','9'};
      int i = 0 ;
      while(i<10)
        {
          if(a == NUM[i++]) { return true ; }
        }
        return false ;
    }
}
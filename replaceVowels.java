// 10. Replace vowels

import java.util.Scanner;
public class replaceVowels
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a string : ");
      System.out.print(replaceVowels(s.nextLine()));
    }
    public static String replaceVowels(String str)
    {
      int i = 0 ;
      String H = "" ;
      while(i<str.length())
        {
          if(!check(str.charAt(i))) { H+= str.charAt(i) ; }
          i++ ;
        }
      System.out.print("The message after deleting all vowels : ");
      return H ;
    }
  public static boolean check(char a)
    {
      char C[] = {'a','e','i','o','u','A','I','O','E','U',};
      int i = 0 ;
      while(i<10)
        {
          if(a==C[i++]) { return true ; }
        }
      return false ;
    }
}
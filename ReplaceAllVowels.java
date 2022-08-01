/* 43. Java program to accept a string, replace all vowels from the given string with '#' symbol
       & store updated string to a file, using file handling.  */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ReplaceAllVowels
{
       public static void main(String args[]) throws IOException
       {
          Scanner s = new Scanner(System.in);
          System.out.print("\nEnter a sentence : ");
          char C[] = {'A','E','I','O','U'} ;
          writeFile(C,'#',s.nextLine());
       }

       public static void writeFile(char[] C, char c, String S) throws IOException
       {
          String H = "" ;
          boolean B ;
          int i = 0 ;
          while(i<S.length())
          {
              B = false ;
              for(char z : C)
              {
                 B = ((S.charAt(i)+"").compareTo(z+"")==0 || (S.charAt(i)+"").compareTo((z+"").toLowerCase())==0) ; 
                 if(B)
                     break ;
              }
              H+= B?'#':S.charAt(i);
              i++ ;
          }

          File F = new File("#byVowel.txt");
          FileWriter FW = new FileWriter("#byVowel.txt");
          FW.write(H);
          FW.close();
          System.out.println("\nEdited Sucessfully");
       }
}
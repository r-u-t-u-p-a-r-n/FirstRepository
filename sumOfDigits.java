// 3. Sum of Digits / Digital root.
import java.util.Scanner;
class sumOfDigits
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any Integer : ");
    System.out.print(digital_root(s.nextInt()));
  }

  public static int digital_root(int n) 
  {
    if(n%10 == n) { System.out.print("Sum of it\'s digits : "); return n ; }
    else
    {
    int i = 0 ;  
    while(n>0)
      {
        i+= n%10 ;
        n = n / 10 ;
      }
    if(i % 10 == i)  { System.out.print("Sum of it\'s digits : "); return i ; }
    else { return i = digital_root(i); }
        
    }
  }
}  
// 4. Sum of Cubes.
import java.util.Scanner;
class sumOfCubes
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any Integer : ");
    System.out.print(sumOfCubes(s.nextLong()));
  }

  public static long sumOfCubes(long n) 
  {
    long i = 1, n1 = i-1 ;
    while(i<=n)
    {
      n1+= Math.pow(i++,3);
    }
    System.out.print("Sum of cubes : ");
    return n1 ;
  }
}  
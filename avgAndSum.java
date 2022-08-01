// 30. Write a programm in to find the sum and average of all elements of the array.

import java.util.Scanner;
class avgAndSum
{
	public static void main(String args[])
	{
	  System.out.print("Enter the total count of numbers : ");
	  Scanner s = new Scanner(System.in);
	  int H = s.nextInt();
	  double arr[] = new double[H];
	  int i = 0 ;
	  while(i<H)
	  {
	    System.out.print("Enter number "+(i+1)+" :");
	    arr[i++] = s.nextDouble();
	  }

	  System.out.print("The average is : ");
	  System.out.print((float)avg(arr)+"\n");
	  System.out.print("The sum is : ");
	  System.out.print(sum(arr));
	}

	public static double avg(double[] arr)
	{
	  double n = 0 ; int n1 = 0 ;
	  for(double i : arr)
	  {
	    n1++ ;
	    n+= i ;
	  }
	  return n/n1 ;
	}

	public static double sum(double[] arr)
	{
	  double n = 0 ;
	  for(double i : arr)
	  {

	    n+= i ;
	  }
	  return n ;
	}
}
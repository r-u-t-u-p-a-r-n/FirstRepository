/* 34. Java programm to input n number of elements in an array and separate them
       into even and odd two different arrays. */

import java.util.Scanner;
class seperateNumbers
{
	public static void main(String args[])
	{
	  System.out.print("Enter the size of array : ");
	  Scanner s = new Scanner(System.in);
	  int S = s.nextInt();
	  int A[] = new int[S];
	  S = 0 ;
	  for(int i : A)
	  {
	  	System.out.print("Enter Input "+(S+1)+" : ");
	  	A[S++] = s.nextInt();
	  }
	  seperateNumbers(A);
	}

	public static void seperateNumbers(int[] A)
	{
		int m = 0, n = 0 ;
		for(int i : A)              // Counting all odds & even.
		{
			if(i%2 == 0)
				m++ ;
			n++ ;
		}
		int E[] = new int[m] ;     // Array for even numbers.
		int O[] = new int[n-m] ;   // Array for odd numbers.
		m = 0 ; n = 0 ;
		for(int i : A)             // Storing numbers.
		{
			if(i%2 == 0) { E[m++] = i ; }
			else { O[n++] = i ; }
		}

		System.out.print("\nEven number\'s array : ");
		for(int i : E)			   // Display.
		{
			System.out.print(i+" ");
		}

		System.out.print("\nOdd number\'s array : ");
		for(int i : O)			   // Display.
		{
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
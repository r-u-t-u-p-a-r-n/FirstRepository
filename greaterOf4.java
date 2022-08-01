// 21. Find greater between 4 numbers using ternary operators.

import java.util.Scanner;
class greaterOf4
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 4 numbers : ");
		int A[] = {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
		System.out.println(greaterOf4(A));
		
	}

	public static int greaterOf4(int A[])
	{
		int i = 0,j,k ;
		boolean V ;
		while(i<4)
		{
			  j = i+1 ;
			  while(j<4)
			  {
			  	V = (A[i]<=A[j]) ? true : false ;
			  	if(V)
			  	{
			  		k = A[i] ;
			  		A[i] = A[j] ;
			  		A[j] = k ;
			  	}
			  	j++ ;
			  }
			  i++ ;
		}
		System.out.println("The greater number is : ");
		return A[0] ;
	}
}
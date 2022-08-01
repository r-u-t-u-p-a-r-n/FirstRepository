// 33. Java programm to find the second largest element in an array.

import java.util.Scanner;
class secondLargest
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
	  System.out.print('A'>'a');
	  System.out.print("The second largest number among given is : "+secondLargest(A));
	}

	public static int secondLargest(int[] A)
	{
		int m = 0, n = -1 ;
		if(m+1 == A.length)
			return A[0] ;
		while(m!=n)
		{
			n = 0 ;
			for(int i : A)
			{
				if(A[m]<i && n>m)
				{
					A[n] = A[m] ; A[m] = i ;
				}
				n++ ;
			}
			if(m>=1)
			{
				if(A[m-1]>A[m])
					return A[m];
			}
			m++ ;
		}
		return A[0];
	}
}
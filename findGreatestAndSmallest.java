// 35. Java programm to find greatest and smallest number in a given array.

import java.util.Scanner;
class findGreatestAndSmallest
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
	  findGreatestAndSmallest(A);
	}

	public static void findGreatestAndSmallest(int[] A)
	{
		int N = A[0] ;
		for(int j : A)
		{
			if(N<j)
				N = j ;
		}
		System.out.print("\nGreatest among given is : "+N);
		N = A[0] ;
		for(int j : A)
		{
			if(N>j)
				N = j ;
		}
		System.out.print("\nSmallest among given is : "+N+"\n");
	}
}
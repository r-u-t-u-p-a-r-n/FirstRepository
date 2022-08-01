/* 36. Write a menu driven program for array.
       Provide choice to insert, delete, search, display and exit.  */

import java.util.Scanner;
class iDSDE
{
	static Scanner s ;
	public static void main(String args[])
	{
	  System.out.print("\nEnter the size of array : ");
	  s = new Scanner(System.in);
	  int S = s.nextInt();
	  int A[] = new int[S];
	  if(S != 0)
	  	System.out.print("\n");
	  S = 0 ;
	  for(int i : A)
	  {
	  	System.out.print("Enter Input "+(S+1)+" : ");
	  	A[S++] = s.nextInt();
	  }
	  performOperations(A);
	}
	
	public static void performOperations(int[] A)
	{
		System.out.print("\nTo display array ----------------------- Press 1.");
		System.out.print("\nTo insert an element in array ---------- Press 2.");
		System.out.print("\nTo delete an element in array ---------- Press 3.");
		System.out.print("\nTo search an element in array ---------- Press 4.");
		System.out.print("\nFor EXIT ------------------------------- Press 0.\n\n");
		System.out.print("Enter your choice : ");
		switch(s.nextInt())
		{
			case 1 : arrayDisplay(A); break ;
			case 2 : arrayInsert(A);  break ;
			case 3 : arrayDelete(A);  break ;
			case 4 : arraySearch(A);  break ;
			case 0 : System.out.print("\nExited sucessfully.\n"); break ;

			default : System.out.print("Invalid choice, try again.");
				   performOperations(A); break ;
		}
	}  

	public static void arrayDisplay(int[] A)
	{
		System.out.print("\nARRAY : ");
		for(int i : A) { System.out.print(i+" "); }
		System.out.print("\n");
		performOperations(A);
	}

	public static void arrayInsert(int[] A)
	{
		System.out.print("\nEnter a number to insert into array : ");
		int H = 0, n = A.length ;
		int B[] = new int[n+1] ;
		for(int i : A)
		{
			B[H++] = i ;
		}
		B[H] = s.nextInt();
		H = B[H];
		if(A.length == 0)
		{
		  System.out.print("\nElement "+H+" is insterted sucessfully.\n");
		  performOperations(B);
		}
		else
		{
			int P = -1 ;
			while(P!=0)
			{
				System.out.print("\nTo enter element at first position ------------ Press 1.");
				System.out.print("\nTo enter element at last position ------------- Press 2.");
				System.out.print("\nTo enter element at custom position ----------- Press 3.");
				System.out.print("\nFor main menu --------------------------------- Press 0.");
				System.out.print("\n\nINPUT : ");
				P = s.nextInt();
				if(P == 0)
				{
				   performOperations(A);
				}

				else if(P == 1)
				{
					while((P-1)!=n)
					{
						B[n] = B[n-1]; n--;
					}
					B[P-1] = H ;
					System.out.print("\nElement \'"+H+"\' is insterted at first position.\n");
					performOperations(B);
					break ;
				}	

				else if(P == 2)
				{
					System.out.print("\nElement \'"+H+"\' is insterted at last position.\n");
					performOperations(B);
					break ;
				}	

				else if(P == 3)
				{
					System.out.print("\nEnter the position number : ");
					P = s.nextInt();
					if(P>0 && P<=n)
					{
						while((P-1)!=n)
						{
							B[n] = B[n-1]; n--;
						}
						B[P-1] = H ;
						System.out.print("\nElement \'"+H+"\' is insterted at position "+P+" .\n");
						performOperations(B);
						break ;
					}	
					else
					{
						System.out.print("\nInvalid position number, can\'t insert. Try again.\n");
						continue ;
					}
				}

				else
					System.out.print("\nInvalid choice, try again.\n");
			}	
		}	
	}

	public static void arrayDelete(int[] A)
	{
		if(A.length == 0)
		{
		   System.out.print("\nCan\'t perform delete operation on an empty array.\n");
		   performOperations(A);
		}
		else
		{
			System.out.print("\nDelete by position number -------- Press 1\n");
			System.out.print("Delete by element\'s value -------- Press 2\n");
			System.out.print("For main menu -------------------- Press 0\n");
			System.out.print("\nEnter your choice : ");
			int H = s.nextInt();
			while(true)
			{
				if(H == 0)
				{
					performOperations(A);
					break ;
				}
				else if(H == 1)
				{
					System.out.print("\nEnter position number : ");
					int I = s.nextInt();
					I-- ;
					int n = 0 ;
					for(int i : A)
					{
						if((n++) == I)
						{
							displayMessage("Element found at position : "+n+" is \'"+i+"\', deleted sucessfully.");
							System.out.print("\n");
							break ;
						}
					}
					if((--n) == I)
					{
						n = 0 ;
						for(int i : A) { n++; }
						int B[] = new int[--n] ;
						n = 0 ;
						for(int i : A)
						{
							if(n==I)
							{
							  I = -1 ;
							  continue ;
							}
							B[n++] = i ;
						}
						performOperations(B);
						break ;
					}
					else
					{
						System.out.print("\nCan\'t be deleted, due to invalid position number. Try again.\n");
						arrayDelete(A);
						break ;
					}
				}
				else if(H == 2)
				{
					System.out.print("\nEnter element\'s value : ");
					int I = s.nextInt();
					int n = 0 ;
					int m = 0 ;
					for(int i : A)
					{
						if(i == I)
						{
							System.out.print("\nYour element \'"+I+"\' is found at position : "+(n+1));
							System.out.print("\nTo delete this, press "+(n+1)+" .\n");
							m++ ;
						}
						n++ ;
					}
					if(m!=0)
					{
						H = 1 ; continue ;
					}
					else
					{
						System.out.print("\nThe Element \'"+I+"\' is not found in the array, try again.\n");
						arrayDelete(A);
						break ;
					}
				}
				else
				{
					System.out.print("\nInvalid choice, try again.\n");
					arrayDelete(A);
				}
			}
		}
	}

	public static void arraySearch(int[] A)
	{
		System.out.print("\nEnter element's value : ");
		int I = s.nextInt();
		int n = 0,m = 0 ;
		for(int i : A)
		{
			if(i == I)
			{
				System.out.print("\nYour element \'"+I+"\' is found at position : "+(n+1)+"\n");
				m++ ;
			}
			n++ ;
		}
		if(m == 0)
			System.out.print("\nThere\'s no element \'"+I+"\' in the array.");
		performOperations(A);
	}

	public static void displayMessage(String str)
	{
		int i = 0 ;
		System.out.print("\n");
		while(i<str.length()+2)
		{
		  System.out.print('*'); i++ ;
		}
		System.out.print("\n "+str+" \n");
		i = 0 ;
		while(i<str.length()+2)
		{
		  System.out.print('*'); i++ ;
		}
	}
}
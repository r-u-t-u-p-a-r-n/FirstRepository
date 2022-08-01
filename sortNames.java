// 31. Write a java programm to sort the given names.

import java.util.Scanner;
class sortNames
{
	public static void main(String args[])
	{
	  System.out.print("\nEnter the total count of names : ");
	  Scanner s = new Scanner(System.in);
	  int H = s.nextInt();
	  String str[] = new String[H];
	  int i = 0 ;
	  System.out.print("\n");
	  while(i<H)
	  {
	    System.out.print("Enter name "+(i+1)+" : ");
	    str[i++] = s.next();
	  }

	  System.out.print("\nEnter 1 for ascending sort, and 2 for descending sort : ");
	  switch(s.nextInt())
	  {
	  	case 1 : System.out.println("\nAscending sort :"); str = sortAsc(str); 
			  		System.out.println();
			  		for(String j : str)
					{
						System.out.println(j);
					}
	  				break ;
	  	case 2 : System.out.println("\nDescending sort :"); str = sortDesc(str);
	  				for(String j : str)
					{
						System.out.println(j);
					}
	  				break ;
	  	default : System.out.print("\nInvalid choice, try again..\n"); break ;
	  }
	}

	public static String[] sortAsc(String[] str)
	{
		int m = 0, p,n = m-1 ;
		while(m!=n)
		{
			n = 0 ;
			for(String i : str)
			{
				if(n>m)
				{
					p = 0 ;
					while(true)
					{
						if(str[m].charAt(p)==i.charAt(p))
						{
							if(p == (str[m].length()>=i.length()?i:str[m]).length()-1)
							{
								if(str[m].length()>i.length())
								{
								   str[n] = str[m] ;  str[m] = i ; break ;
								}
								else
									break ;
							}
							p++ ;
							continue ;
						}
						else if(str[m].charAt(p)<i.charAt(p))
							break;
						else
						{
							str[n] = str[m] ;  str[m] = i ; break ;
						}
					}
				}
				n++ ;
			}
			m++; 
		}
		return str ;
	}

	public static String[] sortDesc(String[] str)
	{
	   int m = 0, p,n = m-1 ;
		while(m!=n)
		{
			n = 0 ;
			for(String i : str)
			{
				if(n>m)
				{
					p = 0 ;
					while(true)
					{
						if(str[m].charAt(p)==i.charAt(p))
						{
							if(p == (str[m].length()>=i.length()?i:str[m]).length()-1)
							{
								if(str[m].length()<i.length())
								{
								   str[n] = str[m] ;  str[m] = i ; break ;
								}
								else
									break ;
							}
							p++ ;
							continue ;
						}
						else if(str[m].charAt(p)>i.charAt(p))
							break;
						else
						{
							str[n] = str[m] ;  str[m] = i ; break ;
						}
					}
				}
				n++ ;
			}
			m++; 
		}
		return str ;
	}
}
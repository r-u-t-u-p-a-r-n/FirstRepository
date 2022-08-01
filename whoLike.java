// 5. Who likes it ?

import java.util.Scanner;
class whoLike
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter total user\'s count : ");
	  int num = s.nextInt() ;
	  String str[] = new String[num] ;
	  int i = 0 ;
	  while(i<num)
	  {
	  	System.out.print("Enter user\'s name : ");
	  	str[i++] = s.next();
	  }
	  System.out.println(whoLike(str));
	}

	public static String whoLike(String Arr[])
	{
	  int i = 0 ;
	  for(String h : Arr)
	  {
	    i++ ;
	  }
	  if(i == 0)  { return "No one liked this." ; }
	  else if(i == 1) { return Arr[i-1]+" likes this." ; }
	  else if(i == 2) { return Arr[i-2]+" and "+Arr[i-1]+" likes this." ; }
	  else {  return Arr[0]+" and "+(i-1)+" others likes this." ;  }
	}
}
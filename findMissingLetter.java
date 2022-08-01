/* 9. Write a method that takes an array of consecutive (increasing) letters as input
      and that returns the missing letter in the array. */

class findMissingLetter
{
	public static void main(String args[])
	{
	    char ARR[] = {'a','b','c','e','f','g'};
	    System.out.print(findMissingLetter(ARR));
	}

	public static char findMissingLetter(char[] array)
	{
		char i = array[0] ;
		int n = 0 ;
		while(i<='z')
		  {
		    if(i != array[n++]) { return i ; }
		    i++ ;
		  }
		return ' ' ;
	}
}
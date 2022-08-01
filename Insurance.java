/* 24. Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
		If driver is married
		If driver is unmarried male and age above 30
		If driver is unmarried female and age above 25  */

import java.util.Scanner;
class Insurance
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Reveal Martial Status\nPress 1 for Married & 2 for Unmarried : ");
	  int A = s.nextInt();
	  switch(A)
	  {
	    case 1 : System.out.print("You are eligible for insurance."); break ;
	    case 2 : 
	             System.out.print("Reveal Gender\nPress 1 for Male & 2 for Female : ");
	             int B = s.nextInt();
	             System.out.print("Reveal Age : ");
	             int C = s.nextInt();
	             switch(B)
	             {
	               case 1 : 
	               		if(C>=30) { System.out.print("You are eligible for insurance."); }
	               		else { System.out.print("You aren\'t eligible for insurance, due to less age."); }
	               		break ;

	               case 2 :
	                    if(C>=25) { System.out.print("You are eligible for insurance."); }
	               		else { System.out.print("You aren\'t eligible for insurance, due to less age."); }
	               		break ;
	             }
	             break ;

	    default : System.out.print("Invalid input, please read the input details.");
	  }
	}
}
/* 26. Write a program to input electricity unit charge and calculate the total electricity bill
       according to the given condition:
		For first 50 units, Rs. 0.50/unit
		For next 100 units, Rs. 0.75/unit
		For next 100 units, Rs. 1.20/unit
		For unit above 250, Rs. 1.50/unit
		An additional surcharge of 20% is added to the bill.  */

import java.util.Scanner;
class totalElectricityBill
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Specify the total units : ");
		double U = s.nextDouble();  // U = Total Units
		double bill = 0 ;
		double UB[][] = {{50,0.50},{100,0.75},{100,1.20},{0,1.50}} ;
		int i = 0  ;
		while(i<3)
		{
		  if(U>=UB[i][0])
		  {
		  	bill+= billPerUnit(UB[i][0],UB[i][1]); U-= UB[i][0];
		  }
		  else
		  {
		  	bill+= billPerUnit(U,UB[i][1]);  	U = 0 ;
		  }
		  i++ ;
		  if(U==0) { break ; }
		}

		System.out.print("The total bill including extra 20% surcharge is "+(int)(bill+(20*bill)/100)+" Rs.");
	}

	public static double billPerUnit(double U, double P)
	{
		double miniBill = 0 ;
		while(U>0)
		{
			miniBill+= P ;
			U-- ;
		}
		return miniBill ;
	}
}
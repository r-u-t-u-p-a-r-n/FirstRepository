  /* 25. Write a Java program for bonus calculation. Accept basic salary from user. 
       Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary. If basic >= 20,000 then give
       10% bonus otherwise give 20% bonus on basic salary. Calculate his gross (final) 
       salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)  */

import java.util.Scanner;
class bonusCalculation
{
  public static void main(String args[])
  {
  	Scanner s = new Scanner(System.in);
  	System.out.print("Specify your salary : ");
  	double SL = s.nextDouble();  // SL = Basic Salary
  	double Bonus = 0 ;

    System.out.println();
    if(SL>=20000)
    {
      System.out.print("Your bonus : "+percentCalculation(10,SL)+" Rs."); 
      Bonus =  percentCalculation(10,SL) ;
    }

    else if(SL<0)
    {
      System.out.print("Salary can\'t be negative, try again.");	
    }

    else
    {
      System.out.print("Your bonus : "+percentCalculation(20,SL)+" Rs.");
      Bonus =  percentCalculation(20,SL) ;
    }  	
  	System.out.print("\nGross Salary : ");
  	System.out.print((SL+percentCalculation(15,SL)+percentCalculation(10,SL)+percentCalculation(20,SL)+Bonus-percentCalculation(12,SL)));
  	System.out.print(" Rs.");
  }

  public static double percentCalculation(double A, double T)
  {
  	return (A*T)/100 ;
  }
}
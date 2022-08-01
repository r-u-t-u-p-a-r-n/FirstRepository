/* 38. Declare a class name ‘A’ with some methods and one parameterised constructor.
       Derive another class ‘B’ from ‘class A’. In class B have some methods and parameterized constructor.
       Derive Class C from class B Demonstrate how base class parameterised constructor gets call from child class
       constructor in multilevel inheritance.  */

import java.util.Scanner;
public class multilevelInheritance
{
	public static void main(String args[])
	{
		System.out.print("Enter a number : ");
		Scanner s = new Scanner(System.in);
		C c = new C(s.nextInt());
	}
}

class A
{
	private int A ;
	public A(int a)
	{
		System.out.println("The square of "+a+" is "+(a*a));
	}
}

class B extends A
{
	public B(int b)
	{
		super(b);
		if(b%2 == 0)
			System.out.println(b+" is even.");
		else
			System.out.println(b+" is odd.");
	}
}

class C extends B
{
	public C(int c)
	{
		super(c);
		if(c>=0)
			System.out.println(c+" is positive.");
		else
			System.out.println(c+" is negative.");
	}
}
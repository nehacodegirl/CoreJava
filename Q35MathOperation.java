/*35.	Create a class MathOperation that has 
four static methods. add() method that takes two integer 
numbers as parameter and returns the sum of the numbers.
 subtract() method that takes two integer numbers 
as parameter and returns the difference of the numbers. 
multiply() method that takes two integer numbers as 
parameter and returns the product.
 power() method that takes two integer numbers as 
parameter and returns 
the power of first number to second number. */

import java.lang.Math;
import java.util.*;

class MathOp{
	
	
	static int add(int a, int b)
	{
		return a+b;
	}

	static int substract(int a, int b)
	{
		return a-b;
	}

	static int multiply(int a, int b)
	{
		return a*b;
	}

	static int power(int a , int b)
	{
		int ret = (int) Math.pow(a, b);
		return ret;
	}

	static void show(int res){
	System.out.println(res);
	}

	
}

class Q35MathOperation{
	public static void main(String args[])
	{

           Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();

		int p = MathOp.add(a,b);
		int q = MathOp.substract(a,b);
		int r = MathOp.multiply(a,b);
		int s = MathOp.power(a,b);
		MathOp.show(p);
		MathOp.show(q);
		MathOp.show(r);
		MathOp.show(s);
		
	}
}
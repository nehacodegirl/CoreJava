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

import java.math.*;
class Mathope{
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
		return Math.pow(a,b);
	}

	static void show(int res){
	System.out.println(res);
	}
}

class Q35MathOperation{
	public static void main(String args[])
	{
		int p =Mathope.add(10,5);
		int q =Mathope.substract(10,5);
		int r =Mathope.multiply(10,5);
		int s =Mathope.power(10,5);
		MathOpe.show(p);
		MathOpe.show(q);
		MathOpe.show(r);
		MathOpe.show(s);
	}
}
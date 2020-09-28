/*36.	Create a class MathOperation 
containing overloaded methods ‘multiply’
 to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
 */

import java.lang.Math;
import java.util.*;

class Mathcal{
	
	static void multiply(int a ,int b)
	{
		int k= a*b;
		System.out.println(k);
	}

	static void multiply(float a,float b,float c)
	{
		float k = a*b*c;
		System.out.println(k);
	}

	static void multiply(double a,int b)
	{
		double k = a*b;
		System.out.println(k);
	}

	static void multiply(int ar[])
	{
		double mul=1;
		for(int i=0; i<ar.length; i++)
		{
			
			 mul =mul* ar[i];
		}
		System.out.println(mul);
	}

	

	
}

class Q36MathOperation{
	public static void main(String args[])
	{

           int arr[] = new int[] {3,4,5,6,7,8};
		 Mathcal.multiply(5,6);
		Mathcal.multiply(5.6f,6.7f,9.8f);
		Mathcal.multiply(1000d,9);
		Mathcal.multiply(arr);
		
	}
}
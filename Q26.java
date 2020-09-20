/*26.	Create an array of 17 elements in 5 rows.  
And calculate sum of all elements.*/

import java.util.*;
class Q26{
	public static void main(String args[])
{
	Scanner s =new Scanner(System.in);
	int arr1[]=  new int[3];
	int arr2[]= new int[4];
	int arr3[]= new int[3];
	int arr4[]= new int[4];
	int arr5[]= new int[3];
	int ar[][] = new int[5][];
	ar[0]=arr1;
	ar[1]=arr2;
	ar[2]=arr3;
	ar[3]=arr4;
	ar[4]=arr5;
	int sum=0;
	for(int i=0; i<ar.length; i++)
	{
		for(int j=0; j<ar[i].length; j++)
		{
			System.out.println("Enter element");
			ar[i][j]=s.nextInt();
			sum+=ar[i][j];
		}
	}
	
	for(int a[] : ar)
	{
		for(int b : a)
			{
				System.out.print(" "+b);
			}
		System.out.println(" ");
	}
		System.out.println("Sum of all elements "+sum);	
}
}
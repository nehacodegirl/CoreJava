/*29.	Write a program to print the total number of one-D arrays in a two-D array and the number of 
elements in every one-D array present in the two-D arrays*/

import java.util.*;
class Q29{
	public static void main(String args[])
{
	int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int count=0;
	int sum=0;
	for(int i=0; i<arr.length; i++)
	{
		for(int j=0; j<arr[i].length; j++)
		{
			System.out.print(arr[i][j]+" ");
			sum+=arr[i][j];
		}
			System.out.println(" ");
		count++;
		
	}
		System.out.println("1D arrays "+count);
		System.out.println("Sum of all elements of arrays "+sum);


	
	
	
}
}
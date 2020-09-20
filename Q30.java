/*	30.	Create an integer type 2-D array of size [3X3]. Take the elements from the user and then 
calculate the sum of the elements present in the diagonal*/

import java.util.*;
class Q30{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in) ;
	int arr[][] = new int[3][3];
	int count=0;
	int sum=0;
	for(int i=0; i<arr.length; i++)
	{
		for(int j=0; j<arr[i].length; j++)
		{
			System.out.println("Enter element");
			arr[i][j]=s.nextInt();
			if(i==j)
			{
			sum+=arr[i][j];
			}
		}
			
		count++;
		
	}
		for(int ar[] : arr){
			for(int b :ar){
				System.out.print(" "+b);
			}
			System.out.println(" ");
		}

		System.out.println("1D arrays "+count);
		System.out.println("Sum of Diagonal elements of arrays "+sum);


	
	
	
}
}
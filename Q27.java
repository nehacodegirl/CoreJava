/*28.	Initialize one String type of array and print the elements using for each loop.*/

import java.util.*;
class Q27{
	public static void main(String args[])
{
	Scanner s =new Scanner(System.in);
	System.out.println("Number of array elements");
	int num = s.nextInt();
	int arr[]=  new int[num];
	
	for(int i=0; i<arr.length; i++)
	{
		
			System.out.println("Enter element");
			arr[i]=s.next();
			
		
	}
	
	for(int a : arr)
	{
		
		System.out.print(" "+a);
	}
		Arrays.sort(arr);
		System.out.println(" ");
		System.out.println("Smallest element of array "+arr[0]);
		System.out.println("Largest element of array "+arr[num-1]);
		
}
}
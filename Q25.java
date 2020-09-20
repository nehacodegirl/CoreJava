/*25.	Write the program to find the sum of even elements 
and sum of odd elements present in the array of integer type.*/

import java.util.*;
public class Q25{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int arr[] = new int[num];
	for(int i=0; i<arr.length; i++){
	arr[i] = sc.nextInt();
	}
    
	int sumE=0;
	int sumO=0;
      for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                sumE = sumE + arr[i];
            }
            else
            {
                sumO = sumO + arr[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);

	
	
	
}
}
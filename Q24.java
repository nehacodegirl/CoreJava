/*24.	Write a program to search an element in the array*/
import java.util.*;
public class Q24{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int arr[] = new int[num];
	for(int i=0; i<arr.length; i++){
	arr[i] = sc.nextInt();
	}

	
	
	System.out.println("Enter index to search element ");
	int b = sc.nextInt();
	for(int i=0; i<arr.length; i++){
	if(i == b)
	{
	 System.out.print(arr[i]);	
	}
	}	
}
}
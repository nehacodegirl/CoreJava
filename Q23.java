/*23.	Write a program to reverse the array elements.*/
import java.util.*;
public class Q23{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int arr[] = new int[num];
	for(int i=0; i<arr.length; i++){
	arr[i] = sc.nextInt();
	}

	
	for(int i= arr.length-1; i>=0; i--)
	{
		System.out.print(arr[i]+" ");
	}	
}
}
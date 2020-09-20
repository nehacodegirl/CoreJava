/*22.	Sort a ten element array in descending order.*/
import java.util.*;
public class Q22{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int arr[] = new int[num];
	for(int i=0; i<arr.length; i++){
	arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	for(int i= arr.length-1; i>=0; i--)
	{
		System.out.print(arr[i] +" " );
	}	
}
}

/*58.	Store name of weekdays in an array (starting from “Sunday” at 0 index). 
 * Ask day position from user and print day name. Handle array index out of bound 
 * exception and give proper
 *  message if user enter day index outside range (0-6). */

package p3;
import java.util.Scanner;
public class Q58 {
	public static void main(String args[]) {
	String weekdays[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
		try {
			
	   if (num > weekdays.length) {
		int num1=num;
		System.out.println("Please enter a day between 1 to 7");
	            }
	   
		   
		}catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println(e);
		}
		
		System.out.println(weekdays[num-1]);
		sc.close();   
	
}
}

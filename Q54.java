/*54.	Write a program to reverse the given String.*/

package p3;
import java.util.Scanner;


public class Q54 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String reverse="";
		System.out.println("Enter string");
		String line = sc.nextLine();
		
		for(int i =line.length()-1; i>=0; i--) {
			 reverse = reverse + line.charAt(i);
			
		}
		System.out.println(reverse);
	}

}

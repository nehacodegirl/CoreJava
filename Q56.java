/*56.	Write a program to convert very first character of every 
 * word in uppercase in a String.*/
package p3;
import java.util.Scanner;

public class Q56 {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in); 
		String line = sc.nextLine();
		//StringBuilder name = new StringBuilder(line);
		String word[] = line.split(" ");
		for(String a : word)
		{
			
			String s1 = a.substring(0, 1).toUpperCase();
		    String nameCapitalized = s1 + a.substring(1);
		    System.out.print(" "+nameCapitalized);
		}
		
		   
	    
	}

}

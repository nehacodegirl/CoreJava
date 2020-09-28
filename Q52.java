
/*52.	Input name of a person and count how many vowels it contains.  Use String class functions. */
package p3;
import java.util.Scanner;
public class Q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter your name");
			int vowel = 0;
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			for(int i=0; i<name.length(); i++)
			{
				char ch = name.charAt(i);
				
				if(ch == 'a' || ch == 'e' || ch == 'i'
		                || ch == 'o' || ch == 'u') {
		                ++vowel;
		            }
			}
			 System.out.println("Vowels: " + vowel);
	}

}

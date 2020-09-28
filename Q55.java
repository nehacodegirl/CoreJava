/*55.	Write a program to count no of words in the String.*/
package p3;
import java.util.Scanner;
public class Q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String line = sc.nextLine();
		String word[] = line.split(" ");
		int count=0;
		for(String name : word)
		{
			System.out.println(name);
			count++;
		}
		System.out.println("No of words in a String : "+count);
	}

}

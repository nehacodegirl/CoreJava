/*63.	Write a program to count how many times character ‘t’ occurs in a file. */
package assignment;
import java.io.*;
public class Q63 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileReader f = 
				new FileReader("C:\\Users\\Pratik\\Desktop\\cdac-java\\File\\3.txt");
		int ch = -1;
		int count=0;
		while((ch = f.read()) != -1) {
			if(ch=='t') {
				count++;
			}
			
			System.out.print((char)ch);
			
		}
		System.out.println(" ");
		System.out.println("Number of t in file : "+count);
		f.close();
		System.out.println("success");
	}

}

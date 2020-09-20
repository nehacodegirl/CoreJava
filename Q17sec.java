/*17.	Write a program to reverse a given number.*/

import java.util.*;
public class Q17sec{
public static void main(String args[])
{
	Scanner c = new Scanner(System.in);
	System.out.println("enter a number");
	String str = c.next();
	String str2 = "";
	for(int i = str.length()-1; i>=0;i--)
	{
		str2 += str.charAt(i);
	}
	System.out.println("reverse  number " +str2);
}
}
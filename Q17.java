/*17.	Write a program to reverse a given number.*/

import java.util.*;
public class Q17{
public static void main(String args[])
{
	Scanner c = new Scanner(System.in);
	System.out.println("enter a number");
	int n = c.nextInt();
	int re = 0;
	while(n>0)
	{
		int num = n%10;
		re = re*10+num;
		n=n/10;
        }
	System.out.println("Reverse number "+re);
}
}
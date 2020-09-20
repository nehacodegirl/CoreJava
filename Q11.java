/*11.	Write a program to swap two numbers without using
 third variable.*/

import java.util.*;
public class Q11{
	public  static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number ");
 	int a = sc.nextInt();
System.out.println("Enter 2nd number ");
	int b = sc.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
System.out.println("1st number is "+a);
System.out.println("2nd number is "+b);
}
}
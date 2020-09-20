/*13.	Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator 
( logical operator) ]*/

import java.util.*;
public class Q13{
	public  static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter three number ");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();

	
int greatest = (num2>num3) ? ((num2>num1) ? num2 : num1):((num3 > num1) ? num3 : num1);
System.out.println("Greatest number is "+greatest);
}
}
 
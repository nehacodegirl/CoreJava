/*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle
*/

import java.util.*;
public class Q6{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Radius");
	int radius = sc.nextInt();
	double PI = 3.14;
	double area = Math.pow(radius,2)*PI;
	System.out.println(area);
	double circum = 2*PI*radius;
	System.out.println(circum);

}
}
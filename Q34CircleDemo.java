/*34.	Create a class Circle that has two data members,
 one to store the radius and another to store area and 
three methods first init() method to input radius from user,
 second calculateArea() method to calculate area of circle
 and third display() method to display values of radius and 
area. Create class CircleDemo ( main class) that creates the
 Circle object and calls init(), 
calculateArea() and display() methods.
*/

import java.util.*;
class Circle{
	static float radius;
	 static double area;
	void init(float radius)
	{
		
		this.radius=radius;
	}

	static double calculateArea()
	{
		area=3.14*radius*radius;
		return area;  
	}

	 void display(double res)
	{
		System.out.println("Area of circle "+res);
	}
}

class Q34CircleDemo{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Radius");
	float r = sc.nextInt();
	 Circle c = new Circle();
		c.init(r);
		double res=Circle.calculateArea();
		c.display(res);

}
}
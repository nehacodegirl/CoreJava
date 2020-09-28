/*	39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )

 */

import java.lang.Math;
import java.util.*;

class Product{
	private int pid;
	 double price;
	private int quantity;

	Product(int pid,double price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}


	void show()
	{
		System.out.println(pid+" "+price+" "+quantity);	
	}
	
	

	
       
}

class Q39ProductDemo{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Product arr[] = new Product[5];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter pid");
			int pid = sc.nextInt();
			System.out.println("Enter price");
			double price = sc.nextDouble();
			System.out.println("Enter Quntity");
			int quantity = sc.nextInt();
			Product p = new Product(pid,price,quantity);
			arr[i] = p;
			
			
			
		}
			for(Product a : arr){
			if(a.price){
		a.show();}
}
	}
}
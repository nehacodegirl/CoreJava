/*
49.	Create Interface Taxable with members 
salesTax=7% and incomeTax=10.5%. create abstract 
method calcTax(). 
a. Create class Employee(empId,name,salary) and
 implement Taxable to calculate incomeTax on yearly 
salary. 
b. Create class Product(pid,price,quantity) 
and implement Taxable to calculate salesTax on unit 
price of product. 
c. Create class for main 
method(Say XYZ), accept employee information and a
 product information from user and print 
income tax and sales tax respectively.
*/

import java.util.Scanner;

interface Taxable{
double salesTax=0.07;
double incomeTax = 0.105;

void calcTax();

}

class Employee implements Taxable{
int empId;
String name;
double salary;

Employee(){}

Employee(int empId,String name,double salary){
	this.empId=empId;
	this.name=name;
	this.salary=salary;
}

	public void calcTax(){
	double incometax1 = salary*incomeTax;
	System.out.println("Total yearly income Tax is "+incometax1);
}

}


class Product implements Taxable{
	int pid;
	double price;
	int quantity;

	Product(){}

	Product(int pid, double price, int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}

	public void calcTax(){
		double salesTax1=(price*quantity)*salesTax;
		System.out.println("Total salestax is "+salesTax1);	
	}
}

class Q49{
public static void main(String args[]){
	Taxable t = new Employee(1,"jack",15000);
	Taxable t1 = new Product(1,400,5);
	t.calcTax();
	t1.calcTax();
}
}
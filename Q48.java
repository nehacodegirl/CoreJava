/*48.	Create an Abstract class Processor with int 
member variable data  and method showData to display
 data value. Create abstract method process() to 
define processing of member data. Create a class  
Factorial using abstract class Processor  to 
calculate and print factorial of a number by 
overriding the process method. 
b. Create a class Circle using abstract class 
Processor to calculate and print area of a circle 
by overriding the process method.Ask user to enter 
choice (factorial or circle area).  
Also ask data to work upon. Use Processor class 
reference to achieve this mechanism.*/


abstract class Processor{
	double data;
	abstract void process();
	void showData(){
	System.out.println(data);
}
}

class Factorial extends Processor{
	void process(){
	int n=5;
	int sum=1;
	for(int i=1; i<=n; i++)
	{
		sum=sum*i;
	}
		data = sum;
 }

}

class Circle extends Processor{
void process(){
int r=5;
double area;
area= 3.14f*r*r;
data = (double) area;
}
}

class Q48{
public static void main(String args[])
{
	Processor p = new Factorial();
	Processor p1 = new Circle();
	p.process();
	p1.process();
	p.showData();
	p1.showData();

}
}
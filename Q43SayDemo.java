/*43.	Create a class OneBHK with instance variables roomArea,
 hallArea and price. Then create default constructor that 
initializes instance variables with some values and a 
parameterized constructor that takes values for all instance 
variables and stores them in instance variables. 
Now create a method named show()  to print OneBHK’s instance 
variable values.
Create another class TwoBHK which has (inherites) 
all the properties and behaviors of OneBHK and a new instance 
variable room2Area. Then create default constructor to initialize
 all 4 instance variables and a parameterized constructor to take 
the values for initialization of all instance variables. 
Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three
 TwoBHK flat’s information and print information using show method. Also print total amount of all flats. 
*/

class OneBHK{
	protected double roomArea;
	protected double hallArea;
	private  double price;

	OneBHK(){
		double roomArea=0;
	        double hallArea=0;
	 	double price=0;

	}

	OneBHK(double roomArea,double hallArea,double price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}

	double  gettotal(){
		
		return price;
	}
	void show(){
		System.out.println(roomArea+" "+ hallArea+" "+ price);
	}
}

class TwoBHK extends OneBHK{
	private double room2Area;

	TwoBHK(){
		super();
		double room2Area=0;
	}
	
	TwoBHK(double roomArea,double hallArea,double price,double room2Area)
	{
		super(roomArea,hallArea,price);
		this.room2Area=room2Area; 

	}

	void show(){
		super.show();
		System.out.println(" "+room2Area);
	}

}


class Q43SayDemo{
	public static void main(String args[])
	{
		OneBHK flat[] = { new TwoBHK(300, 400,2030000 ,300),
					new TwoBHK(400, 500,3030000,400),
				new TwoBHK(500, 700,5030000,500)};		
		
		double total=0;
		for(OneBHK a:flat)
		{
			a.show();
			
			
		}

		for(OneBHK a:flat)
		{
			if(a.gettotal()!=0)
			
			total+=a.gettotal();
			

		}
		System.out.println("Total price of all flats : "+total);
		
	}
}
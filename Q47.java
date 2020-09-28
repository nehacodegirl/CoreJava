/*47.	Create a program to demonstrate constructor chaining.*/

class Abc
{
	Abc()
	{
		System.out.println("No-args constructor Abc");
	}

	Abc(int i)
	{
		System.out.println("Parametrized constructor Abc");
	}
}

class Pqr extends Abc
{
	Pqr()
	{
		System.out.println("No-args constructor Pqr");
	}

	Pqr(int i)
	{
		System.out.println("Parametrized constructor Pqr");
	}
}

class Q47
{
	public static void main(String args[])
	{
		Pqr p = new Pqr();
		Pqr p1 = new Pqr(11);
	}
}
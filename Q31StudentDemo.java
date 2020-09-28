/*31.	Create a class Student with 2 data members rno 
and name. Create one method setData() that takes roll number
 and student name as parameter and stores them in data members rno and name. 
Create one more method showData() to print the data member values. 
Create another class ( main class) StudentDemo that creates Student 
class object and calls setData() and showData() methods.*/

class Student{
	private int rno;
	private String name;
	static int count=0;
	void setData(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}

	void showData()
	{
		System.out.println(rno+" "+name);
		
	}

		
}

class Q31StudentDemo{
		public static void main(String args[])
	{
		Student s = new Student();
		Student.count++;
		s.setData(1,"Neha");
		s.showData();
		Student s1 = new Student();
		Student.count++;
		s1.setData(2,"Amrita");
		s1.showData();
		System.out.println(Student.count);
	}
}
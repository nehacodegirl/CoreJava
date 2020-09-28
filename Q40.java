/*40.	Create a class Student having data members name, roll no.,
 age and score. Write a program to accept 10 records of student and 
store them in an array. And then arrange the student records based 
on the score group [0-50], [50-65], [65-80], [80-100].*/

class Student{
private String name;
private int rollNo;
private int age;
private int score;

Student(String name,int rollNo,int age,int score)
{
	this.name=name;
	this.rollNo=rollNo;
	this.age=age;
	this.score=score;
}

int getscore(){return score;}
void show()
{
	System.out.println(" Name : "+name+" Roll No : "+rollNo+" Age : "+age+" Score : "+score);
}
}

class Q40{
	public static void main(String args[]){
	Student s[] = {new Student("Neha",23,25,80),
			new Student("Pratik",34,30,70),
			new Student("Rahul",24,25,45),
			new Student("Pooja",25,25,68),
			new Student("Arti",11,25,78),
			new Student("Vikas",45,25,89),
			new Student("Shweta",56,25,54),
			new Student("Rupali",27,25,34),
			new Student("Monika",22,25,64),
			new Student("Ashish",28,25,52),
			new Student("Akash",29,25,95)} ;
	for (Student a : s) {
            a.show();
	
        }
	System.out.println("==============================");
	System.out.println("Students have score in range 0-50");
	for (Student a : s) {
		if(a.getscore()>0 && a.getscore()<=50)
            a.show();
        }
	System.out.println("Students have score in range 50-65");
	for (Student a : s) {
		if(a.getscore()>50 && a.getscore()<=65)
            a.show();
        }
	System.out.println("Students have score in range 65-80");
	for (Student a : s) {
		if(a.getscore()>65 && a.getscore()<=80)
            a.show();
        }
	System.out.println("Students have score in range 80-100");
	for (Student a : s) {
		if(a.getscore()>80 && a.getscore()<=100)
            a.show();
        }


}

}
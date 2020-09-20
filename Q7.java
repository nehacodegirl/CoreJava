/*07.	Write a program to calculate sum of 5 subject’s marks 
& find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. 
Use concatenation operator here.*/

import java.util.*;
public class Q7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of subjects");
int sub = sc.nextInt();
int sum = 0;
for(int i=1; i<=sub; i++){
System.out.println("Percentage is "+i+"marks");
int marks = sc.nextInt();
sum+=marks;
}
 
 double per =(sum/sub);
System.out.println("Percentage is "+per+"%");
}
}
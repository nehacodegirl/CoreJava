/*15.	Accept person’s gender (character m for male and f for female),
 age (integer), as input and then check whether person is eligible for marriage or not.
*/

import java.util.*;
public class Q15{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Gender and Age");
char sex = sc.next().charAt(0);
int age = sc.nextInt();
if((sex=='F' && age>=18) || (sex=='M' && age>=21))
{
	System.out.println("Eligible for marrige");
}
else{
	System.out.println(" Not Eligible for marrige");
}

}
}
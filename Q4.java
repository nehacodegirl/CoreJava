/*04.	Write a program that initializes 2 byte type of variables. 
Add the values of these variables and store in a byte type of variable. 
[Note: primitive down casting is required in this program ] .
*/
import java.util.*;
public class Q4{
	public static void main(String args[]){
	
Scanner sc = new Scanner(System.in);
byte a = sc.nextByte();
byte b = sc.nextByte();
byte add = (byte)(a + b);
System.out.println(add);


}
}

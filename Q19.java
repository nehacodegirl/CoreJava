/*19.	Calculate  series : 12+22+32+42+.........+n2*/


import java.util.*;
public class Q19{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	for(int i=1; i<=num; i++){
	System.out.print((int)Math.pow(i,2)+"+");
	}	
}
}
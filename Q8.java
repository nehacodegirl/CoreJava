import java.util.*;
public class Q8{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principle amount");
	double pa = sc.nextDouble();
	System.out.println("Enter rate of interest");
	double roi = sc.nextDouble();
	
	System.out.println("Enter period");
	double T = sc.nextDouble();
	
	double SI = (pa*roi*T)/100;
	System.out.println("Simple Interest = "+SI);

}
}
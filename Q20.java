
import java.util.*;
public class Q20{
public static void main(String args[])
{
	Scanner c = new Scanner(System.in);
	System.out.println("enter two number");
	int n1 = c.nextInt();
	int n2 = c.nextInt();
	int flag ;
	while(n1<=n2)
	{
		flag = 0;
		for(int i=2; i<=n1/2; i++)
		{
			if(n1%i == 0)
			{
			flag=1;	
			break;
			}
		}
		
		if(flag==0)
		{System.out.print(n1+" ");}
		n1++;
	}
}
}
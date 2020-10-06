/*88.	Create a class that checks whether a given number is prime or not using  Runnable interface.*/
package assignment;
import java.util.*;
import java.io.*;
public class Q88  {

	public static void main(String[] args) {
		try {
		Prime p = new Prime();
		Thread th = new Thread(p);
		th.start();}
		catch(Exception e) {}
	}

}

class Prime implements Runnable{
	public void run() {
		int no;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		
         int cnt=0;
            for(int i=2;i<=n/2;i++)
                if(n%i==0)
                {
                    cnt++;
                    break;
                }
            if(cnt==0)
            {  System.out.println(n+" Number is prime");
            }
            else {
            	System.out.println(n+" Number is not a prime");
            }
	}
}


/*61.	Create a Thread class to print following star (*) pattern on
 *  screen with delay of 1 second between each * print. Number of lines 
 *  in the pattern should be passed to the constructor of Thread class.  
*  * * * *  * * * * * * * * * * Use this class in main method and ask user 
*  to enter number of lines to print.*/

package assignment;
import java.util.*;
import java.io.*;
class MyThread extends Thread{
	public void run() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i =0; i<n;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
			System.out.print("*");
		}
	}
}
public class Q61 {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread th = new Thread(m);
		
		th.start();
		

	}

}

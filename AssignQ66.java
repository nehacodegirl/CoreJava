package Assignment1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Shopping implements Serializable{
	public String itemName;
	public double prize;
	public int quantity;
	public Shopping(String itemName, double prize, int quantity) {
		this.itemName = itemName;
		this.prize = prize;
		this.quantity = quantity;
	}
}
public class AssignQ66 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter itemName : ");
		String itemName = sc.next();
		System.out.print("Enter prize of Item : ");
		double prize = sc.nextDouble();
		System.out.print("Enter Quantity of Item : ");
		int qty = sc.nextInt();
		
		Shopping sp = new Shopping(itemName,prize,qty);
		String filename = "G:\\CDAC_CORE_JAVA_16th-sept\\dir1\\ShoppingDetials.dat";
		
		FileOutputStream saveDetial = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(saveDetial);
		out.writeObject(sp);
		saveDetial.close();
		System.out.println("Object are saved in file");
		sc.close();
	}

}
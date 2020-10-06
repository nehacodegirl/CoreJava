package Assignment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
class Shopping1 implements Serializable {
	public String itemName;
	public double prize;
	public int quantity;

	public Shopping1(String itemName, double prize, int quantity) {
		this.itemName = itemName;
		this.prize = prize;
		this.quantity = quantity;
	}

	double getTotal() {
		return prize * quantity;
	}
}

public class Assign67 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter itemName : ");
		String itemName = sc.next();
		System.out.print("Enter prize of Item : ");
		double prize = sc.nextDouble();
		System.out.print("Enter Quantity of Item : ");
		int qty = sc.nextInt();

		Shopping1 sp = new Shopping1(itemName, prize, qty);
		String filename = "G:\\CDAC_CORE_JAVA_16th-sept\\dir1\\ShoppingDetials.dat";

		/-----------------Serialization-----------------/

		FileOutputStream saveDetial = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(saveDetial);
		out.writeObject(sp);
		saveDetial.close();
		System.out.println("Object are saved in file");
		sc.close();

		/--------------------DeSerialization----------------/

		Shopping1 sp1 = null;
		try {
			FileInputStream readobj = new FileInputStream(filename); // reading an object from file
			ObjectInputStream is = new ObjectInputStream(readobj);
			sp1 = (Shopping1) is.readObject(); // deserialize the object
			is.close();
			readobj.close();
			System.out.println("ItemName : " + sp1.itemName);
			System.out.println("Prize : " + sp1.prize);
			System.out.println("Quantity : " + sp1.quantity);
			System.out.println("Total Money : " + sp1.getTotal());
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}

	}

}
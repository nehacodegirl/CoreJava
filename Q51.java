/*51.	Create a program that helps banks to maintain records. 
 * It should have following facilities. 
 * o Anybody can create current or saving account with following initial information:
 *  account number, name, balance, and branch.
 * o display account detail for a particular accounts. 
 * o display total money deposited in bank.
 * o allow deposit and  withdrawal in an account  . 
 * o for saving account opening balance and minimum balance must be 5000. 
 * o for current account opening balance and minimum balance must be 1000. 
 * o can not withdraw the amount from the account 
 * that makes balance less than the minimum balance. */



package p3;

interface SavingAccount{
	
	int minbalanceS = 5000;
	
	
	void isSavingAccount();
	
}
interface CurrentAccount{
	
	int minbalanceC= 1000;
	void isCurrentAccount();
}

class Account implements SavingAccount,CurrentAccount {
	
	int number;
	String name;
	double balance;
	String branch;
	int openbalance;
	public Account(int number, String name, double balance, String branch, int openbalance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
		this.openbalance = openbalance;
	}
	@Override
	public void isCurrentAccount() {
		if(minbalanceC==openbalance) {
		System.out.println("This is my current account");}
	}
	
	@Override
	public void isSavingAccount() {
		if(minbalanceS==openbalance) {
		System.out.println("This is my saving account");}
	}
	void deposit(double amount) {
		balance += amount;
		System.out.println("Final balance after deposit "+balance);
	}
	
	void withdraw(double amount) {
		balance -= amount;
		System.out.println("Final balance after withdraw "+balance);
	}
	
	void display() {
		System.out.println(number + name +balance +branch);
	}
}

public class Q51 {

	public static void main(String[] args) {
		
		Account a = new Account(5,"neha",100000,"kharghar",1000);
		a.display();
		a.deposit(5000);
		a.withdraw(10000);
		a.isCurrentAccount();
		a.isSavingAccount();
	}

}

package execution;

public class Customer {
	public static void main(String[] args) throws MinBalanceException{
		Cust c1 = new Cust("Ihsan", 234, 8, 50000);
		
		try{
			c1.withdraw(47467);
			System.out.println("Withdraw Success");
		}
		catch(MinBalanceException mbe){
			System.out.println("Exception-> " + mbe.getMessage());
		}
		c1.display();
		System.out.println();
		
		try{
			c1.withdraw(5000);
			System.out.println("Withdraw Success");
		}
		catch(MinBalanceException mbe){
			System.out.println("Exception-> " + mbe.getMessage());
		}
		c1.display();
		System.out.println();
	}
}

class Cust{
	String name;
	int acc_id;
	double balance;
	int transactions;
	
	Cust(String n, int a, int t, double b){
		name = n;
		acc_id = a;
		balance = b;
		transactions = t;
	}
	
	public void withdraw(double s) throws MinBalanceException{
		if(balance < 3000){
			throw new MinBalanceException("Low Balance = " + balance);
		}
		if(balance - s >= 0){
			balance -= s;
			transactions++;
		}
	}
	
	public void deposit(double s){
		balance += s;
		transactions++;
	}
	
	public void display(){
		System.out.println("Account Details");
		System.out.println("Name: " + name);
		System.out.println("Account ID: " + acc_id);
		System.out.println("Balance: " + balance);
		System.out.println("Transactions: " + transactions);
	}
}

class MinBalanceException extends Exception{
	MinBalanceException(String s){
		super(s);
	}
}
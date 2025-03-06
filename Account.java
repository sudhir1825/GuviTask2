package Task2;

//1.3 Question
public class Account {
	private double balance;
	
	public Account() { //no argument constructor
		
	}
	
	public Account(double balance) { //Parameterized constructor
		this.balance = balance;
	}
	
	public void deposit(double amount) { //method to process deposit action
        balance = balance + amount;
        System.out.println("Deposited " + amount);
    }

    public void withDraw(double amount) { //method to process withdraw action
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccount() { // method to display balance details
        System.out.println("Balance: " + balance);
    }
	public static void main(String[] args) {
		Account obj = new Account(10000); //object created for class Account with default balance 10000
		//calling methods to perform actions
		obj.deposit(5000);
		obj.withDraw(200);
		obj.displayAccount();
		
	}

}

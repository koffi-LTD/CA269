public class BankAccount{
	double balance;
	//Balance methos
	public BankAccount(double balance)
	{
		this.balance = balance;  //this keywork to avoid conflict between class attribute & parameter.
	}
	//offer method
	public BankAccount()
	{
		// initialize new account with $100
		double offer = 100;
		balance += offer;
	}
	//withdraw method
	public void withdraw(double amount){
		// current balance = balance - requested amount
		balance -= amount;
	}
	//Deposit method
	public void deposit(double amount)
	{
		//deposit + balance
		balance+= amount;
	}
	// toString method
	public String toString(){
		return "The balance is " + balance;

	}
	//Setters method
	public void setBalance(double amount)
	{	
		// modify balance to desired amount
		balance = amount;
	}
	//Getter method
	public double getBalance(){
		//
		return balance;
	}

}
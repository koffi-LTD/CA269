public class BankAccount{
	private double balance;
	public BankAccount(double balance){
		this.balance = balance;
	}
	public BankAccount(){
		balance = 0;
	}	
	public void setBalance(double bal){
			balance = bal;
		}
	public double getBalance(){
		return balance;
	}
	public String toString(){
		return "The balance is " + balance + ".";
	}
}
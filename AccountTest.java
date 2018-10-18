public class AccountTest{

	//Show the amount in an account only if the amount is greater than 0
	//show the amount being added to the account
	private double balance; 

	public AccountTest(double initialBalance){

		if (initialBalance>0){
			balance = initialBalance;
		}
	}
	public void displayInitialBalance(){
		System.out.printf("The initial balance is: %.2f\n",balance);
	}
	public void setBalance(double amount){
		balance = balance + amount;
	}
	public double getBalance(){
		return balance;
	}
	public void displaybalance(){
		System.out.printf("The total amount is: %.2f\n",getBalance());
	}

	
}
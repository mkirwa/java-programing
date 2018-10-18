import java.util.Scanner;

public class Account{

	//Show the amount in an account only if the amount is greater than 0
	//show the amount being added to the account
	//Show the amount after the addition 
	public static void main(String[]args){
		//create an instance of class AccountTest 
		//with 10 as the value to the constructor
		AccountTest newAccountTest = new AccountTest(10);
		//Calling the display method to show the initial balance
		newAccountTest.displayInitialBalance();	

		Scanner input = new Scanner(System.in);
		double userInput = input.nextInt();

		//Adding the new value into the existing amount
		newAccountTest.setBalance(userInput);

		//displaying the total amount
		newAccountTest.displaybalance();

	}
}
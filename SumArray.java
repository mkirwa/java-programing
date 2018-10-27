//write a program that ask the number of arrays he/she wants to enter
//show the user the numbers they entered
//sum up all those arrays and give the user the final total
import java.util.Scanner;
public class SumArray{
	public static void main(String[]args){
		//ask the user for the input 
		//ask the user how many number he/she wants to sum up
		Scanner input = new Scanner(System.in);
		System.out.println("how many numbers do you want to sum up");
		int userInput = input.nextInt();
		//create an array size according to the users input
		int array[] = new int[userInput];
		int counter = 0;
		int total = 0;
		//store then numbers in an array
		for(int i = 0; i<userInput; i++){
			System.out.println("please enter then numbers");
			int userInput1 = input.nextInt();
			//store the user's input into the spaces created
			array[counter]=userInput1;
			//add the inputs and give the user the final product
			total+=userInput1;
			counter++;
		}
		System.out.println("The numbers you entered were: ");
		//A loop to print what the user stored 
		for(int j=0; j<userInput; j++){
			System.out.print(array[j]);
			System.out.println("");
		}
		System.out.printf("the total of the numbers you entered is: %d\n",total);

	}
}
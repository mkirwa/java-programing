//write a program that assigns even numbers from 2 to 20 (2 and 20 inclusive)
//to arrays 0 to 9 
//name the arrays 'indexes' and name the even numbers 'values'

public class InitArray{

	public static void main(String[]args){
		//initialize an array and create 10 memory locations
		int array[] = new int[10];
		int num = array.length; 
		int counter = 0;
		//store the numbers 2 to 20 in the 10 memory locations
			//create a for loop and start the initialization with 2
		System.out.println("Index Values");

		for(int i=1; i<=num; i++){
			System.out.print(counter);
			System.out.print("        ");
			array[counter] = i*2;
			System.out.print(array[counter]);
			counter++;
			System.out.println();
		}
		//print the numbers store in the arrays and the array's
			//print that array location and the evenly initializes variable




	}
}
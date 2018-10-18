import java.util.Scanner;

public class Testing{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();

		Testing1 newTesting1 = new Testing1();
		newTesting1.setCourseName(userInput);
		newTesting1.displayCourseName();
	}
}
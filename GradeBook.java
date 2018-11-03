import java.util.*;

public class GradeBook{
		
		
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the course name: ");
		String word = input.nextLine();

		GradeBookTest myGradeBookTest = new GradeBookTest();
		myGradeBookTest.setCourseName(word);
		myGradeBookTest.displaycourseName();

	}
}
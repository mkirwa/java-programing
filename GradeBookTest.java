public class GradeBookTest{
	
	//declaring a variable to be used throught the program
	private String courseName;
	//declaring a constructor to initialize the objects data
	//public GradeBookTest(String name){
		//courseName = name;
	//}

	public void setCourseName(String userInput){
		courseName = userInput;
	}
	public String getCourseName(){
		return courseName; 
	}
	public void displaycourseName(){
		System.out.printf("welcome to : %s\n",getCourseName());
	}

}
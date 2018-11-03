public class GradeBookTest{
	
	//declaring a private variable 
	//to be used to initialize the object data
	private String courseName;
	//declaring a constructor to initialize the objects data
	public GradeBookTest(String name){
		courseName = name;
	}
	public void setCourseName(String name){
		courseName = name;
	}
	public String getCourseName(){
		return courseName; 
	}
	public void displaycourseName(){
		System.out.printf("welcome to : %s\n",getCourseName());
	}

}
public class GradeBookTest{
	// constructor initializes courseName with String argument
	private String courseName;
	///constructor name is class name
	public GradeBookTest(String name)
	{
			courseName = name;// initializes courseName
	}
	// method to set the course name
	public void setCourseName(String name)
	{
			courseName = name;// store the course name
	}
	public String getCourseName(){
		return courseName;
	}
	public void displayCourseName(){
		// this statement calls getCourseName to get the
      	// name of the course this GradeBook represents
		System.out.printf("Welcome to %s class\n",getCourseName());
	}

}
public class Testing1{

	private String courseName;

	public void setCourseName(String name){
		courseName = name;
	}
	public String returnCourseName(){
		return courseName;
	}
	public void displayCourseName(){
		System.out.printf("Welcome to :%s!\n",returnCourseName());
	}
	
	
	
}


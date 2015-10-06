package onlineexamples.edupackage;



class A{
	//separate methods
	void methodone()
	{
		System.out.println("Method of class A");
	}
	//separate methods
	void methodtwo()
	{
		System.out.println("method of class B");
	}
	
}
//binding the two methods
public class binding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Binding methods one and two
		A a1=new A();
		a1.methodtwo();
		a1.methodtwo();
		

	}

}



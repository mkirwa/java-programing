//figure 7.20 VarargsTest.java
//Using variable-length arguments lists
//With variable-length argument lists, 
//you can create methods that receive an unspecified number of arguments.
// A type followed by an ellipsis(...) in a method’s parameter list 
//indicates that the method receives a variable number of arguments of that particular type.
public class VarargsTest{

	public static double average(double... numbers){

		double total=0;

		for(double d: numbers)
			total+=d;
		return total/numbers.length;
	}

	public static void main(String[]args){

		double  d1 = 10;
		double d2 = 20;
		double d3 = 30;
		double d4 = 40;

		System.out.printf("the average of d1%d and d2%d is: %d2\n",d1,d1,average(d1,d2))
	}
}
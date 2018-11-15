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

		System.out.printf("the average of %.1f and %.1f is: %.1f\n",d1,d2,average(d1,d2));
		System.out.printf("the average of %.1f, %.1f and %.1f is: %.1f\n",d1,d2,d3,average(d1,d2,d3));

	}
}
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
}
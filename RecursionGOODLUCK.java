//recursion example
public class RecursionGOODLUCK{

	public static int Summation(int n){
		//base case, we are at the end
		if(n<=0){
			return 0;//additive identity property at 0 
		}
		//Recursive case:  Keep going
		else{
		//3 + Summation(3-2=2)
		//3 + 2 + Summation(2-1=1)
		//3 + 2 + 1 + Summation(1-1=0)
		//3 + 2 + 1 + 0
			return n + Summation(n-1);
		}
	}
	//5! ---> 5 * 4 * 3 * 2 * 1
	//4! ---> 4 * 3 * 2 * 1
	public static int Factorial(int n){
		//base case
		if(n<=1){
			return 1; 
		}
		//Recursive case
		else{
			//4 * factorial(4-1)
				//4 * factorial(3)
			//4 * 3 * factorial(3-1)
				//4 * 3 * factorial(2)
			//4 * 3 * 3 * 2 * factorial(2-1)
				//4 * 3 * 3 * 2 * factorial(1)
			//4 * 3 * 3 * 2 * factorial(1==1)
			//4 * 3 * 3 * 2 * 1
			return n * Factorial(n-1);
		}
	}

	public static void main(String[]args){
		System.out.println(Summation(4));
		System.out.println(Factorial(4));
	}
}
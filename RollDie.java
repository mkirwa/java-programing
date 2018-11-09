import java.util.*;

public class RollDie{

	public static void main(String[]args){
		//random number generator
		Random randomNumbers = new Random();
		int frequency[] = new int [7];
		//roll die 6,000,000 times; use die value as frequency
		for(int roll = 1; roll<=6000000; roll++){

			++frequency[1+randomNumbers.nextInt(6)];
		}

		System.out.printf("%s%10s\n","Face","frequency");
			//output each array element's value 

		for(int face = 1; face<frequency.length; face++){
				System.out.printf("%4d%10d\n",face,frequency[face]);
		}
			
	}

}
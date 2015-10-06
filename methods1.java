package examplesfrombook;

import java.util.Scanner;

public class methods1 {
	
	public static void main(String[]args)

	{
		
		calculateCharges();
		
	}
	
	public static int calculateCharges(){
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of hours");
		int x=input.nextInt();
		
		
		if (x<=3){
			System.out.println("your total charges is $2.00");
			return x;
		}
		else if(x>3&&x<24){
			double p=x-3;
			
			double total=(double) (2+p*0.50);
			System.out.println("your total charges is $"+total);
			
			return x;
		}
		else
		{
			System.out.println("the total charges is $ 10.00");
			return x;
		}
		
		
		//return x;
		
	}

}

package edu.IDTechlearningPackage;

import java.util.Scanner;

public class switchcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner years=new Scanner(System.in);
			System.out.println("enter the number of the month");
			String month=years.next();
		
		
        String monthString;
        switch (month) {
            case "ONE":  monthString = "January";
                     break;
            case "TWO":  monthString = "February";
                     break;
            case "THREE":  monthString = "March";
                     break;
            case "FOUR":  monthString = "April";
                     break;
            case "FIVE":  monthString = "May";
                     break;
            case "SIX":  monthString = "June";
                     break;
            /*case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;*/
            default: monthString = "Invalid month";
            		
                     break;
        }
        System.out.println(monthString);
        
        
        
		
        
		
		
		
		

	}

}

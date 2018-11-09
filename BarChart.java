//store grade distribution in an array of 11 elements
//each corresponding to a category of grades
//for example, array 0 indicates the number of grades in range 0-9
//array[7] indicates the number of grades in the range 70-79
//array[10] the number of 100 grades...

public class BarChart{

	public static void main(String[]args){
		int[] array = {0,0,0,0,0,0,1,2,4,2,1};
		System.out.println("Grade distribution");

		//for each array element output a bar of the chart
		for(int counter = 0; counter <= array.length; counter++){

			if(counter== 10){
				System.out.printf("%5d: ", 100);
			}else{
				System.out.printf("%02d-%02d: ", counter*10, counter*10+9);
			}

			for(int stars = 0; stars < array[counter]; stars++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
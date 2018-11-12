public class InitArrayTwoDimensionalArrays{

	//create and output two dimensional arrays
	public static void main(String[]args){

		//creating an array with two rows and three columns
		int [][] a = {{1,2,3},{4,5,6}};
		//creating an array with three rows, 
		//the first row should have two columns, the second row
		//should have 1 column and the third row should have 3 columns
		int [][] b = {{1,2},{3},{4,5,6}};
		//print their values.
		System.out.println("the values for the first array"); 
		Arrays(a);
		System.out.println("the values for the second array"); 
		Arrays(b);
	}
	//create a method that loops through the arrays..
	public static void Arrays(int[][] array){
		//for loop that loops through the row
		for(int row = 0; row<array.length; row++){

			//for loop that loops through the column
			for(int column = 0; column<array[row].length; column++){
				System.out.printf(" %d ",array[row][column]);
			}

			System.out.println();

		}
	}
}
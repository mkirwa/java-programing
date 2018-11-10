
//passing an array in to a method
public class PassArray{

	public static void main(String[]args){

		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("The value of the original array");

		for(int value:array)
			System.out.print(value);

		System.out.println();
		System.out.println("The values after modification");

		modifyArray(array);

		for(int value:array)
			System.out.print(value);

		System.out.println();
	}

	public static void modifyArray(int[] array2){
		for(int counter = 0; counter<array2.length; counter++)
			array2[counter]*=2;
	}
	
}
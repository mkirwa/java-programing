//It’s possible to pass command-line arguments to an application in java 
//this application takes 3 commmand lines arguments.
//command lines arguments are separated by white spaces not commas
//suppose you pass in the command line argument 5 0 4
//When this commmand executes, InitArrayCommandLines receives 3 element array args
//args[0] contains the string "5"  args[1] contains the string [0] and args[1]
//contains the string "4". In this program, 5 will be the length of the array,
//0 will be the initial value and 4 will be the incremental value+
public class InitArrayCommandLines
{
	//including a parameter for types String[ ] (i.e an array of Strings) 
	//in the parameter list of main,
	//By convention, this parameter is named args. 
	public static void main(String[] args)
	{
		//check number of command lines arguments.
		if(args.length !=3 ){

			System.out.println("Please re-enter the entire command, including\n"+
				"an array size, initial value and increment.");

		}else
		{
			//get array size from first command-line argument 
			//accessing the array’s length values attribute. 
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];//create an array

			//get initial value and increment from command-line arguments
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);

			System.out.printf("%s%8s\n","index","value");
			//calculate value for each array element
			for(int counter = 0; counter<arrayLength ; counter++)
				array[counter]=initialValue+increment*counter;

			for(int counter = 0; counter<arrayLength; counter++)
				System.out.printf("%5d%8d\n",counter,array[counter]);

		}
	}
}
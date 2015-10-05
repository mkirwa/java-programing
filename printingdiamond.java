package edu.IDTechlearningPackage;

import java.io.IOException;
import java.util.Scanner;

public class printingdiamond {


	// TODO Auto-generated method stub

	public static void main(String[] args) throws IOException

	{

		while(true){

			Scanner in = new Scanner(System.in);   

			System.out.println("Enter a symbol to use in the diamond");
			
			System.out.println("Type exit to end the game");

			String Symbol = in.nextLine();
			
			String exit=in.nextLine();

			char cSymbol = Symbol.charAt(0);

			System.out.println("Enter a odd value for the width of the diamond");

			int width = in.nextInt();



			// Top section of diamond

			// first row will have 1 element so half the width numbers of blank spaces

			int nbSpaces = width / 2;

			// we start with 1 symbol then the following rows will have 2 more element thus i +=2

			for(int i = 1; i <= width; i+= 2 ) {

				// print the white space

				for(int j = 0; j < nbSpaces; ++j)

					System.out.print(" ");

				// then our symbols

				for(int k = 0; k < i; ++k)

					System.out.print(cSymbol);

				// new line

				System.out.println();

				--nbSpaces;  // one less space to print

			}



			// Bottom section of diamond

			// OK we will have one white space to start

			nbSpaces = 1;

			// and we start at our width -2

			for(int i = width-2; i >= 0; i -= 2 ) {

				for(int j = 0; j < nbSpaces; ++j)

					System.out.print(" ");

				for(int k = 0; k < i; ++k)

					System.out.print(cSymbol);

				System.out.println();

				++nbSpaces;   // one more space to print

			}
			
			

		}
		
	}

}

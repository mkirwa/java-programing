//hackerrank day 11 tutorial video
//what's in a catalogue?
//1. What's available 
//2. Check in a book
//3. Check out a book
//4. Container for books
//5. Is a given book returned late?
//6. Is book checked out?
//we will be using multiple classes for this 

//Library catalogue class
//1. How long you can check out 
//2. What's in this library
//3. Plus more

//Book class
//1. Title
//2. ISBN
//3. Page count
//4, What defines a book

import java.util.*;

public class LibraryCatalogue{
	//adding properties to the library catalogue 
	// the first one is going to be a book collection
	//the second one is going to be a current day like how 
	//we keep track of time in our library
	//then we will have the length of the usual library 
	//check out period
	//then we have an inital late fee for example....you are
	//late you are going to pay 50cts or something and then for each 
	//day after, you will have a different late fee which will be
	//store in another property 

	//so we create a dictionary to hold this books for us..the book 
	//title is going to be the key 

	//properties/Fields/Global Variables
	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay = 0; 
	int lengthOfCheckoutPeriod = 7; //the maximum number of days you should have a book for 
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;

	//create a constructor 
	public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod,
	 double initialLateFee, double feePerLateDay){

		this.bookCollection = collection;
		this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
		this.initialLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
	}
	//some of this are already defaults and so to make it a little easier we are gonna create 
	//a second constructor...usually it's good to have one constructor because it gives you 
	//less flexibility. Why would you want less flexibility as a programmer? It means there's 
	//only one way to create things....The reason we are doing this is because we want more ways 
	//to customize out constructor..we could just say we want the default you know, length of 
	//checkout period all the stuff versus oh I want to set everything to the defaults why don't 
	//I just have a constructor for that
	public LibraryCatalogue(Map<String,Book> collection){
		this.bookCollection = collection; 
	}



	public static void main(String[]args){

	}
}
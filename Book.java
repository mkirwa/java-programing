//hackerrank day 11 tutorial video
//keeps track of the book and what is in it
public class Book{

	//properties, Fields, Global Variables
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut;//whether or not the book is checked out
	int dayCheckedout = -1;

	//constructor
	//how do we make out books, how do we create the instances  
	//of our books which will be a single individual book with it's
	//own page count, it's own number, it's own ispn
	//verses how do we make a whole class of how do we even 
	//make a book
	public Book(String bookTitle, int bookPageCount, int bookISBN){
		this.title = bookTitle;
		this.pageCount = bookPageCount;
		this.ISBN = bookISBN; 
		isCheckedOut = false;
	}
		
	//setters
	public void setisCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
		this.isCheckedOut = newIsCheckedOut;
		setDayCheckedOut(int currentDayCheckedOut);

	}
	private void setDayCheckedOut(int day){
		this.dayCheckedout = day;
	}

	//getters
	public String getTitle(){
		return this.title;
	}
	public int getPageCount(){
		return this.pageCount;
	}
	public int getISBN(int){
		return this.ISBN;
	}
	public boolean getisCheckedOut(boolean){
		return this.isCheckedOut;
	}
	public int getdayCheckedOut(boolean){
		return this.dayCheckedout;
	}



}
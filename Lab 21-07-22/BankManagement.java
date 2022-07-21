/*.write a program to create Book management system.
create class name Book,and perform following actions:
Attributes:
bookid,bookName,bookPrice,authorName,library name(static),availability
method:
createBook() will store book details.(add atleast 5 books).
displayBook()will display book details
displayBookByName(): display specific book details based on bookName
borrowBook(): borrow book if book is available based on bookName,then make availability status as "not available"*/
package oopsdemo;
import java.util.Scanner;

class Book{
	int bookid,bookPrice;
	String bookName,authorName, availability;
	static String libraryName="The Collection";
	
public void createBook(int id, String name, int price, String aut, String avail)
{
	bookid=id;
	bookName=name;
	bookPrice=price;
	authorName=aut;
	availability=avail;
}

public void borrowBook()
{
	if(availability.equals("available")||availability.equals("Available"))
		System.out.println("The book is avaiable to borrow.");
	else
		System.out.println("The book is not available to borrow.");
	
	System.out.println();
	
}
public void displayBook()
{
	System.out.println(bookName);
}
public void displayBookByName()
{
		
		System.out.println("Book ID: "+bookid+"\nBook Name: "+bookName+"\nBook Price: "+bookPrice+""
			+"\nAuthor Name: "+authorName+"\nAvailability: "+availability+"\nLibrary Name: "+libraryName);
		System.out.println();
}

}
public class BookManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Entering book details
		Book b1 = new Book();
		b1.createBook(121,"Fault in our Stars",350,"John Green","Available");
		b1.displayBook();
		Book b2 = new Book();
		b2.createBook(122,"The Lord of the Rings",500,"JRR Tolkien","Available");
		b2.displayBook();
		Book b3 = new Book();
		b3.createBook(123,"Harry Potter Sorcerer's Stone",550,"JK Rowling","Available");
		b3.displayBook();
		Book b4 = new Book();
		b4.createBook(124,"The Hobbit",399,"JRR Tolkien","Not Available");
		b4.displayBook();
		Book b5 = new Book();
		b5.createBook(125,"The Da Vinci Code",500,"Dan Brown","Not Available");
		b5.displayBook();
		System.out.println();
		
		do {
		System.out.println("Enter an option: \n1) To Check Details of Book."
				+ "\n2) To Check whether available to borrow or not."
				+ "\n3) Exit");
		int choice = sc.nextInt();
		if(choice==1)
		{
		//checking details of the book
			System.out.println("Enter which book to check details: ");
			System.out.println("1) Fault in our Stars \n2) The Lord of the Rings "
					+ "\n3) Harry Potter Sorcerer's Stone \n4) The Hobbit"
					+ "\n5) The Da Vinci Code:");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				b1.displayBookByName();
				break;
			case 2:
				b2.displayBookByName();
				break;
			case 3:
				b3.displayBookByName();
				break;
			case 4:
				b4.displayBookByName();
				break;
			case 5:
				b5.displayBookByName();
				break;
			default:
				System.out.println("No available books.");
		     }
		}
		else if(choice==2)
		{
			System.out.println("Enter to check which book is available or not: ");
			System.out.println("1) Fault in our Stars \n2) The Lord of the Rings "
					+ "\n3) Harry Potter Sorcerer's Stone \n4) The Hobbit"
					+ "\n5) The Da Vinci Code:");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Is "+b1.bookName+" available to borrow?");
				b1.borrowBook();
				break;
			case 2:
				System.out.println("Is "+b2.bookName+" available to borrow?");
				b2.borrowBook();
				break;
			case 3:
				System.out.println("Is "+b3.bookName+" available to borrow?");
				b3.borrowBook();
				break;
			case 4:
				System.out.println("Is "+b4.bookName+" available to borrow?");
				b4.borrowBook();
				break;
			case 5:
				System.out.println("Is "+b5.bookName+" available to borrow?");
				b5.borrowBook();
				break;
			default:
				System.out.println("Wrong Choice!!");
				
			}
		}
		else if(choice==3)
		{
			System.exit(0);
		}
		else
			System.out.println("Wrong Option!!!");

		}
		while(true);
	}

}

package com.jsp.lms.view;
 
import java.util.Scanner;
import com.jsp.lms.controller.Controller;
import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;
public class View {
	static private Library library = new Library();
	static Controller controller = new Controller();
	static Scanner myInput = new Scanner(System.in);
	public static Library getLibrary() {
		return library;
	}
	public static void setLibrary(Library library) {
		View.library = library;
	}
	static {
		System.out.println("--------Welcome to LMS--------");
		System.out.print("Enter name of library :");
		String libraryName = myInput.nextLine();
		library.setLibraryAddress(libraryName);
		//
		System.out.print("Enter address if library :");
		library.setLibraryAddress(myInput.nextLine());
		System.out.print("Entre pincode :");
		library.setPincode(myInput.nextInt());
		myInput.nextLine();
	}

	public static void main(String[] args) {
		System.out.println("Name :" + library.getLibraryName());
		System.out.println("Addres :" + library.getLibraryaddress());
		System.out.println("Pin Code" + library.getPincode());

		do {
			System.out.println
			("Select option to perform");
			System.out.println
			("0.Exit\n1.Add book\n2.Remove book\n3.Uptube book\n4.Get book");
			System.out.println
			("Enter digit repestive to desired option");
			byte  userChoice = myInput.nextByte();
			switch (userChoice) {
			
			case 1:
				Book book = new Book();
				System.out.print("Enter book name :");
				book.setBookName(myInput.next());
				System.out.print("Enter Author name :");
				book.setAuthorName(myInput.next());
				System.out.print("Enter price :");
				book.setPrice(myInput.nextDouble());
				myInput.nextLine();
				controller.addBook(book);
				System.out.println("Details Added");
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				System.out.println("Enter book name you are looking for :");
				Book fetchBook  = controller.getbook(myInput.next());
				if (fetchBook!=null) {
					System.out.println("Book is available :");
					System.out.println("Details");
					System.out.println(fetchBook);
				}
				else {
					System.out.println("Book not available.");
				}
				break;
			case 5:

				break;
			case 0:
				myInput.close();
				System.out.println("----Exit----");
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}

		} while (true);
	}
}

package com.jsp.lms.controller;
import java.util.ArrayList;
import java.util.List;
import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;
import com.jsp.lms.view.View;

public class Controller {
	private Library library = View.getLibrary();
	public void addBook(Book book) {
		List<Book>books = library.getBooks();
		if(books==null) {
			books = new ArrayList<>();
		}
		books.add(book);
		library.setBooks(books);
	}
		public Book getbook(String bookName) {
			List<Book> books = library.getBooks();
			if (books!=null) {//List of book exist
				for (Book book : books) {
					if(book.getBookName().equalsIgnoreCase(bookName)) {
						return book;
					}
				}
			} 
			return null;
		}
	}
package com.jsp.lms.model;
import java.util.List;
public class Library {
	private String LibraryName;
	private String LibraryAddress;
	private int Pincode;	
	private List<Book>books;

	public String getLibraryName() {
		return LibraryName;
	}

	public void setLibraryName(String library_Name) {
		this.LibraryName = LibraryName;
	}

	public String getLibraryaddress() {
		return LibraryAddress;
	}

	public void setLibraryAddress(String library_address) {
		this.LibraryAddress = LibraryAddress;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pin_code) {
		this.Pincode = pin_code;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
		
	}
}

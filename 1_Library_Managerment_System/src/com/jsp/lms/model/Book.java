package com.jsp.lms.model;
public class Book {
	private String bookName;
	private String AuthorName;
	private double Price;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String book) {
		this.bookName = book;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [book=" + bookName + ", AuthorName=" + AuthorName + ", Price=" + Price + "]";
}
}

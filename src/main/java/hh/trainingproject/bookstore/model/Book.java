package hh.trainingproject.bookstore.model;

public class Book {
	// attributes
			private int kirjaid;
			private String title;   
			private String author;   
			private int year; 
			private String isbn;  
			private double price;
			
			public Book(int kirjaid, String title, String author, int year, String isbn, double price) {
				super();
				this.kirjaid = kirjaid;
				this.title = title;
				this.author = author;
				this.year = year;
				this.isbn = isbn;
				this.price = price;
			}
			@Override
			public String toString() {
				return "Book [kirjaid=" + kirjaid + ", title=" + title + ", author=" + author + ", year=" + year
						+ ", isbn=" + isbn + ", price=" + price + "]";
			}
			public int getKirjaid() {
				return kirjaid;
			}
			public void setKirjaid(int kirjaid) {
				this.kirjaid = kirjaid;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public String getAuthor() {
				return author;
			}
			public void setAuthor(String author) {
				this.author = author;
			}
			public int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
			}
			public String getIsbn() {
				return isbn;
			}
			public void setIsbn(String isbn) {
				this.isbn = isbn;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
}

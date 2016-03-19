package Pragmatic.Project.BookStore;

public class BookStock {

	private String title;
	private String author;
	private double price;
	private String publisher;
	private boolean imported;
	private int stock;

	public BookStock(String title, String author, double price, String publisher, boolean imported, int stock) {

		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.imported = imported;
		this.stock = stock;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public boolean isImported() {
		return imported;
	}

	public int getStock() {
		return stock;
	}

}

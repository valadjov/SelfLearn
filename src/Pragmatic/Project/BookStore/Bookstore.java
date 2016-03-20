package Pragmatic.Project.BookStore;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Bookstore {

	private String COMMA_SEPARATOR = ",";
	private String NEW_LINE = "\n";

	List<Book> books = new ArrayList<Book>();

	public boolean addBook(Book b) {
		if (!books.contains(b)) {
			books.add(b);
			return true;
		}
		return false;
	}

	public void listBooksAndStockCount() {
		if (books.size() == 0) {

			System.out.println("There aren't any books in the bookstore.");
			return;
		}
		String[] booksAndStockCount = new String[books.size()];
		for (int i = 0; i < books.size(); i++) {
			System.out.println("The book " + books.get(i).getTitle() + " has "
					+ books.get(i).getStock() + " available copies in stock.");
		}
	}

	public boolean sellBook(Book b) {
		if (b.getStock() > 0) {
			b.setStock(b.getStock() - 1);
			return true;
		}
		return false;
	}

	public boolean removeBook(Book b) {
		if (books.contains(b)) {
			books.remove(b);
			return true;
		}
		return false;
	}

	public void searchBook(String s) {
		s = s.toLowerCase();
		for (int i = 0; i < books.size(); i++) {
			String bookTitle = (books.get(i).getTitle());
			if ((bookTitle.toLowerCase()).contains(s)) {
				System.out.println(bookTitle);
			}
		}
	}
}

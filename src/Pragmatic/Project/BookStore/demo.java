package Pragmatic.Project.BookStore;

public class demo {

	public static void main(String[] args) {
		Book b1 = new Book("title", "author", 5.20, "publisher", "foreign", 5);
		Book b2 = new Book("Java", "Az", 6.20, "Home", "Not Foreing", 5);
		Book b3 = new Book("Java1", "Az", 6.20, "Home", "Not Foreing", 5);
		Book b4 = new Book("Java2", "Az", 6.20, "Home", "Not Foreing", 5);

	
		System.out.println(b1.getAuthor());
		Bookstore bstore = new Bookstore();
		bstore.addBook(b2);
		bstore.addBook(b3);
		bstore.addBook(b4);
		bstore.addBook(b1);
		bstore.listBooksAndStockCount();

	//	System.out.println(bstore.sellBook(b1));
	//	System.out.println(bstore.sellBook(b1));
	//	System.out.println(bstore.sellBook(b1));
	//	System.out.println(bstore.sellBook(b1));
//		System.out.println(bstore.sellBook(b1));
//		System.out.println(bstore.sellBook(b1));

	//	bstore.listBooksAndStockCount();
	//	bstore.removeBook(b1);
	//	bstore.listBooksAndStockCount();
	//	System.out.println(b1.getTitle().contains("do"));
	}

}

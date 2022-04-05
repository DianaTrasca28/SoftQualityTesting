package prototype;

import java.util.ArrayList;

public class Bookshop {
	private String name;
	private ArrayList<Book>listBooks;
	public Bookshop(String name, ArrayList<Book> listBooks) {
		super();
		this.name = name;
		this.listBooks = listBooks;
	}
	public ArrayList<Book> getListBooks() {
		return listBooks;
	}
	public void setListBooks(ArrayList<Book> listBooks) {
		this.listBooks = listBooks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bookshop [name=" + name + ", listBooks=" + listBooks + "]";
	}
	
	
	public Bookshop() {
		super();
	}
	public static Bookshop loadDataFromDB(String name) {
		Bookshop b= new Bookshop();
		b.setName(name);
		Book book;
		for(int i=0;i<10;i++) {
			book=new Book(name+" -"+i, "diana", i*100);
			b.listBooks.add(book);
			book=null;
		}
		return b;
	}

}

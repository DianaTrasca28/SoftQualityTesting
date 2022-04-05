package prototype.resolved;

import java.util.ArrayList;

public class Bookshop implements Cloneable {
	private String name;
	private ArrayList<Book>listBooks=new ArrayList<>();
	public Bookshop(String name, ArrayList<Book> listBooks) {
		super();
		this.name = name;
		this.listBooks = listBooks;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		Bookshop bClone=new Bookshop();
		bClone.name=this.name;
		bClone.listBooks=(ArrayList<Book>) this.listBooks.clone();
		return bClone;
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

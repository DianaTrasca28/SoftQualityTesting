package structural.adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen penFav = new PenAdapter();
		
		Student s = new Student();
		s.getPen(penFav);
		
		s.write();

	}

}

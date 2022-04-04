package singletone.v3;

public class Database {
	//VARIANTA 3 LAZY INIT, THREAD SAFE => E OK, SE FOL LA EXAMEN
	//o singura instanta => STATIC
	private static Database INSTANCE; // LATE INIT
	
	private Database() {
		
	}
	public static Database getInstance() { //data se fol sync la definirea functiei, se formeaza instanta una dupa alta -> se form coada=> nu exista multithreading
		if(INSTANCE==null) {
			synchronized (Database.class) { //LATE INIT THREAD SAFE => ASA E OK, e partial multi threading( in unele scenarii cand sunt toate null nu e)
				if(INSTANCE==null) {
					INSTANCE = new Database();
				}
			}
		}
		return INSTANCE; //nu se fol this pt ca nu e la nivelul obiectului, ci la nivelul clasei
	}
}

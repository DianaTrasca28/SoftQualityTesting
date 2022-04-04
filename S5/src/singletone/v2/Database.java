package singletone.v2;

public class Database {
	//VARIANTA 2 EARLY
		//o singura instanta => STATIC
		private static Database INSTANCE= new Database(); // early initialization, nu e gresit insa se consuma memorie chiar daca nu e fol instanta
					// nu e ok pt examen
		static {
			INSTANCE =new Database();
		}
		
		private Database() {
			
		}
		public Database getInstance() {
			return INSTANCE; //nu se fol this pt ca nu e la nivelul obiectului, ci la nivelul clasei
		}

}

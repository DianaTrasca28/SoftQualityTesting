package singletone;

public class Database {
	private int id;
	private String url;
	private void selectObj() {
		
	}
	public Database(){
		//connect
	}
	private Database(int id, String url){
		//connect
		this.id=id;
		this.url=url;
	}
	private static Database INSTANCE;
	public static Database getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Database();
		}
		return INSTANCE;
	}

}

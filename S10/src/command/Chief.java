package command;

public class Chief {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chief(String name) {
		super();
		this.name = name;
	}
	
	public void cookPizza(String typePizza) {
		System.out.println("The Chief "+ this.name+ " pizza");
	}
	public void cookPasta(String typePasta) {
		System.out.println("The chef " + this.name + " is cooking pasta " + typePasta);
	}
}

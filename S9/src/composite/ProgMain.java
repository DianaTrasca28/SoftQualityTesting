package composite;

public class ProgMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Structure menu=new Structure ("Menu");
		
		Structure menuDrinks=new Structure("Drinks");
		Structure menuFood=new Structure("Food");
		
		menu.addNode(menuFood);
		menu.addNode(menuDrinks);
		
		Structure AlcMenu=new Structure("AlcMenu");
		Structure NonAlcMenu=new Structure("NonAlcMenu");
		
		menuDrinks.addNode(AlcMenu);
		menuDrinks.addNode(NonAlcMenu);
		
		Node pizzaCarbonara=new Node("Pizza Carbonara", 25);
		menuFood.addNode(pizzaCarbonara);
		menuFood.addNode(pizzaCarbonara);
		Node pastaCarbonara=new Node("Pasta Carbonara", 27);
		System.out.println(menu.getInfo());

	}

}

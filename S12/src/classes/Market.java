package classes;

public class Market {
	private String name;
	private float area;
	private ETypeMarket typeMarket;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public ETypeMarket getTypeMarket() {
		return typeMarket;
	}
	public void setTypeMarket(ETypeMarket typeMarket) {
		this.typeMarket = typeMarket;
	}
	public Market(String name, float area, ETypeMarket typeMarket) {
		super();
		this.name = name;
		this.area = area;
		this.typeMarket = typeMarket;
	}
	@Override
	public String toString() {
		return "Market [name=" + name + ", area=" + area + ", typeMarket=" + typeMarket + "]";
	}
	

}

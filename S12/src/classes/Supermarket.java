package classes;

import java.util.ArrayList;

import exception.ExceptionMarket;

public class Supermarket {

	private String name;
	//private int area;
	private ArrayList<Market> listMarkets;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Market> getListMarkets() {
		return listMarkets;
	}
	public void setListMarkets(ArrayList<Market> listMarkets) {
		this.listMarkets = listMarkets;
	}
	public Supermarket(String name, ArrayList<Market> listMarkets) {
		super();
		this.name = name;
		this.listMarkets = listMarkets;
	}
	@Override
	public String toString() {
		return "Supermarket [name=" + name + ", listMarkets=" + listMarkets + "]";
	}
	
	public String getBiggestMarketByArea(ETypeMarket type) throws ExceptionMarket
	{
		if(type==null)
			throw new ExceptionMarket();
		float areaMax= this.listMarkets.get(0).getArea();
		String nameMarketMax=this.listMarkets.get(0).getName();
		
		for(int i=0; i<this.listMarkets.size(); i++)
			if(areaMax<this.listMarkets.get(i).getArea() && this.listMarkets.get(i).getTypeMarket()==type)
				{
					areaMax=this.listMarkets.get(i).getArea();
					nameMarketMax=this.listMarkets.get(i).getName();
				}
		return nameMarketMax;
	}
}


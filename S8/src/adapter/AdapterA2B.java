package adapter;

public class AdapterA2B extends DiscountB implements IDiscountA{

	@Override
	public double calculateDiscountA(int value) {
		// TODO Auto-generated method stub
		//in cazul asta A2B nu prea se poate, ca in A nu avem client, ne lipsesc date
		return 0;
	}
	

}

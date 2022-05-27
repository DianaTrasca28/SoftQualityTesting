package strategy;

public class StrategyDetMax implements IStrategy{

	@Override
	public int process(int[] v) {
		// TODO Auto-generated method stub
		int max=v[0];
		for(int i=0;i<v.length;i++) {
			if(v[i]>max)
				max=v[i];
		}
		return max;
	}
	

}

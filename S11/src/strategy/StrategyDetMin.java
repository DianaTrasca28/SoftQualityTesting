package strategy;

public class StrategyDetMin implements IStrategy{

	@Override
	public int process(int[] v) {
		// TODO Auto-generated method stub
			int min=v[0];
			for(int i=0;i<v.length;i++) {
				if(v[i]<min)
					min=v[i];
			}
			return min;
	}

}

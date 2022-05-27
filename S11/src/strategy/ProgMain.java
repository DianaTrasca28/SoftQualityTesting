package strategy;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] val= new int[10];
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				val[i]=-i*2+3;
			}else {
				val[i]=i*3+1;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(" "+val[i]);
		}
		DataContext context=new DataContext(val, new StrategyDetMax());
		int value=context.processValues();
		System.out.println("Value "+ value);
		

	}

}

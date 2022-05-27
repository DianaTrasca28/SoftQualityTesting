package strategy;

public class DataContext {

	private int[] values=null;
	private IStrategy strategy;
	public int[] getValues() {
		return values;
	}
	public IStrategy getStrategy() {
		return strategy;
	}
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	public void setValues(int[] values) {
		this.values = values;
	}
	public DataContext(int[] values, IStrategy strategy) {
		super();
		this.values = values;
		this.strategy = strategy;
	}
	public int processValues() {
		// TODO Auto-generated method stub
		return this.strategy.process(this.values);
	}
	
	
}

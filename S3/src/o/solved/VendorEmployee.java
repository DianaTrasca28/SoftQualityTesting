package o.solved;

public class VendorEmployee extends Employee{

	public VendorEmployee(int id, String name, float salary) {
		super(id, name, salary);
	}
	
	@Override
	public float calculateBonus() {
		// TODO Auto-generated method stub
		return this.getSalary();
	}
}

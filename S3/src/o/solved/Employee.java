package o.solved;

public abstract class Employee {

	private int ID;
	private String name;
	private float salary;
	//private String employeeType; 
	public Employee() {
		
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public float getSalary() {
		return this.salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee(int iD, String name, float salary) {
		super();
		this.ID = iD;
		this.name = name;
		this.salary=salary;
		//this.employeeType=empType;
	}
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", salary: "+ salary + "]";
	}
	
	public abstract float calculateBonus();
}

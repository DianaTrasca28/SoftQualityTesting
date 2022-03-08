package o;

public class Employee {

	private int ID;
	private String name;
	private float salary;
	private String employeeType; 
	
	public Employee() {
		
	}
	
	public String getType() {
		return this.employeeType;
	}
	public void setType(String type) {
		this.employeeType=type;
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
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee(int iD, String name, float salary, String empType) {
		super();
		this.ID = iD;
		this.name = name;
		this.employeeType=empType;
	}
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", salary: "+ salary + "]";
	}
	
	public float calculateBonus() {
		if(this.employeeType=="FTE")
			return this.salary*1f;
		else
			return this.salary*.05f;
	}
}

package classes;

import interfaces.IPerson;

public class Person implements IPerson{

	private String name;
	private String personalNumber;
	private int age;
	private double[] costReceipts;
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double[] getCostReceipts() {
		return costReceipts;
	}
	public void setCostReceipts(double[] costReceipts) {
		this.costReceipts = costReceipts;
	}
	public Person(String name, String personalNumber, int age, double[] costReceipts) {
		super();
		this.name = name;
		this.personalNumber = personalNumber;
		this.age = age;
		this.costReceipts = costReceipts;
	}
	
	
	public Person(String name, String personalNumber, int age) {
		super();
		this.name = name;
		this.personalNumber = personalNumber;
		this.age = age;
	}
	@Override
	public double getAvgCosts() throws Exception{
		if(this.costReceipts==null || this.costReceipts.length==0)
			throw new Exception();
		double sum=0;
		for(int i=0; i<this.costReceipts.length; i++)
			sum+=this.costReceipts[i];
		return sum/this.costReceipts.length;
	}
		
	
	
}

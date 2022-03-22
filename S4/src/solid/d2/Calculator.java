package solid.d2;

public class Calculator {
	public enum Operation {ADD, SUBSTRACT, DIVIDE, MULTIPLY};
	
	public static void calculate(double a, double b, AddNumbers op) {
		double result=0;
		result=op.add(a, b);
		System.out.println(result);
		
	}
	public static void calculate(double a, double b, SubstractNumbers op) {
		double result=0;
		result=op.substract(a, b);
		System.out.println(result);
		
	}

}

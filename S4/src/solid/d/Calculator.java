package solid.d;

public class Calculator {
	public enum Operation {ADD, SUBSTRACT, DIVIDE, MULTIPLY};
	
	public static void calculate(double a, double b, int op) {
		double result=0;
		switch(op) {
		case 1:
			result=a+b;
			break;
		case 2:
			result=a-b;
			break;
		default:
			result=a/b;
			break;
		}
		System.out.println(result);
		
	}

}

package operators;


public class ArithmaticOperators {
	
	public void addition(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	
	public void subtraction(long i, long j) {
		System.out.println(i-j);
	}
	
	public static double multiplication(double a,double b) {
		return a*b;
	}
	
	public static int division(int i, int j) {
		return i/j;
	}
	
	//Why main method is static?
	public static void main(String[] args) {
		ArithmaticOperators arithmaticOperators=new ArithmaticOperators();
		arithmaticOperators.addition(10, 20);
		arithmaticOperators.subtraction(45l, 40l);
		System.out.println(multiplication(40.36, 10.23));
		System.out.println(division(10, 2));
	}
}

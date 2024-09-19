package operators;

public class BitwiseOperator1 {
	
	public static void method1(int a, int b) {
		if(a<=b & b>=a) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public static void method2(int a, int b) {
		if(a<=b & b>=a) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public void method3() {
		if(10>=10 | 20<=6) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public static void main(String[] args) {
		method1(10, 20);
		method2(5, 4);
		BitwiseOperator1 bitwiseOperator1=new BitwiseOperator1();
		bitwiseOperator1.method3();
	}
}

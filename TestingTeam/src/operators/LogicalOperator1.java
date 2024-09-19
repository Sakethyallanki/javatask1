package operators;

public class LogicalOperator1 {
	
	public static void method1(int a, int b) {
		//Logical && -- if both conditions returns true if block will be executed
		//If one condition becomes false else block will be executed
		if(a>b && a!=b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public static void method2(int a, int b) {
		//Logical && -- if both conditions returns true if block will be executed
		//If one condition becomes false else block will be executed
		if(a>b && a!=b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public void method3(long a,long b) {
		if(a>b || b>a) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public void method4(long a,long b) {
		if(a<b || b>a) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public static void main(String[] args) {
		method1(10, 5);
		method2(5, 10);
		LogicalOperator1 logicalOperator1=new LogicalOperator1();
		logicalOperator1.method3(100l, 150l);
		logicalOperator1.method4(1256l, 1111l);
	}
}

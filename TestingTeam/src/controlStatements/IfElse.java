package controlStatements;

public class IfElse {
	
	public static void method1(int age) {
		//Relational Operators
		if (age>=25) {
			System.out.println("Eligible To Marriage..!!!!");
		} else {
			System.out.println("Not Eligible to marriage...!!!");
		}
	}
	
	public void method2(int a, int b) {
		if(a<b) {
			System.out.println("If Block");
		}
		else {
			System.out.println("Else Block");
		}
		
		if (a!=b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (b==a) {
			System.out.println(a+b);
		} else {
			System.out.println(a*b);
		}
	}
	
	public static void method3(double a, double b) {
		if (a>b) {
			System.out.println("Hello from If block");
		}else if (a!=b) {
			System.out.println("Hii");
		}
		else if (a<b) {
			System.out.println("Hello from Else If block");
		}
		else {
			System.out.println("Hello from else block");
		}
	}
	
	public static void main(String[] args) {
		method1(25);
		IfElse else1=new IfElse();
		else1.method2(0, 0);
		method3(45.63, 45.63);
	}
}

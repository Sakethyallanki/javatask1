package controlStatements;

public class DoWhileLoop {
	
	public static void method1(boolean a) {
		do {
			System.out.println(a);
		} while (a);
	}
	
	public static void method2(int a,int b) {
		do {
			System.out.println((a+b));
			System.out.println(a*b);
		} while (a==b);
	}
	
	public void method3(int a) {
		do {
			System.out.println(a*a);
			a++;
		} while (a<=10);
	}
	
	public static void main(String[] args) {
//		method1(true);
//		method2(10, 10);
		DoWhileLoop doWhileLoop=new DoWhileLoop();
		doWhileLoop.method3(5);
	}
}

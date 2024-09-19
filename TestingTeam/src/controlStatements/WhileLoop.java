package controlStatements;

public class WhileLoop {
	
	public void method1(int a) {
		while (a<=5) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void method2(boolean b) {
		while (b) {
			System.out.println(b);
		}
	}
	
	public static void method3(int a) {
		while (a<=3) {
			System.out.println("Hello World..!!!");
			a++;
			continue;
		}
	}
	
	public static void main(String[] args) {
		WhileLoop loop=new WhileLoop();
		loop.method1(1);
		method2(false);
		method3(2);
	}
}

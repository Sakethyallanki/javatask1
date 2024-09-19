package methods;

public class Demo4 {
	
	public void method1() {
		System.out.println("Im from Non Static..!!!");
	}
	
	public static void method2() {
		Demo4 demo4=new Demo4();
		demo4.method1();
		System.out.println("Im from Static");
	}
	
	public void method3() {
		method2();
		System.out.println("Im from Non static 1");
	}
	
	public static void method4() {
		Demo4 demo4=new Demo4();
		demo4.method3();
		System.out.println("Im from static 1");
	}
	
	public static void main(String[] args) {
		method4();
	}
}

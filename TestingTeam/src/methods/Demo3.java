package methods;

public class Demo3 {
	
	//Types of Varibles ---> Local , Instance , static
	//Static and Global variables will be declared out of the method and inside the class
	static int i=10; //Static variable
	String string="Hyderabad..!!!"; //Instance or Global or Non static variable
	
	public void method1() {
		int a=100; //Local variable
		System.out.println(a);
		System.out.println(i);
		System.out.println(string);
	}
	
	public static void method2() {
		System.out.println(i);
		Demo3 demo3=new Demo3();
		System.out.println(demo3.string);
	}
	
	public static void main(String[] args) {
		Demo3 demo3=new Demo3();
		demo3.method1();
		method2();
	}
}

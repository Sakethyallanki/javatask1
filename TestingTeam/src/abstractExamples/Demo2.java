package abstractExamples;

public class Demo2 extends Demo1{

	@Override
	public void method2() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Demo2 demo2=new Demo2();
		demo2.method1();
		demo2.method2();
	}
}

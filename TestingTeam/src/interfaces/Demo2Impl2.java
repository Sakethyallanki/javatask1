package interfaces;

public class Demo2Impl2 extends Demo2Impl{

	@Override
	public void method3() {
		System.out.println("Im from Sub Class...!!");
	}
	
	public static void main(String[] args) {
		Demo2Impl2 demo2Impl2=new Demo2Impl2();
		demo2Impl2.method3();
		demo2Impl2.method2();
		Demo2.method1();
	}
}

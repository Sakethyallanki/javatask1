package interfaces;

public class Demo1Impl implements Demo1{

	@Override
	public void method1() {
		System.out.println("Hello World..!!");
	}

	@Override
	public String method2() {
		
		return "Hii";
	}
	
	public static void main(String[] args) {
		Demo1Impl demo1Impl=new Demo1Impl();
		demo1Impl.method1();
		System.out.println(demo1Impl.method2());
	}
}

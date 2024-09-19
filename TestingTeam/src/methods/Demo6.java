package methods;

public class Demo6 {
	
	public String method1(String s) {
		return s;
	}
	
	public long method2(long l) {
		return l;
	}
	
	public void method3() {
		System.out.println(method2(1234567890l));
	}
	public static void main(String[] args) {
		Demo6 demo6=new Demo6();
		System.out.println(demo6.method1("Gachibowli..!!!"));
//		System.out.println(demo6.method2(123456789645l));
		demo6.method3();
	}
}

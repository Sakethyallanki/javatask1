package methods;

public class Demo5 {
	
	public void method1(int a,String str) {
		System.out.println(a);
		System.out.println(str);
	}
	
	public static void method2(long l, double d, boolean b) {
		Demo5 demo5=new Demo5();
		demo5.method1(10, "Charan");
		System.out.println(l);
		System.out.println(d);
		System.out.println(b);
	}
	
	public void method3(int b, long s) {
		method2(100000, 56.36, false);
		System.out.println(b);
		System.out.println(s);
	}
	
	public void method4(float f, char ch, int i, long l) {
		method3(1, 2);
		System.out.println(f);
		System.out.println(ch);
		System.out.println(i);
		System.out.println(l);
	}
	public static void main(String[] args) {
		Demo5 demo5=new Demo5();
		demo5.method4(12.36f, '#', 12, 96l);
	}
}

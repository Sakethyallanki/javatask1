package superExamples;

public class Super2 extends Super1{
	
	public Super2(String msg) {
		super(msg);
	}

	String name="Kiran";
	String address="Hyderabad";
	
	public void display() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(super.address);
		System.out.println(super.name);
	}
	
	public void method1() {
		System.out.println("Hello From Child Class..!!");
	}
	
	public void method2() {
		super.method1();
	}
	
	public static void main(String[] args) {
		Super2 super2=new Super2("Hii");
		super2.display();
		super2.method1();
		super2.method2();
	}
}

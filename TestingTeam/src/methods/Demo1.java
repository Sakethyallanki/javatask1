package methods;

public class Demo1 {
	
	//Static method
	public static void method1() {
		System.out.println("Hyderabad..!!!!");
	}
	
	//Non static Method
	public void method2() {
		System.out.println("Gachibowli...!!!");
	}
	
	public static void main(String[] args) {
		method1(); //static methods can be called Directly or by using Class Name
		Demo1.method1();
		
		//To call Non-static methods we need to create Object of the Class.
		Demo1 demo1=new Demo1(); //Object Creation
		demo1.method2();
	}
}

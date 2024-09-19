package constructors;

public class Example4 {
	
	public Example4(int a,int b) {
		System.out.println((a+b));
		System.out.println((a*b));
		System.out.println((a-b));
		System.out.println((a/b));
	}
	
	public Example4() {
		this(5, 4);
	}
	
	public Example4(String name,int age) {
		this();
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
	
	public Example4(String address) {
		this("Sai", 24);
		System.out.println("Address :"+address);
	}
	
	public static void main(String[] args) {
		Example4 example4=new Example4("Hyderabad");
	}
}

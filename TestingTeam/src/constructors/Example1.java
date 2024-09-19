package constructors;

public class Example1 {
	
	//Two types -- Default and Parameterised 
	//Default Constructor
	public Example1() {
		System.out.println("Hello From Constructor..!!!");
	}
	
	public Example1(int a,int b) {
		System.out.println((a+b));
		System.out.println((a-b));
		System.out.println((a*b));
		System.out.println((a/b));
	}
	
	public static void main(String[] args) {
		Example1 example1=new Example1();
		Example1 example2=new Example1(10, 10);
	}
}

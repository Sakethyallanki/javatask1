package operators;

public class UnaryOperator {
	
	public void method1(int a) {
		//Post Prefix
		System.out.println(a++); // adds 1 value
		System.out.println(a);
		System.out.println(a--); //subtracts 1 value
		System.out.println(a);
	}
	
	public void method2(long l) {
		//Prefix
		System.out.println(++l);
		System.out.println(--l);
	}
	
	public static void method3(int i) {
		System.out.println(i++); //50
		System.out.println(++i); //52
		System.out.println(--i);  //51
		System.out.println(i--); //51
		System.out.println(i); //50
	}
	
	public static void main(String[] args) {
		UnaryOperator unaryOperator=new UnaryOperator();
		unaryOperator.method1(100);
		unaryOperator.method2(10l);
		method3(50);
	}
}

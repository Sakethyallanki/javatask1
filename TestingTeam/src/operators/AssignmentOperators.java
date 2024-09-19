package operators;

public class AssignmentOperators {
	
	public static void method1(int i) {
		i+=10;
		System.out.println(i);
		i-=10;
		System.out.println(i);
		i*=10;
		System.out.println(i);
		i=60;
		System.out.println(i);
		i/=6;
		System.out.println(i);
		i%=10;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		method1(40);
	}
}

package exceptions;

public class Exception1 {
	
	//Assuem we have 10 lines of code
//	1
//	2
//	3
//	4
//	5 -- i got an exception
//	6
//	7
//	8
//	9
//	10
	
	public void method1(int num) {
		try {
			int a=num/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Exception1 exception1=new Exception1();
		exception1.method1(10);
		
		int i[]= {1,2,3,4,5,6};
		try {
			System.out.println(i[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled..!!");
		}
		
		System.out.println("Hello...!!!");
		System.out.println("Hello...!!!");
		System.out.println("Hello...!!!");
		System.out.println("Hello...!!!");
		System.out.println("Hello...!!!");
	}
}

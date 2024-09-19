package exceptions;

public class Exception2 {
	
	//Assuem we have 11 lines of code
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
//  11 finally block
	
	public static void method1() {
		try {
			int a=100/0;
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			int b=10/5;
			System.out.println(b);
			System.out.println("Hello All..!!!");
		}
	}
	
	public static void method2(int age) throws NotEligibleException {
		if(age>18) {
			System.out.println("Eligible to License...!!");
		}else {
			throw new NotEligibleException("Not Eligible...!!!");
		}
	}
	
	public static void main(String[] args) {
		method1();
		try {
			method2(17);
		} catch (NotEligibleException e) {
			e.printStackTrace();
		}
	}
}

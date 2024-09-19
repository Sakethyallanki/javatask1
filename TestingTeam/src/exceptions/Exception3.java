package exceptions;

public class Exception3 {
	
	public static void method1(int age) throws NotEligibleException {
		if(age>=25) {
			System.out.println("Eligible to Marriage...!!!!");
		}else {
			throw new NotEligibleException("Not Eligible to Marriage..!!!");
		}
	}
	
	public static void method2(String name) throws NotEligibleException {
		if(name.equals("Charan")) {
			System.out.println("Eligible..!!!!");
		}else {
			throw new NotEligibleException("Not Eligible...!!!");
		}
	}
	
	public static void main(String[] args){
		try {
			method1(30);
		} catch (NotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			method2("nani");
		} catch (NotEligibleException e) {
			e.printStackTrace();
		}
	}
}

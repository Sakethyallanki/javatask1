package operators;

public class TernaryOperators {
	
	public static void method1() {
		String string=10<5?"true":"false";
		System.out.println(string);
	}
	
	public static void vote(int age) {
		String eligible=age>=18?"Eligible to Vote":"Not Eligible to Vote";
		System.out.println(eligible);
		
		String license=age<=18?"Get a License":"Dont get License..!!";
		System.out.println(license);
		
		int i=age!=20?18:25;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		method1();
		vote(18);
	}
}

package methods;

public class MethodOverloading2 {

	public static int payment(int cash) {
		return cash;
	}

	public long payment(long cards) {
		return cards;
	}

	public void payment(String upi) {
		System.out.println("Payment done with UPI :" + upi);
	}

	public void payment(String username, String password) {
		System.out.println("Payment done with Netbanking");
	}
	
	public static void main(String[] args) {
		System.out.println(payment(15200));
		MethodOverloading2 methodOverloading2=new MethodOverloading2();
		System.out.println(methodOverloading2.payment(7897891237l));
		methodOverloading2.payment("abc@ybl");
		methodOverloading2.payment("Charan", "Passwordledu");
	}
}

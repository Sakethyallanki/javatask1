package encapsulation;

public class Customer extends User{
	
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setAddress("Hyd");
		System.out.println(customer.getAddress());
	}
}

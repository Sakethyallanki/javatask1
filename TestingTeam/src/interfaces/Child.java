package interfaces;

public class Child implements Father,Mother{

	@Override
	public void moneyForPhone() {
		System.out.println("20000/-");
	}

	@Override
	public void moneyForShopping() {
		System.out.println("10000/-");
	}
	
	public static void main(String[] args) {
		Child child=new Child();
		child.moneyForPhone();
		child.moneyForShopping();
	}
}

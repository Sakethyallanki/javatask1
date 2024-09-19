package inheritance;

public class DaughterSon extends Daughter{
	
	public void property1() {
		System.out.println("0 acres of Land...!!!");
	}
	
	public void property2() {
		System.out.println("100 grams Gold...!!");
	}
	
	public static void main(String[] args) {
		DaughterSon daughterSon=new DaughterSon();
		daughterSon.property1();
		daughterSon.property2();
	}
}

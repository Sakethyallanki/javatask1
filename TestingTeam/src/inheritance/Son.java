package inheritance;

public class Son extends FatherAndMother{
	
	public static void property1() {
		System.out.println("10 acres of Land..!!");
	}
	
	public void property2() {
		System.out.println("10 Floored Building...!!");
	}
	
	public void property3() {
		System.out.println("5 Plots in Shamshabad..!!");
	}
	
	public static void main(String[] args) {
		Son son=new Son();
		son.property2();
		son.property3();
		property1();
	}
}

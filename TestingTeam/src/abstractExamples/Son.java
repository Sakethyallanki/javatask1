package abstractExamples;

public class Son extends Father{

	@Override
	public void plot() {
		System.out.println("Growing Vegetables..!!");
	}
	
	public static void main(String[] args) {
		Son son=new Son();
		son.house();
		son.plot();
	}
}

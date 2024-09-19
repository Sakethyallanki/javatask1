package inheritance;

public class YoungerBrother extends ElderBrother{
	
	public void game1() {
		System.out.println("Chess Board is broked...!!");
	}
	
	public static void main(String[] args) {
		YoungerBrother brother=new YoungerBrother();
		brother.game1();
		game2();
	}
}

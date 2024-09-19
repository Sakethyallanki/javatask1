package interfaces;

public interface Demo2 {
	
	public static void method1() {
		System.out.println("Im Static from Interface");
	}
	
	default void method2() {
		System.out.println("Im Default from Interface");
	}
	
	void method3();
}

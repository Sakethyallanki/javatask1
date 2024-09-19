package methods;

public class MethodOverloading1 {
	
	public void unlockThePhone(String password) {
		System.out.println("Phone Unlocked with Password..!!!");
	}
	
	public static void unlockThePhone(int pin) {
		System.out.println("Phone Unlocked with Pin..!!!");
	}
	
	public static void unlockThePhone(long pattern) {
		System.out.println("Phone Unlocked with pattern..!!!");
	}
	
	public String unlockThePhone(String faceLock,String fingerPrint) {
		return "Phone Unlocked with Facelock and fingerPrint..!!!";
	}
	
	public static void main(String[] args) {
		MethodOverloading1 methodOverloading1=new MethodOverloading1();
		methodOverloading1.unlockThePhone("123456");
		System.out.println(methodOverloading1.unlockThePhone("Facelock", "finger print"));
		unlockThePhone(1234);
		unlockThePhone(1596357);
	}
}

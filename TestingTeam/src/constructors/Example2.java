package constructors;

public class Example2 {
	
	String name;
	String address;
	long phnno;
	String email;
	
	public Example2(String n,String a,long p,String e) {
		this.name=n;
		this.address=a;
		this.phnno=p;
		this.email=e;
		
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.address);
		System.out.println("Phone Number :"+this.phnno);
		System.out.println("Email :"+this.email);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Example2 example2=new Example2("Charan", "Sangareddy", 12346678945l, "sricharan824@gmail.com");
		Example2 example22=new Example2("Sri", "Hyderabad", 12346567989l, "qwertyui@");
		Example2 example3=new Example2("Kiran", "Nalgonda", 12346567989l, "asdfghjk@");
		Example2 example4=new Example2("Sai", "Adilabad", 12346567989l, "zxcvbnm@");
	}
}

package constructors;

public class Example3 {
	
	String name;
	int age;
	double tenth;
	double inter;
	double degree;
	double pg;
	
	public Example3(String name,int age, double tenth, double inter, double degree , double pg) {
		this.name=name;
		this.age=age;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
		this.pg=pg;
		
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
		System.out.println("Tenth :"+this.tenth);
		System.out.println("Inter :"+this.inter);
		System.out.println("Degree :"+this.degree);
		System.out.println("PG :"+this.pg);
		System.out.println();
	}
	
	public Example3(String name,int age, double tenth, double inter, double degree) {
		this.name=name;
		this.age=age;
		this.tenth=tenth;
		this.inter=inter;
		this.degree=degree;
		
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
		System.out.println("Tenth :"+this.tenth);
		System.out.println("Inter :"+this.inter);
		System.out.println("Degree :"+this.degree);
		System.out.println();
	}
	
	public Example3(String name,int age, double tenth, double inter) {
		this.name=name;
		this.age=age;
		this.tenth=tenth;
		this.inter=inter;
		
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
		System.out.println("Tenth :"+this.tenth);
		System.out.println("Inter :"+this.inter);
		System.out.println();
	}
	
	public Example3(String name,int age, double tenth) {
		this.name=name;
		this.age=age;
		this.tenth=tenth;
		
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
		System.out.println("Tenth :"+this.tenth);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Example3 example3=new Example3("Raju", 23, 89.36);
		Example3 example32=new Example3("Kiran", 25, 90.35, 85);
		Example3 example33=new Example3("Charan", 50, 87, 67, 60);
		Example3 example34=new Example3("Vinith", 24, 89, 85, 75, 78);
	}
}

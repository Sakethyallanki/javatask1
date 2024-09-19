package controlStatements;

public class ForLoop {
	
	//Do while, while, for , for each
	
	public void method1() {
		for (int i = 1; i <=10; i++) {
			//1<=10 -- true -- 2
			//2<=10 -- true -- 3
			//3<=10 -- true -- 4
			//4<=10 -- true -- 5
			//10<=10 -- true -- 11
			//11<=10 -- false
			System.out.println("Charan");
		}
	}
	
	public static void method2() {
		for(int i=10;i>=1;i--) {
			//10>=1 -- true -- 9
			//9>=1 -- true --8
			//5>=1 -- true -- 4
			//1>=1 -- true -- 0
			//0>=1 -- false 
			if(i==5) {
				System.out.println("Hello World..!!");
				break;
			}else {
				System.out.println("Hello");
			}
		}
	}
	
	public static void method3() {
		//Rows and Columns in Matrices
		//Print data in matrices we go with Inner for loops
		for(int i=1;i<=5;i++) {
			//1<=5 -- true --  2
			//2<=5 -- true -- 3
			//3<=5 -- true -- 4
			//4<=5 -- true -- 5
			//5<=5 -- true -- 6
			//6<=5 -- false
			for(int j=1;j<=i;j++) {
				//1<=5 -- true -- 2
				//2<=5 -- true -- 3
				//3<=5 -- true -- 4
				//4<=5 -- true -- 5
				//5<=5 -- true -- 6
				//6<=5 -- false
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ForLoop forLoop=new ForLoop();
		forLoop.method1();
		method2();
		method3();
	}
}

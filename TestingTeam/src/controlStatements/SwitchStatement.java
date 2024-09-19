package controlStatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void method1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Vehicle...!!!");
		String vehicle = scanner.next();

		switch (vehicle) {
		case "Car":
			System.out.println("Pay 110/-");
			break;
		case "Lorry":
			System.out.println("Pay 200/-");
			break;
		case "Bus":
			System.out.println("Pay 150/-");
			break;
		case "Tractor":
			System.out.println("Pay 180/-");
			break;
		default:
			System.out.println("No Vehicles Entered..!!");
		}
	}

	public static void arithmeticOperations(int a, int b) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Value...!!!");
		String operator = scanner.next();

		switch (operator) {
		case "+":
			System.out.println("Addition :" + (a + b));
			break;
		case "-":
			System.out.println("Subtraction :" + (a - b));
			break;
		case "*":
			System.out.println("Multiplication :" + a * b);
			break;
		case "/":
			System.out.println("Division :" + a / b);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
	}

	public static void main(String[] args) {
//		method1();
		arithmeticOperations(10, 20);
	}
}

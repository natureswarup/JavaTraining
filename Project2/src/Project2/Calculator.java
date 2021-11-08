package Project2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		int a = scanner.nextInt();
		System.out.println("Enter your second number: ");
		int b = scanner.nextInt();
		
		System.out.println("The sum of both numbers is: " + (a+b));

	}
	


}

package OverAllJavaProgram;

import java.util.Scanner;

public class FactorialCalculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("------ Factorial Calculator ------");
		
		for (int body = 1; body <= 4; body++) {
			System.out.print("Enter positive number: ");
			
			int num = input.nextInt();
			
			if (num > 0) {
				int res = 1;
				for (int factor = 1; factor <= num; factor++) {
						System.out.println(num + "! = " + factor + " X " + factor);
						res = res*factor;
				}
					System.out.println("the factorial of " + num + " is: " + res);
			}
			
			else if (num < 0) {
				System.out.print("Invalid input! Program stopped.");
				break;
				
			}
		}
	}
}
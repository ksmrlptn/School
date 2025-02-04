package OverAllJavaProgram;

import java.util.Scanner;

public class Salary {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String Employee;
		System.out.print("Enter employee name: ");
		Employee = input.nextLine();
		
		char Option;
		System.out.print("Press F if Full time or P if Part time: ");
		Option = input.next().charAt(0);
		switch (Option) {
			case 'F': 
			System.out.println("--- Full Time Employee ---");
			int Salary;
			System.out.print("Enter Basic Pay: ");
			Salary = input.nextInt();
			System.out.println("____________________");
			System.out.print("Employee name: " + String.format("%s %n", Employee) + "Basic pay: " + String.format("₱%d %.2f %n", Salary));
			System.out.println("____________________");
			System.out.print("Gross pay: " + String.format("₱%d %.2f %n", Salary));
			break;
			
			case 'P': 
			System.out.println("--- Part Time Employee ---");
			float rate;
			int hours;
			double time;
			double pay;
			double over;
			double gross;
			System.out.print("Enter rate per hour: ");
			rate = input.nextFloat();
			System.out.print("Enter no. of hours worked: ");
			hours = input.nextInt();
			System.out.print("Enter no. of overtime: ");
			time = input.nextFloat();
			pay = rate * hours;
			over = time * (rate * 1.25);
			gross = rate * hours + over;
			System.out.println("____________________");
			System.out.print("Employee name: " + String.format("%s %n", Employee) + "Salary: " + String.format("₱%.2f %n", pay) + "Overtime pay: " + String.format("₱%.2f %n", over));
			System.out.println("____________________");
			System.out.print("Gross pay: " + String.format("₱%.2f %n", gross));
			
		}
	}
}
package OverAllJavaProgram;

import java.util.Scanner;

public class AgeSorter {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] namesAndBirthYears = new String[5][2];
		int[] ages = new int[5];
		// Ask the user to input 5 names and birth years
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a name: ");
			namesAndBirthYears[i][0] = input.nextLine();
			System.out.print("Enter the person\'s birth year: ");
			namesAndBirthYears[i][1] = input.nextLine();
			ages[i] = 2022 - Integer.parseInt(namesAndBirthYears[i][1]);
			// Calculate the age of each person
		}
		// Sort the names and birth years array in order from oldest to youngest
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (ages[i] < ages[j]) {
					// Swap the elements at index i and j
					int tempAge = ages[i];
					ages[i] = ages[j];
					ages[j] = tempAge;
					String[] tempNameAndBirthYear = namesAndBirthYears[i];
					namesAndBirthYears[i] = namesAndBirthYears[j];
					namesAndBirthYears[j] = tempNameAndBirthYear;
				}
			}
		}
		// Print the names in order from oldest to youngest
		System.out.println("\nNames in order from oldest to youngest:");
		for (int i = 0; i < 5; i++) {
			System.out.println(namesAndBirthYears[i][0]);
		}
	}
}
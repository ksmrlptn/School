package OverAllJavaProgram;

import java.util.Scanner;

public class Grader {
	
	public static void main(String[] args) {
		
		int score[] = new int[8];
		int a;
		float total = 0, average;
		Scanner scanner = new Scanner(System.in);
		
		for(a = 0; a < 8; a++) {
			System.out.print("Enter score for subject " + (a+1) + ": "); 
			score[a] = scanner.nextInt();
			total = total + score[a];
	}	
		scanner.close();
		average = total/8;
		System.out.print("Average score: " + total / 8 + " | ");
		if(average >= 90 && average <= 100)
		{
			System.out.print(" A Grade | " + "Excellent ");
    }
		else if(average >= 80 && average <= 89)
		{ 
			System.out.print(" B Grade | " + "Very good ");
		} 
		else if(average >= 70 && average <= 79) 
		{ 
			System.out.print(" C Grade | " + "Improvement needed ");
		} 
		else if(average >= 60 && average <= 69)
		{ 
			System.out.print(" D Grade | " + "Close fail ");
	  }
		else if (average <= 59)
		{
			System.out.print(" F Grade | " + "Fail ");
	  }
	}
}
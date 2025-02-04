package OverAllJavaProgram;

import java.util.Scanner;

public class HarryPotterQuiz {
    public static void main(String[] args) {
        // Initialize variables
        int score = 0;
        String[] questions = {"What is the name of Harry Potter's best friend?", 
                              "What is the name of the school of witchcraft and wizardry that Harry attends?", 
                              "Who is the author of the Harry Potter series?", 
                              "What is the name of Harry's godfather?", 
                              "What is the name of the secret society in Hogwarts that Harry joins in the fifth book?"};
        String[][] choices = {{"Ron Weasley", "Hermione Granger", "Neville Longbottom"}, 
                              {"Hogwarts School of Witchcraft and Wizardry", "Beauxbatons Academy of Magic", "Durmstrang Institute"}, 
                              {"J.K. Rowling", "Stephenie Meyer", "Suzanne Collins"}, 
                              {"Remus Lupin", "Sirius Black", "Albus Dumbledore"}, 
                              {"Dumbledore's Army", "The Order of Phoenix", "The Slytherin Society"}};
        String[] answers = {"Ron Weasley", "Hogwarts School of Witchcraft and Wizardry", "J.K. Rowling", "Sirius Black", "Dumbledore's Army"};
        
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            // Loop through each choice
            for (int j = 0; j < choices[i].length; j++) {
                System.out.println((j + 1) + ". " + choices[i][j]);
            }
            // Get user's answer
            System.out.print("Enter the number of your answer: ");
            int answer = input.nextInt();
            // Check if answer is correct
            if (choices[i][answer - 1].equals(answers[i])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i]);
            }
        }
        // Display final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);
    }
}

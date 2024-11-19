
import java.util.Scanner;


public class simple_quiz_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char userAnswer;
        int correctAnswers = 0;
        String[] questions = {
            "Question 1: What is the capital of Portugal? \nA. Porto\nB. Lisbon\n C. Kano\nD. Lagos",
            "Question 2: Who is the best football player? \nA. Messi\nB. Ronaldo\n C. Neymar\nD. Lamin Yaml",
            "Question 3: What course does Abdullah studies? \nA. Medicine\nB. Engineering\n C. Business\nD. Accounting",
            "Question 4: When did Nigeria gain independence \nA. 1960\nB. 1930\nC. 2024\nD. 1940",
        };

        char[] correctAnswersKey = {'B', 'A', 'A', 'A'};
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);  // Display each question
            System.out.print("Your answer (A, B, C, or D): ");
            userAnswer = scanner.next().toUpperCase().charAt(0);  // Read user input and convert to uppercase
            
            // Input validation: Ensure the user enters A, B, C, or D
            while (userAnswer != 'A' && userAnswer != 'B' && userAnswer != 'C' && userAnswer != 'D') {
                System.out.println("Invalid input. Please enter A, B, C, or D.");
                System.out.print("Your answer: ");
                userAnswer = scanner.next().toUpperCase().charAt(0);
            }

            // Check if the user's answer matches the correct answer
            if (userAnswer == correctAnswersKey[i]) {
                System.out.println("Correct!\n");
                correctAnswers++;  // Increment correct answer count
            } else {
                System.out.println("Wrong! The correct answer is: " + correctAnswersKey[i] + "\n");
            }
        }

        // Calculate the final score as a percentage
        double score = (double) correctAnswers / questions.length * 100;

        // Display the final score
        System.out.println("You answered " + correctAnswers + " out of " + questions.length + " questions correctly.");
        System.out.println("Your final score is: " + String.format("%.2f", score) + "%");

        // Close the scanner
        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 50.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < 1 || userGuess > 50) {
                System.out.println("Invalid guess. Try a number between 1 and 50.");
                System.out.println("The correct number is " + numberToGuess);
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
                System.out.println("The correct number is " + numberToGuess);
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
                System.out.println("The correct number is " + numberToGuess);
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries!");
                System.out.println("The correct number is " + numberToGuess);
            }

// streak
        }
    }
    }
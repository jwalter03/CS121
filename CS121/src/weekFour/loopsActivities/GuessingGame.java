package weekFour.loopsActivities;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;


public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int upper = 101;
        Random rand = new Random();
        int num = rand.nextInt(1,upper);
        String answer = "";
        int numGuess = 0;

        while (true) {
            System.out.println("Enter a number between 1 and 100 or enter q to quit game");
            numGuess++;
            answer = console.nextLine();
            if (answer.equals("q")) {
                System.out.printf("Quitter. The answer was: " + num);
                break;
            } else {
                int guess = Integer.parseInt(answer);
                if (guess > num) {
                    System.out.println("You guessed too high. Guess again");
                }
                if (guess < num) {
                    System.out.println("You guessed too low. Try again.");
                }
                if (guess == num) {
                    System.out.println("You guessed correct. Good Job!");
                    System.out.println("Number of guesses: "+numGuess);
                    break;
                }
            }
        }
    }
}

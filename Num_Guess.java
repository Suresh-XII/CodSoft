import java.util.Random;
import java.util.Scanner;
public class Num_Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int total = 0;
        int round = 0;
        while (playAgain) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            round++;
            System.out.println("\n  Round " + round + " - Guess the number between 1 and 100!");
            boolean guessedCorrectly = false;
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == number) {
                    System.out.println(" Correct! The number was " + number);
                    System.out.println("You guessed it in " + attempts + " attempts.");
                    total += (maxAttempts - attempts + 1);
                    guessedCorrectly = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println(" Too high!");
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The number was: " + number);
            }
            System.out.println("Your total score: " + total);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }
        System.out.println("Game Finished!  Final Score: " + total);
        scanner.close();
    }
}

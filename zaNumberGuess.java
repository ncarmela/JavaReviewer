import java.util.Random;
import java.util.Scanner;

public class zaNumberGuess {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(20) + 1; // Generates a random number between 1 and 100

        do {
            System.out.println("Guess a number between 1 and 20:");
            guess = scanner.nextInt();
            attempts += 1;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number: " + randomNumber);
                 
                System.out.println("You guessed it in " + attempts + " attempt(s).");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
                 
            } else {
                System.out.println("Too high! Try again.");
                 
            }
        }while (attempts < 5);

        if (guess != randomNumber) {
            System.out.printf("Attempts: %d, you failed \n", attempts);
            System.out.println("Sorry, you've used all your attempts. The number was: " + randomNumber);
        }
        

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class acRandomNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String userChoice;
        int number;

        
        System.out.print("Pick Rock, Paper, or Scissors: ");
        userChoice = scanner.nextLine().toLowerCase();

        Random random = new Random();

        number = random.nextInt(3); // Generates a random number between 0 and 9

        if (userChoice.equals("rock")) {
            if (number == 0) {
                System.out.println("Computer chose Rock. It's a tie!");
            } else if (number == 1) {
                System.out.println("Computer chose Paper. You lose!");
            } else {
                System.out.println("Computer chose Scissors. You win!");
            }
        } else if (userChoice.equals("paper")) {
            if (number == 0) {
                System.out.println("Computer chose Rock. You win!");
            } else if (number == 1) {
                System.out.println("Computer chose Paper. It's a tie!");
            } else {
                System.out.println("Computer chose Scissors. You lose!");
            }
        } else if (userChoice.equals("scissors")) {
            if (number == 0) {
                System.out.println("Computer chose Rock. You lose!");
            } else if (number == 1) {
                System.out.println("Computer chose Paper. You win!");
            } else {
                System.out.println("Computer chose Scissors. It's a tie!");
            }
        } else {
            System.out.println("Invalid choice! Please choose Rock, Paper, or Scissors.");
        }
    


        scanner.close();
       
    }
}

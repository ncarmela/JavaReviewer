import java.util.Scanner;
import java.util.Random;

public class wrappers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] validChoices = {"rock", "paper", "scissors"};
        int computer = random.nextInt(3); 



        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        int userIndex = -1;
        for (int i = 0; i < validChoices.length; i++) {
            if (validChoices[i].equals(userChoice)) {
                userIndex = i;
                break;
            }
        }

        scanner.close();
    }
}

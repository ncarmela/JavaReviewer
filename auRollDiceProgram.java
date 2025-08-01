import java.util.Random;
import java.util.Scanner;

public class auRollDiceProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rolls;
        int dice;
        int total = 0;

        System.out.print("Enter number of rolls: ");
        rolls = scanner.nextInt();

        for(int i = 0; i < rolls; i++){
            dice = random.nextInt(6) + 1;
            System.out.println("Dice " + (i + 1) + ": "+ dice );
            
            printDie(dice);

            total = total + dice;
        }

        System.out.println("Total count: " + total);

        scanner.close();
    }

    static void printDie(int dice){
        switch (dice) {
            case 1:
                System.out.println("-------------");
                System.out.println("|           |");
                System.out.println("|     ●     |");
                System.out.println("|           |");
                System.out.println("-------------");
                break;
            case 2:
                System.out.println("-------------");
                System.out.println("|   ●       |");
                System.out.println("|           |");
                System.out.println("|       ●   |");
                System.out.println("-------------");
                break;
            case 3:
                System.out.println("-------------");
                System.out.println("|   ●       |");
                System.out.println("|     ●     |");
                System.out.println("|       ●   |");
                System.out.println("-------------");
                break;
            case 4:
                System.out.println("-------------");
                System.out.println("|   ●   ●   |");
                System.out.println("|           |");
                System.out.println("|   ●   ●   |");
                System.out.println("-------------");
                break;
            case 5:
                System.out.println("-------------");
                System.out.println("|   ●   ●   |");
                System.out.println("|     ●     |");
                System.out.println("|   ●   ●   |");
                System.out.println("-------------");
                break;
            case 6:
                System.out.println("-------------");
                System.out.println("|   ●   ●   |");
                System.out.println("|   ●   ●   |");
                System.out.println("|   ●   ●   |");
                System.out.println("-------------");
                break;
            
            default:
                break;
        }
    }
}

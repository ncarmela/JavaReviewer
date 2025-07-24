import java.util.Scanner;

public class apNestedLoops {
    public static void main(String[] args) {

        // nested loop = A loop inside a loop inside a loop

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter how many rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter how many columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter symbol: ");
        symbol = scanner.next().charAt(0);
        
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();

    }
}

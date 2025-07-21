import java.util.Scanner;

public class zbExerciseIncrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = new String[5];
        int countie = 0;

        System.out.println("Give me 5 fruits");

        while (countie < 5) {
            System.out.print("Fruit " + (countie + 1) + ": ");
            fruits[countie] = scanner.nextLine();
            countie++;
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        for(int i=0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }


        scanner.close();
    }
}
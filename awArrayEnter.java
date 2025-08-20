import java.util.Scanner;

public class awArrayEnter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        
        System.out.print("Enter the number of food items: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        foods = new String[n];

        System.out.println("Enter 5 food items:");
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food item " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }

        

        for(int i = 0; i < foods.length; i++){
            System.out.print(foods[i]);

            if(i + 1 < foods.length) {
                System.out.print(", ");
            }   
        }

        scanner.close();

    }
}
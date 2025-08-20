import java.util.Scanner;

public class axArraySearch {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        boolean found = false;

        System.out.println("Enter the name of the fruit you want to search for:");
        String searchFruit = scanner.nextLine();
 
        String[] fruits = {"Apple", "Mango", "Orange", "Lychee", "Banana", "Grapes"};

        for (String fruit : fruits) {
            if(searchFruit.equalsIgnoreCase(fruit)) {
                found = true;
                break; 
            }
        }

        if(found) {
            System.out.println("The fruit " + searchFruit + " is present in the array.");
        } else {
            System.out.println("The fruit " + searchFruit + " is not present in the array.");
        }
        
        scanner.close();
    }
}

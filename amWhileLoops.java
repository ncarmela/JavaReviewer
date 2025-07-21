import java.util.Scanner;

public class amWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a loop will run is the condition is true, 
        // and will only stop once the condition is false

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please try again.");
            } else {
                System.out.println("Hello, " + name + "!");
            }
            
        }

        
            

        scanner.close();
    }
}

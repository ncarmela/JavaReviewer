import java.util.Scanner;

public class alLogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // && = AND
        // || = OR
        // ! = NOT

        String username;
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length()<= 4 || username.length() >= 12 || username.contains(" ")) {
            System.out.println("Username is invalid.");
        } else {
            System.out.println("Username is valid.");
        }



        scanner.close();

    }
}

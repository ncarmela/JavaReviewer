import java.util.Scanner;
public class abArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the first number: ");
        // double firstNumber = scanner.nextDouble();
        // scanner.nextLine(); // Consume the newline character

        // System.out.print("Arithmetic Operations: (+, -, *, /)");
        // String operation = scanner.nextLine();

        // System.out.print("Enter the second number: ");
        // double secondNumber = scanner.nextDouble();
        // scanner.nextLine(); // Consume the newline character


        // if(operation.equals("+")) {
        //     System.out.println("Result: " + (firstNumber + secondNumber));
        // } else if(operation.equals("-")) {
        //     System.out.println("Result: " + (firstNumber - secondNumber));
        // } else if(operation.equals("*")) {
        //     System.out.println("Result: " + (firstNumber * secondNumber));
        // } else if(operation.equals("/")) {
        //     if(secondNumber != 0) {
        //         System.out.println("Result: " + (firstNumber / secondNumber));
        //     } else {
        //         System.out.println("Error: Division by zero is not allowed.");
        //     }
        // } else {
        //     System.out.println("Invalid operation. Please use +, -, *, or /.");
        // }



        System.out.print("Enter name: ");
        String name = scanner.nextLine();  
        
        if (name.isEmpty()) {            
            System.out.println("No name provided.");
        } else {
            System.out.println("Hello " + name + "!");
        }


        scanner.close();
    }

}

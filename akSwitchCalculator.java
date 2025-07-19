import java.util.Scanner;

public class akSwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber, secondNumber;
        double answer = 0;
        char operation;

        System.out.println("Enter the first number:");
        firstNumber = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Arithmetic Operations: (+, -, *, /, %)");
        operation = scanner.next().charAt(0);

        System.out.println("Enter the second number:");
        secondNumber = scanner.nextDouble();

        switch (operation) {
            case '+':
                answer = firstNumber + secondNumber;
                break;
            case '-':
                answer = firstNumber - secondNumber;
                break;
            case '*':
                answer = firstNumber * secondNumber;
                break;
            case '/':
                answer = firstNumber / secondNumber;
                break;   
            case '%':
                answer = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Invalid operation. Please use +, -, *, / or %.");
                break;
        }
        

        //Double.isNaN(x); // ✅ true
        //x.isNaN()     // ❌ Error: cannot invoke isNaN() on primitive double


        if (Double.isNaN(answer)) {
            System.out.println("Error.");
        } else {
            System.out.println("Result: " + answer);
        }



        scanner.close();

    }
}

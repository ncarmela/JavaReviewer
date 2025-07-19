import java.util.Scanner;
public class abArithmeticAndCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Arithmetic Operations: (+, -, *, /, %)");
        String operation = scanner.nextLine();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character


        if(operation.equals("+")) {
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if(operation.equals("-")) {
            System.out.println("Result: " + (firstNumber - secondNumber));
        } else if(operation.equals("*")) {
            System.out.println("Result: " + (firstNumber * secondNumber));
        } else if(operation.equals("/")) {
            System.out.println("Result: " + (firstNumber / secondNumber));
           
        } else if(operation.equals("%")) {
            System.out.println("Result: " + (firstNumber % secondNumber));
        } 
        else {
            System.out.println("Invalid operation. Please use +, -, *, / or %.");
        }

        
        // String ➜ int	        Integer.parseInt(String)
        // String ➜ float	    Float.parseFloat(String)
        // String ➜ double	    Double.parseDouble(String)
        // float ➜ String	    Float.toString(float) or String.valueOf(float)
        // double ➜ String	    Double.toString(double) or String.valueOf(double)
        // Any primitive ➜ String	String.valueOf(value)



       
        scanner.close();
    }

}

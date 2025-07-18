public class aiTernaryOperator {
    public static void main(String[] args) {

        // (parameter condition) ? valueIfTrue : valueIfFalse
        
        int a = 10;
        int b = 20;

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;

        System.out.println("The maximum value is: " + max);

        // Example with a condition
        String result = (a < b) ? "a is less than b" : "a is not less than b";
        System.out.println(result);
    }
}

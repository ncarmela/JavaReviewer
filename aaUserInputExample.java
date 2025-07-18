import java.util.Scanner;

public class aaUserInputExample {
    public static void main(String[] args) {
        
        //     double width = 0;
        //     double height = 0;

        //    Scanner scanner = new Scanner(System.in);

        //     System.out.print("Enter the width of the rectangle: ");
        //      width = scanner.nextDouble();

        //      scanner.nextLine(); // Consume the newline character

        //     System.out.print("Enter the height of the rectangle: ");
        //      height = scanner.nextDouble();

        //     System.out.println("Calculating area...");
        //     System.out.println("The area of the rectangle is: " + (width * height));


        //     scanner.close(); 



        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine(); // Read user input

        System.out.print("Age: ");
        float age = scanner.nextFloat();  // Read user input for age
        String ageString = Float.toString(age); // Optional: convert int to String

        System.out.println("Hello " + name + ", you are " + ageString + " years old.");

        scanner.close();


        // String ➜ int	        Integer.parseInt(String)
        // String ➜ float	    Float.parseFloat(String)
        // String ➜ double	    Double.parseDouble(String)
        // float ➜ String	    Float.toString(float) or String.valueOf(float)
        // double ➜ String	    Double.toString(double) or String.valueOf(double)
        // Any primitive ➜ String	String.valueOf(value)



    }
}
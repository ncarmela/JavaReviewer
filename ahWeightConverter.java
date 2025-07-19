import java.util.Scanner;

public class ahWeightConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Weight conversion program
        int choice;
        double weight, convertedWeight;

        System.out.print("Welcome to the Weight Converter!\n");

        System.out.print("Choose a conversion option:\n" +
                        "1 = Kilograms to Pounds\n" +
                        "2 = Pounds to Kilograms\n" +
                        "3 = Grams to Ounces\n" +
                        "4 = Ounces to Grams\n");
        choice = scanner.nextInt();
        
        if(choice < 1 || choice > 4) {
            System.out.println("Invalid choice. Please select a valid conversion option.");
            scanner.close();
            return;
        }

        System.out.print("Enter the weight to convert: ");
        weight = scanner.nextDouble();



        if (weight <= 0 || Double.isNaN(weight)) {
            System.out.println("Weight cannot be negative. Please enter a valid weight.");
            scanner.close();
            return;
            
        }

        if(choice == 1){
            convertedWeight = weight * 2.20462; // Kilograms to Pounds
            System.out.printf("%.2f Kilograms is equal to %.2f Pounds\n", weight, convertedWeight);
        } else if(choice == 2){
            convertedWeight = weight / 2.20462; // Pounds to Kilograms
            System.out.printf("%.2f Pounds is equal to %.2f Kilograms\n", weight, convertedWeight);
        } else if(choice == 3){
            convertedWeight = weight * 0.035274; // Grams to Ounces
            System.out.printf("%.2f Grams is equal to %.2f Ounces\n", weight, convertedWeight);
        } else{
            convertedWeight = weight / 0.035274; // Ounces to Grams
            System.out.printf("%.2f Ounces is equal to %.2f Grams\n", weight, convertedWeight);
        } 

        scanner.close();
    }
}

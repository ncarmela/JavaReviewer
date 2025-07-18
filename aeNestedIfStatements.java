import java.time.LocalDate;
import java.util.Scanner;
public class aeNestedIfStatements {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        boolean isStudent = true;
        int age;
        double price = 9.99;
        String birthdateInput;
        LocalDate dateNow = LocalDate.now();

        System.out.println("When is your birthday? (YYYY-MM-DD): ");
        birthdateInput = scanner.next();
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        

        if(birthdate.getMonth() == dateNow.getMonth() && birthdate.getDayOfMonth() == dateNow.getDayOfMonth()){
            System.out.println("You are eligible for a free birthday ticket.");
            price *= 0; 
        } else{
            System.out.print("Are you a student? (true/false): ");
            isStudent = scanner.nextBoolean();

            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if(isStudent){
           
                if(age < 10){
                    System.out.println("You are eligible for a free ticket.");
                    price *= 0; 

                } else  {
                    System.out.println("You are eligible for a 50% discount.");
                    price *= 0.5; // 50% discount
                }
                
            } else {
                if(age >= 60){
                    System.out.println("You are eligible for a senior discount.");
                    price *= 0.3; 
                } else {
                    System.out.println("You are not eligible for any discounts.");
                }

            }

        }

        System.out.printf("Your ticket price is: %.2f", price);
    
        
        scanner.close();
    }
}

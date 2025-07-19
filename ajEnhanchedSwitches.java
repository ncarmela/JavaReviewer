import java.util.Scanner;

public class ajEnhanchedSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Enhanced switch = a replacement to many else if statements

        String day;
        System.out.println("Enter a day of the week:");
        day = scanner.nextLine();


        switch (day) {
            case "Monday":
                System.out.println("It's the start of the week!");
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("It's almost the weekend!");
                break;
            case "Friday":
                System.out.println("It's the end of the work week!");
                break;
            case "Saturday":
                System.out.println("It's the weekend!");
                break;
            case "Sunday":
                System.out.println("It's a day of rest!");    
                break;
        
            default:
                break;
        }


        scanner.close();

    }
}

import java.util.Scanner;

public class atBankingProgram {
    static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        
    
        // declare variables

        double balance = 0;
        boolean isRunning = true;
        int choice;

        // display menu
        while(isRunning){
            System.out.println();
            System.out.println();
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter number:");

            choice = scanner.nextInt();

            System.out.println();
            System.out.println("***************");
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Show Balance");

                    showBalance(balance);

                    break;
                case 2:
                    balance = deposit(balance);
                    System.out.printf("Current Balance: $%.2f", balance);

                    break;
                case 3:
                    System.out.println("Withdraw");
                    balance = withdraw(balance);
                    System.out.printf("Current Balance: $%.2f", balance);
                    break;
                case 4:
                    System.out.println("Exit");
                    isRunning = false;

                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }
        
    }

    static void showBalance(double balance){
        System.out.printf("Current balance: $%.2f", balance);
    }

    static double deposit(double balance){
        double amount;
        System.out.print("Enter an amount to deposit:");
        amount = scanner.nextDouble();

        if(amount>-1){
            return balance = amount + balance;
        } else{
            System.out.println("Invalid amount");
        }
        
        return balance = amount + balance;
        
        
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter an amount to withdraw:");
        amount = scanner.nextDouble();

        while(amount > balance){
            System.out.print("Not enough balance. Current balance is " + balance);
            System.out.print("Enter an amount to withdraw:");
            amount = scanner.nextDouble();
        }
        
        return balance = balance - amount;

        
        
    }
}

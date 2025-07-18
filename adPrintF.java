import java.util.Scanner;

public class adPrintF {
    
    public static void main(String[] args) {
        // printf = is a method that formats and prints data to the console
        // %[flags exampple + or - or , ( para maenclosed negative, space naman para nakatab mga positive and align ]
        //[width 0 padding exmaple 04d para 4 digits, pag no 0 padding ex 4d wala 0 pero may padding]
        //[.precision para maround off for price .3 .2 ganyan][specifier-character]


        // String name = "Alice"; //%s
        // char grade = 'A'; //%c
        // int age = 20; //%d
        // double gpa = 3.75; //%f
        // boolean isGraduated = true; //%b

        // System.out.printf("Hello %s,\n",name);
        // System.out.printf("Your grade is %c.\n", grade);
        // System.out.printf("GPA is %.2f, Gradutated: %b", gpa, isGraduated);


        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter number of years: ");
        years = scanner.nextInt();

        
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is: %,.2f\n", years, amount);

        scanner.close();


    }
}

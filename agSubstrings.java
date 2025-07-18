import java.util.Scanner;

public class agSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //.substring(startIndex, endIndex) - extracts a substring from the string
        // to remember '+1', parameters or arguments ang nasa loob ng ()


        String email;
        String username;
        String password;
        String domain = "@gmail.com";

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        username = email.substring(0, email.indexOf('@'));

        System.out.println("Username: " + username);

        if (email.contains(domain)) {
            System.out.println("Email: " + username.concat(domain));
        } else {
            System.out.println("Invalid email domain. Please use '@gmail.com'.");
        }

        if(password.equals(username)) {
            System.out.println("Password cannot be the same as the username.");
        } else {
            System.out.println("Password is valid.");
        }










        // String email = "nina.nambio@gmail.com";
        // String username = email.substring(0, email.indexOf('@')); // Extracts the part before '@'
        // String domain = email.substring(email.lastIndexOf(".") + 1, email.length()); // Extracts the part after '@'
        // String ConcatEmail = username.concat("@gmail").concat(domain);
        
        // System.out.println("Username: " + username);
        // System.out.println("Domain: " + domain);
        // System.out.println("Concatenated Email: " + ConcatEmail);
        

        // if (email.endsWith(".com")) {
        //     System.out.println("The email ends with .com");
        // } else {
        //     System.out.println("The email does not end with .com");
        // }
       
        scanner.close();
    }
}

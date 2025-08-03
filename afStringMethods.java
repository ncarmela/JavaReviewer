public class afStringMethods {
    public static void main(String[] args) {
        
        String name = "nina nambio";

        int length = name.length();
        char firstChar = name.charAt(0);
        String upperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();
        String trimmedName = name.trim(); // removes leading and trailing spaces
        int indexOfN = name.indexOf('n'); //panghanap fisrt index ng letter
        int lastIndexOfN = name.lastIndexOf('n'); //panghanap last index ng letter
        name = name.replace('n', 'N'); //palitan ang letter n sa N
        
        String[] splittedStrings = name.split(" ");

        System.out.println(splittedStrings[0]); // Output: nina kasi mahahati sa space
        System.out.println(splittedStrings[1]); // Output: nambio

        for (String str : splittedStrings) {
            System.out.println(str); // Output: nina \n nambio
        }

        //.concat() - concatenates two strings or pinagsasama
        // String ConcatEmail = username.concat("@gmail").concat(domain);


        if (name.isEmpty()) { // checks if the string is empty
            System.out.println("No name provided.");

        } else if (name.contains("Nia")) { // checks if the string contains "NiNa"
            System.out.println("The name contains 'nina'.");

        } else if (name.startsWith("NiNa")) { // checks if the string starts with "nina"
            System.out.println("The name starts with 'NiNa'.");

        } else if (name.equalsIgnoreCase("nina nambioo")) { // checks if the string is equal to "nina nambio" ignoring case
            System.out.println("The name is exactly 'nina nambio'.");

        } else {
            System.out.println("Invalid");
        }



       System.out.print("Length: " + length + "\n" +
                 "First character: " + firstChar + "\n" +
                 "Uppercase: " + upperCaseName + "\n" +
                 "Lowercase: " + lowerCaseName + "\n" +
                 "Trimmed: " + trimmedName + "\n" +
                 "First index of 'n': " + indexOfN + "\n" +
                 "Last index of 'n': " + lastIndexOfN + "\n");


        String fruits = "apple,banana,orange";
        String[] list = fruits.split(","); // Splitting the string into an array 
        list[0] = "kiwi";  // pag magrereplace ng string array di pwede .replace 
        
        int i;

        for(i=0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        //'fruit' ay temporary variable, so kada run ay magiiba ang value ni fruit
        // ':' for each fruit in list
        // 'list' is The array (or collection) you're looping through 
        for (String fruit : list) {
            System.out.println(fruit);
        }


    }
}

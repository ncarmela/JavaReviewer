public class aqMethod {
    public static void main(String[] args) {
        
        // method = a block of reusable code that is executed whn called ()

        // anything u send a method is known as argument inside the ()

        HBD("nina", 20);

        if(ageChecker(19)){
            System.out.println("You are old enough");
        } else{
            System.out.println("Sleep more");
        }
        
        System.out.println(ageString(19));

    }
    // methods are unfamiliar with other variable outside
    // para maging familiar kelangan ipasok

    // as we can see *HBD(name);*    *static void HBD(String name){*
    static void HBD(String name, int age){
        System.out.printf("HBD %s, you are %d years old", name, age );
        System.out.println();

    }

    static boolean ageChecker(int age){
        if(age >= 18){
            return true;
        } else{
            return false;
        }
        // a return keyword will return the value once the method ends
    }

    static String ageString(int age) {
        if (age < 18) {
            return "18 above";
        } else if (age < 60) {
            return "You are old enough";
        } else {
            return "Too baby";
        }
    }


    



}




    


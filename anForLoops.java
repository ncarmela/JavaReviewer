public class anForLoops {
    public static void main(String[] args) throws InterruptedException {
        
        // for loop = execute some code a CERTAIN amount of time
        // for(initialization; condition; update)

        //WHILE LOOP WHEN TO USE? 
        // You don’t know how many times the user will enter the wrong password.
        // It keeps asking until the correct password is entered.
        // It stops only when the condition is met.

        //FOR LOOP WHEN TO USE
        // You want to limit the number of tries.
        // Loop exactly 3 times, no more, no less.
        // Cleaner and safer when looping a fixed number of times.
        

        for(int i = 0; i < 10; i++){
            System.out.println(i);
            Thread.sleep(500);
        }
    }
}

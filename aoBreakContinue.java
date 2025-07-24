public class aoBreakContinue {
    public static void main(String[] args) {
        
        // break = break out of a loop (stop)
        // continue = skip current iteration of a loop (skip)

        for(int i = 0; i < 10; i++){
            if (i == 5){
                System.out.print(23);
                continue; //pag nag 5 iiskip niya
            }
            System.out.print(i + " ");
        }

    }
}

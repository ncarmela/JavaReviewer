public class ayVarargs {
    // varargs = allow a method to accept a varying # of arguments
    //           makes methods more flexible, no need for overloeaded methods
    //           java will pack the arguments into an array
    //           ... (ellipsis) is used to indicate varargs       
    
    public static void main(String[] args) {
        
        System.out.println(add(1, 2, 3));
        System.out.println(avg());

    }
    
    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double avg(double... avgScore){
        double sum = 0;

        if(avgScore.length == 0) {
            return 0;
        }   

        for (double score : avgScore) {
            sum += score;
        }
        return sum / avgScore.length;
    }
}

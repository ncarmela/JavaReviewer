import java.util.Arrays;

public class avArray {
    public static void main(String[] args) {
        String fruit[] = {"Apple", "Mango", "Orange", "Lychee", "Banana", "Grapes"};

        // System.out.println(Arrays.toString(fruit));
        // System.out.println(fruit[1]);

        // for( String fruits: fruit){
        //     System.out.println(fruits);
        // }

        fruit[2] = "Kiwi";
        Arrays.sort(fruit);
        Arrays.fill(fruit, "snoopy");

        for(int i = 0; i < fruit.length; i++){
            // if (0 == i%2){
            //     System.out.print(fruit[i]);
            //     continue; 
            // }

            System.out.print(fruit[i]);

            if (i + 1 < fruit.length) {
                System.out.print(", ");
                
            }
        }

        String list = "Apple,Mango,Orange,Lychee,Banana,Grapes";
        String[] fruitie = list.split(",");

        System.out.println(Arrays.toString(fruitie));

    }
}

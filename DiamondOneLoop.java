public class DiamondOneLoop {
    public static void main(String[] args) {
        int totalLines = 5;
        int mid = totalLines / 2;

        for (int i = 0; i < totalLines; i++) {
            int spaces = Math.abs(mid - i);
            int characters = totalLines - 2 * spaces;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < characters; k++) {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}

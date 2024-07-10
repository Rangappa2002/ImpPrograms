public class pattern11 {
    

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pyramid

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces to form the pyramid
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                if (i == 0 || k == 0 || k == 2 * (rows - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}

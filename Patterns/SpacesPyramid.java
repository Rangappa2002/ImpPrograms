public class SpacesPyramid {
        public static void main(String[] args) {
            int n = 9; 
    
            int rows = (n + 1) / 2;
    
            for (int i = 1; i <= rows; i++) {
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }
    
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1 || i == rows) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
    
                System.out.println();
            }
        }
    }
    
    
    



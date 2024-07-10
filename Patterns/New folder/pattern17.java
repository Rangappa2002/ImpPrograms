package loopingStatements.nestedPrograms;

public class pattern17 {
    public static void main(String[] args) {
        int m =4;
        int spaces = m-1;

        for(int i=1; i<=m; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            spaces--;
            for(int j=1; j<= 2*i-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

package loopingStatements.nestedPrograms;

public class pattern14 {
    public static void main(String[] args) {
        int m = 5;

        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2* (m-i);
            for(int i=1; i<=spaces; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
        
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
}

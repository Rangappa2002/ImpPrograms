package loopingStatements.nestedPrograms;

public class pattern18 {
    public static void main(String[] args) {
        int m=5;
        int n=5;

        for(int i=1; i<=m; i++){
            for(int j=1; j<=m; j++){
                if(j==1 || i==m ){
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
    
}

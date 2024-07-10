package loopingStatements.nestedPrograms;

public class pattern6 {
    public static void main(String[] args) {
        int m=4;

        for(int i=m; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}

package loopingStatements.nestedPrograms;

public class pattern7 {
    public static void main(String[] args) {
        int m=4;
        int num=1;

        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
    
}

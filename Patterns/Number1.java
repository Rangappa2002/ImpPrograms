public class Number1 {

    public static void main(String[] args) {
        char [][] pattern ={
            {'1','1','1','1','1',' '},
            {'1',' ',' ','1',' ','1'},
            {'1',' ','1',' ','1','1'},
            {'1','1',' ',' ','1','1'},
            {'1','1','1','1','1','1'}
        };
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();

    }
}
}
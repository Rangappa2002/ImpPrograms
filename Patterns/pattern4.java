public class pattern4 {
    public static void main(String[] args) {
        char[][] pattern = {
            {'*', '*', ' '},
            {'*', ' ',  '*'},
            {'*', '*', '*'},
            {'*',' ', '*'},
            {'*', ' ', '*'},
            {'*',' ', '*'}
        };
        
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class PrintBuzzNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range");
        int range = sc.nextInt();

        System.out.println("Buzz numbers up to " + range+ ":");
        for(int i=1; i<=range; i++){
            if(i%7==0 || i%10==7){
                System.out.println(i+"");
            }
        }
    }
}

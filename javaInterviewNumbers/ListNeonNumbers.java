import java.util.Scanner;
public class ListNeonNumbers {


    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean neonNumber(int num) {
        int square = num * num;
        int sum = sumOfDigits(square);
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range: ");
        int range = sc.nextInt();

        System.out.println("Neon Numbers upto "+range);

        for(int i=0; i<= range; i++){
            if(neonNumber(i)){
                System.out.println(i+"");
            }
        }

        
    }
    
}

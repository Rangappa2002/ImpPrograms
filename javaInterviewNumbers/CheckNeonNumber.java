import java.util.Scanner;

public class CheckNeonNumber {

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

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(neonNumber(num)){
            System.out.println(num+" is Neon Number");
        }else{
            System.out.println(num+" is not Neon Number");
        }
    }
    
}

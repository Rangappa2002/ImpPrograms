import java.util.Scanner;

public class PrintSpyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a range");
        int range = sc.nextInt();
        System.out.println("Spy numbers up to " + range+ ":");
        for (int i = 1; i <= range; i++) {
            if (isSpyNumber(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int currentNumber = number;

        while (currentNumber > 0) {
            int digit = currentNumber % 10;
            sum += digit;
            product *= digit;
            currentNumber /= 10;
        }

        return sum == product;
    }
}

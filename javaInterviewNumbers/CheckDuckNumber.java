import java.util.Scanner;

public class CheckDuckNumber {

    public static boolean isDuckNumber(String num) {

        if (num.charAt(0) == '0') {
            return false;
        }

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Duck Number: ");
        String num = sc.nextLine();

        
        if (isDuckNumber(num)) {
            System.out.println(num + " is a Duck Number.");
        } else {
            System.out.println(num + " is not a Duck Number.");
        }

        sc.close();
    }
}

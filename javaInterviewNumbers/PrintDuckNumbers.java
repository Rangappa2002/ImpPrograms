import java.util.Scanner;

public class PrintDuckNumbers {

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

        System.out.print("Enter a check Duck Number upto: ");
        int range = sc.nextInt();

        System.out.println("Duck numbers up to " + range + " are:");

        for(int i=1; i<=range; i++){
            if (isDuckNumber(String.valueOf(i))) {
            System.out.println(i+" ");
        }
    }
}
}

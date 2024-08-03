import java.util.Scanner;

public class CheckArmStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int numDigits = 0;
        int temp = num;
        int r , sum = 0;

        int temp2 = num;
        while (temp2 != 0) {
            temp2 /= 10;
            numDigits++;
            
        }

        while (num>0) {
        r = num % 10;
        num = num / 10;
        sum += Math.pow(r, numDigits);
    }
    if (temp == sum) {
        System.out.println(temp+"  is a ArmStrong Number..");
        
    }else{
        System.out.println(temp+"  is not a ArmStrong Number..");
    }
}
    
}

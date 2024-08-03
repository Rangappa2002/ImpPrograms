import java.util.Scanner;;
public class PrintArmStrongNumber {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number upto: ");
    int range = sc.nextInt();

    System.out.println("Arm Strong Numbers upto " + range);

    for(int num =1; num<= range; num++){
        int numDigits = 0;
        int temp = num;
        int sum = 0;

        int temp2 = num;
        while (temp2 != 0) {
            temp2 /= 10;
            numDigits++;
            
        }
        int temp3 = num;
        while (temp3 > 0) {
            int r = temp3%10;
            temp3 /= 10;
            sum += Math.pow(r, numDigits);
            
        }
        if(sum == temp){
            System.out.println(temp+ " ");
        }
    }
}
}

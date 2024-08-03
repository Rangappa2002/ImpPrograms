import java.util.Scanner;

public class CheckTechNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int temp , left , right , sum = 0, numDigits = 0;

        temp = n;
        while (temp>0) {
        temp = temp/10;
        numDigits++;            
        }

        if(numDigits%2==0){
            left = n/100;
            right = n%100;
            sum = left+right;
            if(sum*sum==n){
                System.out.println(n+" It is a Tech Number");
            }else{
                System.out.println(n+" It is a Not a Tech Number");
            }
        }
    }
    
}

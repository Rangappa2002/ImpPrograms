import java.util.Scanner;

public class CheckSpyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int temp = num, on = num;
        int rem=0, sum=0, mul=1;

        while (num>0) {
            rem = num%10;
            num = num/10;
            sum += rem;    
        }
        System.out.println("Sum = "+sum);
        while (temp>0) {
            rem = temp%10;
            temp = temp/10;
            mul *= rem;           
        }
        System.out.println("Mul = "+mul);
        if(sum == mul){
            System.out.println(on+" It is a Spy Number");
        }else{
            System.out.println(on+" It is Not a Spy Number");
        }
    }
    
}

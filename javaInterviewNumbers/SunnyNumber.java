import java.util.Scanner;

public class SunnyNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        double  nextNumber = n +1;
        double sqrt = Math.sqrt(nextNumber);
        double floor = Math.floor(sqrt);

        if(sqrt - floor == 0){
            System.out.println(n+" is a Suuny Number");
        }
        else{
            System.out.println(n+" is not a Sunny Number");
        }
    }
}
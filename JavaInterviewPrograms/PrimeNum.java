import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        boolean isPrime = isPrime(n);
        if(isPrime){
            System.out.println(n+ "isPrime Number");
        }else{
            System.out.println(n+ " is Not a Prime Number");
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i<= n/2; i++){
            if(n % i ==0){
                return false;
            
            }
        }
        return true;
    }
}

import java.util.Scanner;

public class ListPrimeNum {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2; i<= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Prime Numbers upto 100: ");
        for(int i=2; i<= 100; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    
}

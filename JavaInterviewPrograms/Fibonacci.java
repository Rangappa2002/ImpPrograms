import java.util.Scanner;

public class Fibonacci {

    public static void fib(int n){
        int a=3;
        int  b=4;
        System.out.println("Fib Series Upto" +n+ "terms");
        for(int i = 1; i<=n; i++ ){
            System.out.println(a+ " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number upto terms: ");
        int n = sc.nextInt();
        fib(n);
    }
    
}

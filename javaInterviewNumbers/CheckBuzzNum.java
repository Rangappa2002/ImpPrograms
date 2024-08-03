import java.util.Scanner;

public class CheckBuzzNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        if((num%7==0 || num%10==7)){
            System.out.println(num+" It is a Buzz Number");
        }else{
            System.out.println(num+" It is not a Buzz Number");
        }
        
        }
    }
    


import java.util.Scanner;

public class CheckPetersonNumber {

    

        public static boolean isPeterson(int num){

            int temp = num;
            int sum = 0;
            while (num > 0) {

                int r = num%10;
                sum = sum + findFactorial(r);
                num = num/10;
                
            }
            return sum == temp;

        }
        public static int findFactorial(int r){
            int fact = 1;
            for(int i=1; i<=r; i++){
                fact = fact * i;
            }
        return fact;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num  = sc.nextInt();

        if(isPeterson(num)){
            System.out.println(num+ " is Peterson Number..");
        }
        else{
            System.out.println(num+ " is Not a Peterson Number..");
        }
    
}
}
import java.util.Scanner;

public class PrintTechNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number Upto:");
        int range = sc.nextInt();

        System.out.println("Tech Number upto "+range);

        for(int num =1; num<= range; num++){
    
            int temp , left , right , sum = 0, numDigits = 0;

            temp= num;
            while (temp>0) {
                temp=temp/10;
                numDigits++;
                
            }
            if(numDigits%2==0){
                left=num%100;
                right=num/100;
                sum = left + right;

                if(sum*sum==num){
                    System.out.println(num+"");
            }


        }
    }
    
}
}

import java.util.Scanner;

public class ListSunnyNumber {

    static boolean Perfectsqrt(int num){
        double sqrt = Math.sqrt(num);
        return (sqrt - Math.floor(sqrt)) == 0;
    }

    static boolean SunnyNumber(int num){

        return Perfectsqrt(num + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range upto:");
        int range = sc.nextInt();

        System.out.println("Sunny upto "+range);
        for(int i =1; i<=range; i++){
            if(SunnyNumber(i)){
                System.out.println(i+"");
            }
        }
    }
}



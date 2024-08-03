import java.util.Scanner;

public class PrimeNumb {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int flag=0;
		if(num==0||num==1) {
			System.out.println("Number is prime");
		}
		else {
		for(int i=2;i<=(num/2);i++) {	
			if(num%i==0) {
				System.out.println("number is not prime");
 				flag=1;
	          break;
		
		}
			else {
				System.out.println("Number is prime");
			}
		}
	
		if(flag==0){
			System.out.println("Number is prime");
		}
	}
}
    
}

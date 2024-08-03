import java.util.Scanner;

public class PallindromeNum {
    public static void main(String[] args) {
	   int rev=0,rem=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	System.out.println("Original number"+num);
	int temp=num;
	while(num>0) {
	 rem=num%10;
	 rev=rev*10+rem;
	 num=num/10; 
	}
	System.out.println("Reversed number"+rev);
	 if(rev==temp) {
		 System.out.println("Number is pallindrome");
	 }
	 else {
		 System.out.println("number is not pallindrome");
	 }
    }
    
}

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=sc.next();
		char ch;
		String rev="";
		String temp=name;
		int flag=0;
		System.out.println("Original String:"+name);
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			rev=ch+rev;
		}
		System.out.println("Reverse:"+rev);
		//for pallindrome
		for(int i=0;i<rev.length();i++) {
		if(temp.charAt(i)==rev.charAt(i)) {
			flag=0; 
		}
		else {
			flag=1;
			break;
		}
		}
		if(flag==1) {
			System.out.println("String is not pallindrome");
		}
		else {
			System.out.println("String is  pallindrome");
		}
	}
    
}

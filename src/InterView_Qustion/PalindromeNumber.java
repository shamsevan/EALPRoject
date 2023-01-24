package InterView_Qustion;

import java.util.Scanner;

public class PalindromeNumber {
 
/*
 * Palindrome number is a number jetake reverse korleo same hoy, as ,151,161,262,16461  etc.
 * First condition amaderke ulta korte hobe .mane reverse 	
 */
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number below");
		
		int num=sc.nextInt();
		
		int org_num=num;
		
		int rev=0; 
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		if (org_num==rev) {
			System.out.println("it is a palindrome number");
		}
		
		else {
			System.out.println("it is not a palindrome number");
		}


	}

}

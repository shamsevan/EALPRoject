package InterView_Qustion;

public class ArmStrongNumbe {

	public static void isArmstrongNumber(int num) {
		
		System.out.println("WE are checking num="+num);
		int cube=0;
		int r;
		int t; 
	
		t=num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		
		if (t==cube) {
			System.out.println("it is a armstrong number");
		}
		
		else {
			System.out.println("It is not a Armstrong Number");
		}				
	}
		
	
	public static void main(String args[]) {
		isArmstrongNumber(153);
		isArmstrongNumber(0);
	}
	
}

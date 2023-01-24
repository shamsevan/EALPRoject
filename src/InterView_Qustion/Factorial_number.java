package InterView_Qustion;

public class Factorial_number {

//non recursive 	
	public static int factorialnonrecursive(int num) {
		int fact=1;
		if (num==0) return 1;
		for(int i=1;i<=num;i++) {
		    fact=fact*i;	
		}
		return fact;
	}
	
	
//recursive 
	public static int fact(int num) {
		if(num==0) return 1;
		else {
			return(num*fact(num-1));
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(factorialnonrecursive(4));
		
		System.out.println(fact(1));

	}

}

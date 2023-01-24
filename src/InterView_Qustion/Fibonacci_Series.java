package InterView_Qustion;

//0 1 1 2 3 5 8 13 21 34 

public class Fibonacci_Series {

	public static void main(String[] args) {
		int n1= 0;
		int n2= 1;
		
		int sum=0;
		
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<10;i++) {
			
			sum = n1+n2;
			System.out.print(" "+sum);
			n1=n2; //n2 er value n1 ke dichhi 
			n2=sum;//sum er value n2 ke dichhi
		}

	}

}

package OOPC1;

public class Car {

	public static void main(String[] args) {

		
		
		Car ob = new Car(10);
		
		nstmethod();

		
	}
	
	
   public int NSmethod() {
	System.out.println("This is non Static method ");   
	
	return  50;
   }
   
   public static void nstmethod() {
	   System.out.println("this is static method");
   }
   
   public Car(int x){
	   System.out.println("This is Car Constructor");
   }
   

}

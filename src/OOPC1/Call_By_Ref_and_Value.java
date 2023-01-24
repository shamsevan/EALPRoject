package OOPC1;

public class Call_By_Ref_and_Value {

	public static void main(String[] args) {
	
		
		int x = 10;
		String y= "name";
		Call_By_Ref_and_Value ob = new Call_By_Ref_and_Value();
		
		System.out.println(10); //print by value
		System.out.println(x );  //print by variable 
		
		int b= 8000;  //store by value
		b=x;    //store by variable 
		
//		ob.addition(5000);//call by value
//		ob.addition(b);//call by reference variable 
		ob.addition(ob); //call by object reference variable
	
	}

	public static void addition(Call_By_Ref_and_Value salary) {
		System.out.println(salary);
		salary.sum();
	}
	
	public void sum() {
		System.out.println("Sum method ");
	}

}

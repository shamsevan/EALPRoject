package QA_Team1;

public class Global_Variables {
	public int y; 
	
	
	public static void main(String[] args) {
	
		Global_Variables ob = new Global_Variables();
		
		ob.y=10;
		

	}
	
	public void method1(int y) {
		int x = 5;
		this.y=10; 
		
	}
	
	public void method2() {
		
	y= 20; 
	}

}

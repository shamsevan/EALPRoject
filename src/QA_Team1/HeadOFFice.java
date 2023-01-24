package QA_Team1;

public class HeadOFFice {	
	
     private int Halal_income; 
	
	public static void main ( String[] args) {
	
	}
	
	
	//this keyword is applicable for non Static method only ; 
	public void setHalal_Income(int Halal_income ) {
		
		this.Halal_income=Halal_income;		//stored by variable 
	}
	
	
	public int getHalal_Income() {
		return Halal_income;
	}
	
	
	public void All_income() {
		int bonus = 50000; 
		int Haram_Income= 20000; 
		int Total = ( bonus+Haram_Income+Halal_income);
		System.out.println(Total);
	}

}
package OOPC1;

public class MEthods_Concept {
	public static void main(String[] args) {		
		ProfitOfCOmpany();
		MonthlyProfitOFCompany(10000,3000, "February");//february			
		//calling Return type method 
		int returnedsalary=RTmethod(50, 100);
		System.out.println(returnedsalary);
	}
		
	//method without Arguments
    public static void ProfitOfCOmpany() {
    	int income = 5000;
    	int expense =2000; 
    	int profit = income -expense;
    	System.out.println(profit);
    }//method ends here    
    //method with arguments
    public static void MonthlyProfitOFCompany(int income ,int expense,String month_Name) {    	
    	int profit=income-expense; 	
    	System.out.println("THe PRofit of month "+ month_Name + " = " + profit );   	
    }
    //return type method : 
    public static int RTmethod(int x,int y ) {		
		int Salary= x+y;		
		return Salary;
		
	}
    
	
	
	

}

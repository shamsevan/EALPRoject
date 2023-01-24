package Inheritance;

import QA_Team1.Shireen;

public class shireen extends headOffice {
	
	
	
	public static void main(String[] args) {
		headOffice ob = new shireen();
	}
	

	@Override
	public void monthly_salary() {
		int salary= 1000; 
		
		
	}

	@Override
	public void workhour() {
		
		int worktime= 8 ;
	}
	public shireen() {
		System.out.println("shireen class constructor ");
	}
	

	


	
	
}

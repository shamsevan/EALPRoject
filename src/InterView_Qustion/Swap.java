package InterView_Qustion;

 //non static variables value swap in Nonstatic Methods .

public class Swap {
	int p;
	int q ; 
	
	public static void main (String[] args) {		
		Swap ob = new Swap(); 
		
		ob.p=50;
		ob.q=100;

		ob.swap(ob);// calling by object referece variable
		
	}	
	public static void swap(Swap k) {
				
		int temp; 
		temp= k.p;//temp =50
		k.p=k.q; //p =100
		k.q=temp;//q=50
		
		System.out.println(k.p);
		System.out.println(k.q);
	}
	
	
	

}

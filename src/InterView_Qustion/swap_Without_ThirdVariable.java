package InterView_Qustion;

public class swap_Without_ThirdVariable {
	
	int p;
	int q ; 
    int x = 10; 
	public static void main(String[] args) {
		
		swap_Without_ThirdVariable ob = new swap_Without_ThirdVariable();	
	
		ob.p=50;
		ob.q=100;
		
		ob.p =ob.p+ob.q;
		ob.q=ob.p-ob.q;
		ob.p=ob.p-ob.q;
		
		System.out.println(ob.p);
		
		System.out.println(ob.q);
	
		int y = ob.nonstatic();
		System.out.println(y);
       
	}
	
	public static void method() {
		swap_Without_ThirdVariable ob = new swap_Without_ThirdVariable();	
		ob.nonstatic();
		

}   
	public void nonstatic2() {
		nonstatic();
	}
	
	public int nonstatic() {
		System.out.println("abc");
		return 10;
	}}
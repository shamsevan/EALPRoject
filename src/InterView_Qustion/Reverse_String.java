package InterView_Qustion;

public class Reverse_String {

	public static void main(String[] args) {
		String s = "Evan"; 
		int length = s.length();
		
		System.out.println(s.charAt(length-1));
		
		String reverse = "";
		
		for(int a = length-1; a>=0;a--) {
			reverse=reverse+s.charAt(a);
		}
		
		System.out.println(reverse);
		
		

	}

}

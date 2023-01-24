package CoreSessionPractice;

public class TwoDimArray {

	public static void main(String[] args) {
		
		Object  Login[][]= {{"abc@gmail.com",123456},{"abc2@gmail.com",234567}};
		
	    for(Object[] arr2:Login) {
	    	for(Object x :arr2) {
	    		System.out.println(x);
	    	}
	    }

	}

}

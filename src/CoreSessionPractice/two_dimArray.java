package CoreSessionPractice;

public class two_dimArray {

	public static void main(String[] args) {
		int TwoDimArray[][]= new int[3][4];
		
		TwoDimArray[1][3]= 50; 
		
		System.out.println(TwoDimArray[2][1]);
		
	   for (int x = 0; x <TwoDimArray.length; x++) {
		   for(int y = 0; y<TwoDimArray[0].length;y++) {
			   
			   System.out.println(TwoDimArray[x][y]);
			   //y++
		   }
		 //x++
	   }
	}

}

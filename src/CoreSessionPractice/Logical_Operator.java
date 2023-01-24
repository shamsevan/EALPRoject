package CoreSessionPractice;

public class Logical_Operator {

	public static void main(String[] args) {
		int math = 90;
		int Science = 50;
		int physics = 90;
		int Biology = 40;
		int average= (math+Science+physics+Biology)/4;		
		System.out.println("The average of the Student ="+ average);		
		if(average>=90 && average<=100 ) {
			System.out.println("Student got grade A ");
		}
		else if (average>=80 && average<=89 ) {
			System.out.println("Student got Grade B");
		}		
		else if (average>70 && average<79 ) {
			System.out.println("Student got Grade C");
		}		
		else if (average>60 && average<69) {
			System.out.println("Student got grade D");
		}		
		else {
			System.out.println("Student if Failed ");
		}
		
		//if 5 
		//if - else = 5
		//if -elseif - else = 5
		
		

	}

}

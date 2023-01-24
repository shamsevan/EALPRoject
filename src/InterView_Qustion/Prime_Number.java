package InterView_Qustion;

public class Prime_Number {
	
/*	1. Natural number hote hobe mane palindrome hote hobe. 1 er chaite boro hote hobe . 
 *  2. Prime number mane hochhe emon number gulo jeguloke shudhu 2 ta number diye bhag jay(2 ta factor thake) ,as ,19 .etake only 1 and 19 diye e bhag jay.
 *  3. Mane number er 2 ta factor thakbe only . not more than that. 2 ta number diye bhag korlei remainder 0 hote hobe. 
 *  4. emon joto number ache, jeguloke shudhu she nije and 1 diye e bhag jay , shegulo kei prime number bole.
	  */
	
	
     public static void main(String[] args) {
    	 
    	 int num=3; //suppose amra 3 prime number kina check korbo .
    	 
    	 int count=0; //count dhore nite hobe . 
    	 if (num>1) {//1 er chaite boro hle palindrome number hobe .
    		 
    		  //ebar second condition .ami onek number diye bhag korbo , but only jodi 2 tar remeinder 0 hoy tahole sheta Prime.
    		 for(int i=1;i<=num;i++) {   //mane ekhane ami 3 ke , 1,2,3 diye bhag dichhi.
    			 
    			 if(num%i==0) count++; //ekhane ami bollam, 3 ke i diye bhag korar por jodi 0 hoy, tahole count er shathe 1 jod koro,count e bolbe kotobar bhag jachhe;
    			                       //amader expectations,count 2 hoite hobe .
 
    		 }
    		 
    		 if(count==2) {
    			 System.out.println("it is a prime number ");
    		 }
    		 else {
    			 System.out.println("It is not a Prime Number");
    		 }
    		 
    		 
    	 }
    	 
    	 else {//1 er chaite choto hole palindrom number e hobe na .
    		 System.out.println("it is not a palindrome Number ");
    	 }
    	 
     }
}

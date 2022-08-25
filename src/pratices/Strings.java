package pratices;

public class Strings {

	public static void main(String[] args) {
		//Immutable object
		
	/*	String s="Sachin";  
		 s.concat(" Tendulkar"); //concat() method appends the string at the end  
		  System.out.println(s); //strings are immutable objects 
		  
		  String s1="Sachin";  
		   s1=s1.concat(" Tendulkar");  
		   System.out.println(s1);  
		  */
		
		//String compare
		
		//String s1="Raghava";  
		//String s2="Raghava";
		//String s3= new String("raghava");
		   
			//1st Method	  
		  /*System.out.println(s1.equals(s2));//True  
		   System.out.println(s1.equalsIgnoreCase(s3));//true  
		   System.out.println(s2.equals(s3)); //False
		   */

		   // 2nd Method
		 /*  System.out.println(s1==s2); //true
		   System.out.println(s2==s3);//false bcoz it is created in non-pool
		   */
		//3rd Method
		
		 /*  System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s3.compareTo(s1));//1(because s1>s3)  
		   System.out.println(s1.compareTo(s3));//-1(because s3 < s1)
		  */
		
		
		
		// String Concentation
	/*	
		// 1st method using '+'
		 String s="Goteti"+" Raghava";  
		System.out.println(s);
		System.out.println();
		
		//2nd method using concat()
		String s1 ="Krishna ";  
		String s2 ="Mohan";  
		String s3 =s1.concat(s2);  
		System.out.println(s3);
		
		*/
		
		// using StringBuilder
		
		/* StringBuilder s1 = new StringBuilder("Hello");      
	     StringBuilder s2 = new StringBuilder("World");      
	     StringBuilder s = s1.append(s2);   //String s to store the result  
	     System.out.println(s.toString()); 
	*/
		// using format
		
		String s1= new String("Hello");
		String s2= new String(" World");
		String s= String.format("%s %s",s1,s2);
		System.out.println(s.toString());
				
		
	     
	}
	

}

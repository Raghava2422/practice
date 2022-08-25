package pratices;

 /*public class Constructor {
	int a; //create class attribute
	
	public Constructor() { //create constructor
		a = 5;
		}

	public static void main(String[] args) {
		Constructor con =new Constructor();// it is call the constructor
		System.out.println(con.a);*/



public class Constructor  {
	  String fName;
	  String lName;
	  

	  public Constructor(String name, String Name) {
	    fName = name;
	    lName = Name;
	  }
	  
	  
	  public Constructor() {
		  
	  }
	   public  void max(int a) {
		   for(int i = 0;i<=a;i++) {
			   System.out.println(i +" Executed ");
			   System.out.println(fName+" "+lName);
		   }
	   }

	  public static void main(String[] args) {
		 Constructor fullName = new Constructor("Raghava", "Goteti");
	    System.out.println(fullName.fName + " " +fullName.lName);
	}

}

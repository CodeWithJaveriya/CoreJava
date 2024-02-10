class HPLaptop {
	
	// static variables 
   // both intialization and declaration = you will get the given values
    static String brandName = " HP ";
	static int price = 42499;
	 static String hardDiskSize = "512GB";
    static String colour = "Silver";
	 static String opertatingSystem = "Windows 11";
	static String ramMemorySize = "8GB";
     static String screenSize =	"39.6Centimetres";
  
  // intialization of static varaiables  = after declaration you will get the values and what if we dont declare 
    static String brandName;
	static int price ;
	static String hardDiskSize ;
    static String colour ;
	static String opertatingSystem ;
	static String ramMemorySize ;
    static String screenSize ;
  public static void main(String sound[]){
	  // declartion of static varaiables 
	 brandName = " HP ";
	 price = 42499;
	  hardDiskSize = "512GB";
	  colour = "Silver";
	  opertatingSystem = "Windows 11";
	  ramMemorySize = "8GB";
	  screenSize =	"39.6Centimetres";
	  // declaration in local varaiables 
	      String brandName;
	      int price ;
	      String hardDiskSize ;
          String colour ;
		  String opertatingSystem ;
		  String ramMemorySize ;
	      String screenSize ;
		  
		  
		  
       // // intialization of local varaiables 
	      brandName = " HP ";
	      price = 42499;
	      hardDiskSize = "512GB";
	      colour = "Silver";
	      opertatingSystem = "Windows 11";
	      ramMemorySize = "8GB";
	      screenSize =	"39.6Centimetres";
		  
	  System.out.println("Main Started");
	  System.out.println("The Brand barand name : " + brandName);
	  System.out.println("Price : " + price);
	  System.out.println("hard Disk Size : " + hardDiskSize);
	  System.out.println("The colour : " + colour);
	  System.out.println("The RAM memory Size: " + ramMemorySize);
	  System.out.println("The screenSize: " + screenSize);
	  System.out.println("The opertating System: " + opertatingSystem);


  
  }

}
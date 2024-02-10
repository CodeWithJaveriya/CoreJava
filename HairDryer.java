class HairDryer{
  // both intialization and declaration
            static String brandName = "Philips";   
            static int price = 2012; 
            static String colour = "purple";
			static String wattages =  "1600watts";
			static String powerSource = "Corded electric" ;
			static String material = "plastic" ;

    // declaration of static varaiables 
	 
	        static String brandName;   
            static int price; 
            static String colour ;
			static String wattages ;
			static String powerSource  ;
			static String material; // gives default values as error

public static void main(String hairdryer[]) {
      // intialization of static varaiables
	          brandName = "Philips"; 
			  price = 2012;
			  colour = "purple";
			  wattages =  "1600watts";
			  powerSource = "Corded electric" ;
			  material = "plastic" ;
			  
	 // declaration of local varaiables 		  
           String brandName;   
            int price; 
           String colour ;
			 String wattages ;
			 String powerSource  ;
			 String material; // gives 6 errors 
			 
			 //  intialization of local varaiables
	          brandName = "Philips"; 
			  price = 2012;
			  colour = "purple";
			  wattages =  "1600watts";
			  powerSource = "Corded electric" ;
			  material = "plastic" ;
			  
			  
System.out.println("Main started");
System.out.println("The brand name " +  brandName);
System.out.println("The price " +  price);
System.out.println("The wattages " +  wattages);
System.out.println("The power source " + powerSource);
System.out.println("The material " + material);


}

}
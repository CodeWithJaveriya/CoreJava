class HairStraightener{
     // both intialization and declaration
            static String brandName = "Vega";   
            static String colour = "Black";
			static int  price =  999;
			static String maxTemperatureSetting	 = "200 Degrees Celsius" ;
			static String itemWeight =	"234Grams";
			static  String powerSource = "Corded electric";
	        static  String material = "Ceramicm";

			  // declaration of static varaiables 
			   static String brandName ;   
            static String colour;
			static int  price ;
			static String maxTemperatureSetting;
			static String itemWeight ;
			static  String powerSource ;
	        static  String material;  // gives default values as error
			
public static void main(String hairstraightener[]) {

    // intialization of static varaiables
	brandName = "Vega";
    price =  999;	
    maxTemperatureSetting	 = "200 Degrees Celsius" ;
	itemWeight =	"234Grams";
	powerSource = "Corded electric";
	material = "Ceramicm";
	
	// declaration of local varaiables 
	   String colour;
	   int  price ;
	   String maxTemperatureSetting;
	   String itemWeight ;
	    String powerSource ;
	    String material;  // gives 6 errors 
		
			// intialization of local varaiables
	        brandName = "Vega";
           price =  999;	
          maxTemperatureSetting	 = "200 Degrees Celsius" ;
	      itemWeight =	"234Grams";
	      powerSource = "Corded electric";
	      material = "Ceramicm";
	 
System.out.println("Main started");
System.out.println("The brand Name " + brandName);
System.out.println("The price " + price);
System.out.println("The colour " + colour);
System.out.println("The max temperature setting " + maxTemperatureSetting);
System.out.println("The item weight" + itemWeight);
System.out.println("The material " + material);


}

}
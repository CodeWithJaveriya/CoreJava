class PowerBank{
// both intialization and declaration
            static String brandName = "Belkin";   
            static String colour = "White";
			static int  price =  3899;
			static String batteryCapacity = "2500";
			static String compatiblePhoneModels = "Iphone";
			static  String connectorType ="Wireless";
	        
			
			//  declaration of static varaiable
		    static String brandName ;   
            static String colour ;
			static int  price;
			static String batteryCapacity ;
			static String compatiblePhoneModels;
			static  String connectorType ;
			
      public static void main(String powerbank[]) {
                        // intialization of static varaiables 
						brandName = "Belkin";
						colour = "White";
						price =  3899;
						batteryCapacity = "2500";
						compatiblePhoneModels = "Iphone";
						connectorType ="Wireless";
						
		//  declaration of local varaiable
		     String brandName ;   
             String colour ;
			 int  price;
			 String batteryCapacity ;
			 String compatiblePhoneModels;
		     String connectorType ;
		
          		// intialization of local varaiables 
						brandName = "Belkin";
						colour = "White";
						price =  3899;
						batteryCapacity = "2500";
						compatiblePhoneModels = "Iphone";
						connectorType ="Wireless";

               System.out.println("Main started");
               System.out.println("The brand Name " + brandName);
               System.out.println("The price " + price);
               System.out.println("The colour " + colour);
               System.out.println("The battery capacity " + batteryCapacity);
               System.out.println("The compatible phone models " + compatiblePhoneModels);
               System.out.println("The product connectorType " + connectorType);


}

}
class Shampoo{
             // declaration of static varaiables
            static String appliedFor;   // Creating the data 
			static String hairType;
			static int packOf;
			static String containerType;
			static String idealFor;  // gives default values
			
			
        public static void main(String reapir[]){
		// can also be declared like this mainly used in industry for different clients 
         // intialization of static varaiables		
		   appliedFor = "Damage Repair";  
		   hairType = "All Hair Types";
		   packOf = 1;
		   containerType = "Bottle";
		   idealFor = "Men and women";
		   
		   // declaration of local varaiables 
		     String appliedFor;   
             String hairType;
		     int packOf;
			 String containerType;
			 String idealFor; // gives 5 errors
			 
			 // intialization of local varaiables
		   appliedFor = "Damage Repair";  
		   hairType = "All Hair Types";
		   packOf = 1;
		   containerType = "Bottle";
		   idealFor = "Men and women";
			
			// using varibles in the later stages of the program 
			System.out.println("Main Strated");
			System.out.println("This shampoo is applied for " + appliedFor);
			System.out.println("This hair type is " + hairType);
			System.out.println("This shampoo is a pack of " + packOf);
			System.out.println("This shampoo container is " + containerType);
			System.out.println("This shampoo is idea for " + idealFor);
			
         }


}
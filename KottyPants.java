class KottyPants{

       static String shade  = "Dark shade, no fade black jeans";
	   static String brandFit =  "jean";
	   static int pockets = 5;
	   static String length = "Regular";
	   static String look  = "Clean look";
	   static char value;
	   
	   

      public static void main(String pants[]){
		// static 
	    shade;
		brandFit;
		pockets;
		
	  
	  System.out.println("The shade of pants are " + shade);
	  System.out.println("The brand fit is " + brandFit);
	   System.out.println("Valueee of char" + value); // if value is not given then it will take as a space 
	  System.out.println(" The no of pockets in the pant " + pockets);
	  System.out.println(" The length of the pant " + length);
	  System.out.println("The complete look is " + look);
	  
	  //Edit we can edit the before the operation is read. Modification if data 
	  shade = "Brown shade ";
	    shade = " "; //Data gets deleted
	  brandFit = "leggings";
	  pockets = 15;
	  length = "XXL";
	  look = "Brand look";
	  
	  System.out.println("The shade of pants are " + shade);
	  System.out.println("The brand fit is " + brandFit);
	  System.out.println(" The no of pockets in the pant " + pockets);
	  System.out.println(" The length of the pant " + length);
	  System.out.println("The complete look is " + look);
	  
	  
	  }


}

class Garden{

   static String flowerNames[] = {null, null, null, null, null};
   static int index;
   
   public static boolean produceFlower(String flower){
	  boolean isProduced = false;
	  if(flower != null){
		  flowerNames[index] = flower;
		  index++;
	  }else{
		  System.out.println("Cannot produce flowers at null values");
	  }
	  return isProduced;
   }

   public static void fetchAllFlowers(){
	   System.out.println("Invocking fetchAllFlowers()");
	   for(int flower = 0; flower < flowerNames.length; flower++){
		   String refrence = flowerNames[flower];
		   System.out.println("Produced flowers in garden are" + flower + " having index value " + refrence);
		   }
	   
	   System.out.println("End of fetchAllFlowers()");
   }



}
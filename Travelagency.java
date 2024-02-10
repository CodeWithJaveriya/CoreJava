class TravelAgency{
static String touristPlaces[]= {null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addTourist(String tourist){
boolean isAdded = false;
if(tourist!= null){
		touristPlaces[index] = tourist;
		index++;
		isAdded = true;
		}else{
		System.out.println("Cannot add the data at null value");
		}
		return isAdded;
		}
		
		//method
	   public static void getAllTouristPlaces(){
	   System.out.println("Invoking getAllTouristPlaces");
	   for (int tourist= 0; tourist< touristPlaces.length;tourist++){
	   String reference = touristPlaces[tourist];  
	   System.out.println("type of places " + reference +" at index value " + tourist);
	   }
	   System.out.println("End of getAllTouristPlaces");
	   
	   }
public static boolean updateTouristPlaces(String exisitingTouristPlaces, String updateTouristPlaces){
		   boolean isUpdated = false;
		   for(int touristIndex = 0; touristIndex< touristPlaces.length ;touristIndex++){
			   if(touristPlaces[touristIndex].equals(exisitingTouristPlaces)){
				   touristPlaces[touristIndex]= updateTouristPlaces;
				   isUpdated = true; 
}
}
return isUpdated;
}
}
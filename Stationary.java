class Stationary{

  static String stationaryItems[] = {null, null, null, null, null, null, null, null};
  static int index;
  
   public static boolean addStationaryItem(String itemName){
	   System.out.println("Invocking addStationaryItem");
	   boolean isAdded = false;
	   //validate data
	   if(itemName != null){
		  if(index < stationaryItems.length){
		  stationaryItems[index] = itemName;
		  index++;
		  isAdded = true;
		  }else{
		     System.out.println("Size is full!!!!!!!");
		  }
	   }else{
		   System.out.println("Cannot add item at null value");
	   }
	   return isAdded;
   }
   }

   
   public static void getAllStationaryItems(){
	   System.out.println("Invoking getAllStationaryItems");
	   for(String itemName : itemNames){
		   System.out.println(itemName);
	   }
   }
   }
   
   public static boolean editStationaryItemName(String existingItemName, String updatedItemName){
	   boolean isUpdated = false;
	for(int itemIndex = 0; itemIndex < stationaryItems.length; itemIndex++){
		if(stationaryItems[itemIndex].equals(existingItemName)){
			stationaryItems[itemIndex] = updatedItemName;
			isUpdated = true;
		}
	}
	return isUpdated;
   }

   public static int deleteStationaryItem(String deletedItemName){
	   
	   boolean isDeleted = false;
	   int itemIndex;
	   int noOfElements = stationaryItems.length;
	   for(int itemIndex = 0; itemIndex < stationaryItems.length(); itemIndex++){
		   if(stationaryItems[itemIndex].equals(deletedItemName)){
			   break;
		   }
	   }
	   
	   if(itemIndex < noOfElements){
	   noOfElements = noOfElements - 1;
	   for(int newItemIndex = itemIndex; newItemIndex < noOfElements; newItemIndex++){
		   stationaryItems[newItemIndex] = stationaryItems[newItemIndex + 1];
	   }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
   }
   
   public static void getAllStationaryItemsPostDeletion(int newLength){
	   for(int itemIndex = 0; itemIndex < newLength; itemIndex++ ){
		   System.out.println(newLength);
	   }
   }
  
}
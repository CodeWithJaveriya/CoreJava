//CRUD Create Read Update Delete
class FashionDresses{
	
	static String dressNames[] = {null, null, null, null, null, null, null, null};
	static int index;
	
	//Create - add
	public static boolean addDress(String dressName){
		boolean isAdded = false;
     if(dressName != null){
		 if(index < dressNames.length){  // incase if users adds other value
		 dressNames[index]   = dressName;
		 index++;
		 isAdded = true;
	     }else{
			 System.out.println("Size is full!! Dress cannot be added");
		 }
	 }else{
		 System.out.println("Cannot add a dress name at a null value");
	 }	
	 return isAdded;
	}
	
	
	//Read - get 
	public static void getAllDressNames(){
		System.out.println("Invocking getAllDressNames");
		for(String dressName : dressNames ){
			System.out.println("The dress names are:" + dressName); 
		}
		System.out.println("End of getAllDressNames");
	}
	
	//update 
	public static boolean updateDressName(String existingDressName, String updatedDressName){
		boolean isUpdated = false;
		for(int indexDressName = 0 ; indexDressName < dressNames.length ; indexDressName++){
			if(dressNames[indexDressName].equals(existingDressName)){
			dressNames[indexDressName]   = updatedDressName;
			isUpdated = true;	
			}
		}
		return isUpdated;
	}

	//delete - you should delete the element even from the array - the array size should be now less than one
	public static int deleteDressName(String deletedDressName){
		boolean isDeleted = false;
		int noOfElements = dressNames.length;
		int indexDressName;
		for(indexDressName = 0 ; indexDressName < dressNames.length ;indexDressName++ ){
			if(dressNames[indexDressName].equals(deletedDressName)){
				break;
			}
		}
		//now it should continue to give the dresses which are left out
		if(indexDressName < noOfElements){
			noOfElements = noOfElements - 1;
			for(int newIndexDressName = indexDressName; newIndexDressName < noOfElements ; newIndexDressName++){
				dressNames[newIndexDressName] = dressNames[newIndexDressName +1]; 
			}
		}
		System.out.println(noOfElements);
		return noOfElements;		
	}
	
	public static void getAllDressNamesPostDeletion(int newLength){
		for(int indexDressName = 0; indexDressName < newLength; indexDressName++ ){
			System.out.println(dressNames[indexDressName]);
		}
	}

	
	// to serach particular dress
	public static String searchDressByName(String dressName){
		System.out.println("Invocking searchDressByName");
		System.out.println("No of parameters are: 1 , type String");
		String dName = null;
		for(String name : dressNames){
			if(name.equals(dressName)){
				dName = name;
				System.out.println("Dress Name Found hehehehehheh!!!!!!!!!!");
			}
		}
		return dName;
	}

}
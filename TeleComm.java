class TeleComm{
	
	static String simCardNames[] = {null, null, null, null, null, null, null, null};
	static int index;
	
	//add sim
	public static boolean addSimCard(String simCardName){
		boolean isAdded = false;
		if(simCardNames != null){
			if(index < simCardNames.length){
		    simCardNames[index] = simCardName;
			index++;
			isAdded = true;
			}else{
				System.out.println("Size is full!!!!Cannot ass sim card now");
			}
		}else{
			System.out.println("Cannot add simcard at null value");
		}
		return isAdded;
	}
	
	//get - fetch sim cards
	public static void getAllSimCards(){
		System.out.println("Invocking getAllSimCards()");
		for(String simCardName : simCardNames){
			System.out.println(simCardName);
		}
		System.out.println("End of getAllSimCards()");
	}
	
	//update 
	public static boolean updateSimCard(String exicistingSimCardName, String updatedSimCardName){
		boolean isUpdated = false;
	     for(int simCardName = 0; simCardName < simCardNames.length; simCardName++){
			 if(simCardNames[simCardName].equals(exicistingSimCardName)){
				 simCardNames[simCardName] = updatedSimCardName;
			 }
		 }
		 return isUpdated;
	}
	
	//delete
	public static boolean deleteSimCard(String deletedSimCardName){
		boolean isDeleted = false;
		int noOfElements = simCardNames.length;
		int simCardName;
		for(simCardName = 0; simCardName < simCardNames.length; simCardName++){
			if(simCardNames[simCardName].equals(deletedSimCardName)){
				break;
			}
		}
		if(simCardName < noOfElements){
			noOfElements = noOfElements - 1;
			for(int newSimCardName = simCardName; newSimCardName < noOfElements; newSimCardName++){
				simCardNames[newSimCardName] = simCardNames[newSimCardName] + 1;
			}
		}
		System.out.println(noOfElements);
		return noOfElements;
	}
	
	
	public static void getAllSimCardsPostDeletion(int newLength){
		for(int simCardName = 0; simCardName < newLength; simCardName++){
			System.out.println(simCardNames[simCardName]);
		}
	}
}
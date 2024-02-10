class Karnataka{
	
	static String cityNames[] = {null, null, null, null, null, null, null, null};
	static int index;
	
	//add- create 
	public static boolean addCityName(String cityName){
		boolean isAdded = false;
		if(cityName != null){
			if(index < cityNames.length){
			cityNames[index] = cityName;
			index++;
			}else{
				System.out.println("Size is full!! Cannot be added");
			}
		}else{
			System.out.println("Cannot add city name at the null value");
		}
		return isAdded;
	}
	
	
	//get - fetch
	public static void getAllCityNames(){
	    System.out.println("Invocking getAllCityNames()");
		for(String cityName : cityNames){
			System.out.println("The city names are:" + cityName);
		}
		System.out.println("End of getAllCityNames");
	}
	
	//update
	public static boolean updateCityName(String existingCityName, String updatedCityName){
		boolean isUpdated = false;
		for(int cityName = 0; cityName < cityNames.length ; cityName++){
			if(cityNames[cityName].equals(existingCityName)){
				 cityNames[cityName] = updatedCityName;
			}
		}
		return isUpdated;
	}
	
	//delete
	public static int deleteCityName(String deletedCityName){
		boolean isDeleted = false;
		int noOfElements = cityNames.length;
		int indexCityName;
		for(int indexCityName = 0; indexCityName < cityNames.length; indexCityName++){
			if(cityNames[indexCityName].equals(deletedCityName)){
				break;
			}
		}
		if(indexCityName < noOfElements){
			noOfElements = noOfElements - 1;
			for(int newIndexCityName = 0; newIndexCityName < noOfElements; newIndexCityName++){
				cityNames[newIndexCityName] = cityNames[newIndexCityName] + 1;
			}
		}
		System.out.println(noOfElements);
		return noOfElements;
	}
	
	public static void getAllCityNamesPostDeletion(int newLength){
		for(int indexCityName = 0; indexCityName < newLength ; indexCityName++){
			System.out.println(cityNames[indexCityName]);
		}
	}
	
}
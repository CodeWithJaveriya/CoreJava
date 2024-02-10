class KarnatakaTester{
	
	public static void main(String test[]){
		Karnataka.addCityName("Hubli");
		Karnataka.addCityName("Banglore");
		Karnataka.addCityName("Chitradurga");
		Karnataka.addCityName("Hebbal");
		Karnataka.addCityName("Chikkamanglur");
		Karnataka.addCityName("Kolar");
		Karnataka.addCityName("Chikkabalpaur");
		Karnataka.addCityName("Rajajinagar");
		// Karnataka.addCityName("Kotak");   Size is full
		
		Karnataka.getAllCityNames();
		
		boolean isUpdated = Karnataka.updateCityName("Banglore", "Bengaluru");
		System.out.println("Are city names updated" + isUpdated);
		
		Karnataka.getAllCityNames();
		
		int newLength = Karnataka.deleteCityName("Hebbal");
		System.out.println("City names post deletion");
		Karnataka.getAllCityNamesPostDeletion(newLength);
	}
	
}
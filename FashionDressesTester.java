class FashionDressesTester{

    public static void main(String test[]){
	
	FashionDresses.addDress("Gown");
	FashionDresses.addDress("Sari");
	FashionDresses.addDress("Chudidar");
	FashionDresses.addDress("Jhubba");
	FashionDresses.addDress("Leggings");
	FashionDresses.addDress("Jeggings");
	FashionDresses.addDress("Hijabs");
	//FashionDresses.addDress(null);  -- we will not get this value
	FashionDresses.addDress("Jackets");
	// FashionDresses.addDress("Half Pants");  //-- it says the size is full
	
	FashionDresses.getAllDressNames();
	
	String dressName  = FashionDresses.searchDressByName("Hijabs");
	System.out.println("IS dress found : " +dressName);
	
	
	boolean isUpdated = FashionDresses.updateDressName("Hijabs" , "Jilibabs");
	System.out.println("Are the dresses updated" + isUpdated);
	
	FashionDresses.getAllDressNames();
	
	int newLength = FashionDresses.deleteDressName("Leggings");
	
	System.out.println("All the dresses after deletion are:");
	FashionDresses.getAllDressNamesPostDeletion(newLength);
	
	}




}
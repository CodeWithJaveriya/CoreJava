class ChaiPoint{
 // normal array method 
  static String chaiAvaliable[] = {"Masla Tea", "Lemon Tea", "Ginger Tea","Elachi Tea","Irani Tea", "Adrak Tea", "Gralic Tea", "Green Tea", "Pudina Tea", "Lasan Tea", "Haldi Tea", "Ayurvedic Tea"};
  // if we create a reference then it can go like
  static String tea = "Masla Tea";
  static String tea1 = "Lemon Tea";
  static String tea2 = "Ginger Tea";
  static String tea3 = "Elachi Tea";
  static String tea4 = "Irani Tea";
  static String tea5 = "Adrak Tea";
  static String tea6 = "Garlic Tea";
  static String tea7 = "Green Tea";
  static String tea8 = "Pudina Tea";
  static String tea9 = "Lasan Tea";
  static String tea10 = "Haldi Tea";
  static String tea11 = "Ayurvedic Tea";
  
  static String chaiAvaliable[] ={tea, tea1, tea2, tea3, tea4, tea5, tea6, tea7, tea8, tea9, tea10, tea11};  
  public static void getAllChaiAvaliable(){
  System.out.println("Inocking getAllChaiAvaliable");
  // to fetch all the data for loop is used
  // for(String indivisualChai : chaiAvaliable){
  // System.out.println(indivisualChai);
  // }
  for(int chai=0 ; chai < chaiAvaliable.length ; chai++ ){
	  String reference = chaiAvaliable[chai]; // create a reference and then store a value 
	  System.out.println(reference);
  }
  System.out.println("End of getAllChaiAvaliable");
  }

}
// every index value will return refernce and reference gives values
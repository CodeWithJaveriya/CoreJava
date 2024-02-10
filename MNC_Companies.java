class MNC_Companies{

  static String companies[] = {"TCS", "Wipro", "Capgemni", "MindTree", "NTTData"};
  
  
  public static void getMNCCompanies(){
  System.out.println("Invocking getMNCCompanies");
  for(int company = 0 ; company < companies.length ; company++){
	  String reference = companies[company];
	  System.out.println(reference);
  }
  System.out.println("End of getMNCCompanies");
  
  }


}
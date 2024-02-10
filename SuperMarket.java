class  SuperMarket{

// if multiple things happen and there is one thing for it then it is reffered as static 
           // show 5 vegetables
          // static String vegetable1 = "Potato";
		  // static String vegetable2 = "Cabbage";
		  // static String vegetable3 = "Brinjal";
		  // static String vegetable4 = "Lady finger";
		  // static String vegetable5 = "Onion";
		  // instead of writing code in this it is important to optimize the code and write 
		  // to store it in one varaiable called as array varaiable
		  // for optimization of this code we use ARRAY
		  static String vegetables[] = {"Potato", "Cabbage", "Brinjal", "Lady Finger", "Onion"};
		  
		  // biscuits 
		  // static String buiscut1 = "Borbon";
		  // static String buiscut2 = "Marie Light";
		  // static String buiscut3 = "Sunfeast";
		  // static String buiscut4 = "Krack Jack";
		  // static String buiscut5 = "Happy Happy";
		  // static String buiscut6 = "Dark Fanatasy";
		  // static String buiscut7 = "Cream Pitchii";
		  // static String buiscut8 = "Cream Biscuit";
		  // static String buiscut9 = "Good day";
		  // static String buiscut10 = "Parle G";
		  // ARRAY
		  static String biscuits[] = {"Borbon", "Marie Light", "Sunfeast", "Krack Jack", "Happy Happy", "Dark Fanatasy", "Cream Pitchii", "Cream Biscuit", "Good day", "Parle G"};
		  
		  //perfumes 
		  // static String perfume1 = "Fogg";
		  // static String perfume2 = "Skinn";
		  // static String perfume3 = "Park Avenue";
		  // static String perfume4 = "Denver";
		  // static String perfume5 = "Bella Vita";
		  // static String perfume6 = "Calvin klien";
		  // static String perfume7 = "Gucci";
		  // static String perfume8 = "Davidoff";
		  // static String perfume9 = "Guess";
		  // static String perfume10 = "Versace";
		  //ARRAY
		  static String perfumes[] = {"Fogg", "Skinn", "Park Avenue", "Denver", "Bella Vita", "Calvin klien", "Gucci","Davidoff", "Guess", "Versace"};
		  
		  
		  //groceries
		  // static String grocery1 = "Shampoo";
		  // static String grocery2 = "Soap";
		  // static String grocery3 = "Towels";
		  // static String grocery4 = "Hand krchiefs";
		  // static String grocery5 = "Utensils";
		  // static String grocery6 = "Tissue paper";
		  // static String grocery7 = "Spoons";
		  // static String grocery8 = "Glasses";
		  // static String grocery9 = "Straws";
		  // static String grocery10 = "Tea Patta";
		  // ARRAY
		  static String groceries[] = {"Shampoo", "Soap", "Towels", "Hand krchiefs", "Utensils", "Tissue paper", "Spoons", "Glasses", "Straws", "Tea Patta"};
		  
		  //cosmetics
		  
		  static String cosmetics[] ={"Foundation", "Primer", "Powder", "Mascara", "Kajol", "Lipbalm", "Eyeliner", "Lipstick", "Eye shadow", "Body Lotion",
		  "Serum", "Mosturizer", "Foaming Facial Cleanser", "Concealer", "Makeup Remover", "Puff", "Lip liner", "Compact", "Nail Polish", "Toner", 
		  "Hydraulic facial Cleanser", "Sun Screen", "Oil Cleanser", "Lakme Eyeconic kajal", "Eye lashes"};
		  
		  
		  public static void main(String veggies[]){
		  
		  System.out.println("Main Started ");
		  getVegetables();
		  getBuiscuits();
		  getPerfumes();
		  getGroceries();
		  getCosmetics();
		  System.out.println("Main Ended ");
		  System.out.println("----------------------");
		  }
		  
		  
		  // System.out.println("Main Started ");
		  // System.out.println("List of vegetables: ");
		  // // System.out.println(vegetables[0] +"  "+ 
		  // // vegetables[1] +"  " +  vegetables[2] +"  "+ 
		  // // vegetables[3] +"  "+  vegetables[4] );
		  // // System.out.println("Rack 1 : " + vegetable1);
		  // // System.out.println("Rack 2 : " + vegetable2);
		  // // System.out.println("Rack 3 : " + vegetable3);
		  // // System.out.println("Rack 4 : " + vegetable4);
		  // // System.out.println("Rack 5 : " + vegetable5);
		  // getVegetables();
		  // System.out.println("Main Ended ");
		  // System.out.println("----------------------");
		  
		  
		  // System.out.println("Main Started ");
		  // System.out.println("List of biscuits: ");
		  // // System.out.println(biscuits[0]  +"  "+ biscuits[1]  +"  "+ biscuits[2]  +"  "+ biscuits[3]  +"  "+ biscuits[4]  +"  "+
		  // // biscuits[5]  +"  "+ biscuits[6]  +"  "+ biscuits[7]  +"  "+ biscuits[8]  +"  "+ biscuits[9]);
		  // // System.out.println("Box 1 : " + buiscut1);
		  // // System.out.println("Box 2 : " + buiscut2);
		  // // System.out.println("Box 3 : " + buiscut3);
		  // // System.out.println("Box 4 : " + buiscut4);
		  // // System.out.println("Box 5 : " + buiscut5);
		  // // System.out.println("Box 6 : " + buiscut6);
		  // // System.out.println("Box 7 : " + buiscut7);
		  // // System.out.println("Box 8 : " + buiscut8);
		  // // System.out.println("Box 9 : " + buiscut9);
		  // // System.out.println("Box 10 : " + buiscut10);
		  // getBuiscuits();
		  // System.out.println("Main Ended ");
		  // System.out.println("----------------------");
		  
		  
		  // System.out.println("Main Started ");
		  // System.out.println("List of perfumes: ");
		  // // System.out.println(perfumes[0]+"  "+  perfumes[1]+"   " +  perfumes[2]+"   " +  perfumes[3]+"   " +  perfumes[4]+"   " +
		   // // perfumes[5]+"   " +  perfumes[6]+"   " +  perfumes[7]+"   " +  perfumes[8]+"   " +  perfumes[9]); 
		  // // System.out.println("Bottle 1 : " + perfume1);
		  // // System.out.println("Bottle 2 : " + perfume2);
		  // // System.out.println("Bottle 3 : " + perfume3);
		  // // System.out.println("Bottle 4 : " + perfume4);
		  // // System.out.println("Bottle 5 : " + perfume5);
		  // // System.out.println("Bottle 6 : " + perfume6);
		  // // System.out.println("Bottle 7 : " + perfume7);
		  // // System.out.println("Bottle 8 : " + perfume8);
		  // // System.out.println("Bottle 9 : " + perfume9);
		  // // System.out.println("Bottle 10 : " + perfume10);
		  // getPerfumes();
		  // System.out.println("Main Ended ");
		  // System.out.println("----------------------");
		  
		  
		  // System.out.println("Main Started ");
		  // System.out.println("List of groceries: ");
		  // // System.out.println(groceries[0] +"  "+ groceries[1] +"  "+ groceries[2] +"  "+  groceries[3] +"  "+ groceries[4] +"  "+
		  // // groceries[5] +"  "+ groceries[6] +"  "+ groceries[7] +"  "+ groceries[8] +"  "+ groceries[9]);

		  // // System.out.println("Stack 1 : " + grocery1);
		  // // System.out.println("Stack 2 : " + grocery2);
		  // // System.out.println("Stack 3 : " + grocery3);
		  // // System.out.println("Stack 4 : " + grocery4);
		  // // System.out.println("Stack 5 : " + grocery5);
		  // // System.out.println("Stack 6 : " + grocery6);
		  // // System.out.println("Stack 7 : " + grocery7);
		  // // System.out.println("Stack 8 : " + grocery8);
		  // // System.out.println("Stack 9 : " + grocery9);
		  // // System.out.println("Stack 10 : " + grocery10);
		  // getGroceries();
		  // System.out.println("Main Ended ");
		  // System.out.println("----------------------");
		  
		  
		  // System.out.println("Main Started ");
		  // System.out.println("List of cosmetics : ");
		  // // System.out.println(cosmetics[0] +"  "+  cosmetics[1] +"  "+ cosmetics[2] +"  "+ cosmetics[3] +"  "+ cosmetics[4] +"  "+ cosmetics[5] +"  "+
		  // // cosmetics[6] +"  "+ cosmetics[7] +"  "+ cosmetics[8] +"  "+ cosmetics[9] +"  "+ cosmetics[10] +"  "+ cosmetics[11] +"  "+ cosmetics[12] +"  "+ 
		  // // cosmetics[13] +"  "+ cosmetics[14] +"  "+ cosmetics[15] +"  "+ cosmetics[16] +"  "+ cosmetics[17] +"  "+ cosmetics[18] +"  "+ cosmetics[19] +"  "+
		  // // cosmetics[20] +"  "+ cosmetics[21] +"  "+ cosmetics[22] +"  "+ cosmetics[23] +"  "+ cosmetics[24]);
		  // //invoking the method
		  // getCosmetics();
		  // System.out.println("Main Ended ");
		  // System.out.println(cosmetics.length);
		  // System.out.println("----------------------");
		  
		  // }
		   // method name - read - get , fetch, read
		  
		  public static void getVegetables(){
			  System.out.println("Inside get vegetables");
		
			  for(String vegetable : vegetables)  {
				  System.out.println(vegetable); 
				  
			  }
			  
		  }
		  
		  public static void getBuiscuits(){
			  System.out.println("Inside get biscuits");
			  
			  for(String biscuit : biscuits) {
				  System.out.println(biscuit);
				  
				
			  }
			  
		  }
		  
		  public static void getPerfumes(){
			  System.out.println("Inside get perfumes");
			  
			  for(String perfume : perfumes){
				  System.out.println(perfume);
				
				  
			  }
		   
		  }
		  
		  public static void getGroceries(){
			  System.out.println("Inside get groceries");

           for(String grocery : groceries){
			   System.out.println(grocery);
			   
		   }			  
			  
		  }
		  
		  public static void getCosmetics(){
			  System.out.println("Inside get cosmetics");
			  
			  for(String cosmetic : cosmetics){
				  System.out.println(cosmetic);
				
			  }
		  }



}
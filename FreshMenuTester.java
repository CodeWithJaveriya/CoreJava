class FreshMenuTester{

   public static void main(String test[]){
	   
   double priceOfTheDish = FreshMenu.search("Hitt");
   System.out.println("The price of the given dish is " + priceOfTheDish);
   double priceOfTheDish1 = FreshMenu.search("Fried Rice");
   System.out.println("The price of the given dish is " + priceOfTheDish1);
   double priceOfTheDish2 = FreshMenu.search("Maggie");
   System.out.println("The price of the given dish is " + priceOfTheDish2);
   double priceOfTheDish3 = FreshMenu.search("Cheese Maggie");
   System.out.println("The price of the given dish is " + priceOfTheDish3);
   double priceOfTheDish4 = FreshMenu.search("Masala Maggie");
   System.out.println("The price of the given dish is " + priceOfTheDish4);
   double priceOfTheDish5 = FreshMenu.search("Gobi Manchuri");
   System.out.println("The price of the given dish is " + priceOfTheDish5);
   double priceOfTheDish6 = FreshMenu.search("Poori");
   System.out.println("The price of the given dish is " + priceOfTheDish6);
   double priceOfTheDish7 = FreshMenu.search("Kabab Leg Piece");
   System.out.println("The price of the given dish is " + priceOfTheDish7);
   double priceOfTheDish8 = FreshMenu.search("Mutton Biryani");
   System.out.println("The price of the given dish is " + priceOfTheDish8);
   double priceOfTheDish9 = FreshMenu.search("Chicken Strips");
   System.out.println("The price of the given dish is " + priceOfTheDish9);
   double priceOfTheDish10 = FreshMenu.search("Peri Peri");
   System.out.println("The price of the given dish is " + priceOfTheDish10);
   double priceOfTheDish11 = FreshMenu.search("Fried Chicken");
   System.out.println("The price of the given dish is " + priceOfTheDish11);
   double priceOfTheDish12 = FreshMenu.search("Nipat Masala");
   System.out.println("The price of the given dish is " + priceOfTheDish12);
   double priceOfTheDish13 = FreshMenu.search("Badam Milk");
   System.out.println("The price of the given dish is " + priceOfTheDish13);
   double priceOfTheDish14 = FreshMenu.search("Hershey Choclate Milk");
   System.out.println("The price of the given dish is " + priceOfTheDish14);
   double priceOfTheDish15 = FreshMenu.search("Mutton Roll");
   System.out.println("The price of the given dish is " + priceOfTheDish15);
   double priceOfTheDish16 = FreshMenu.search("Classic Chicken Roll");
   System.out.println("The price of the given dish is " + priceOfTheDish16);
   double priceOfTheDish17 = FreshMenu.search("Pepsi");
   System.out.println("The price of the given dish is " + priceOfTheDish17);
   double priceOfTheDish18 = FreshMenu.search("Bread");
   System.out.println("The price of the given dish is " + priceOfTheDish18);
   double priceOfTheDish19 = FreshMenu.search("Bun");
   System.out.println("The price of the given dish is " + priceOfTheDish19);
   
   //method overloading 
   double priceWithGivenQunatity = FreshMenu.search("Hitt" , 3);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity);
   double priceWithGivenQunatity1 = FreshMenu.search("Fried Rice" , 4);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity1);
   double priceWithGivenQunatity2 = FreshMenu.search("Maggie" , 5);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity2);
   double priceWithGivenQunatity3 = FreshMenu.search("Cheese Maggie" , 6);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity3);
   double priceWithGivenQunatity4 = FreshMenu.search("Masala Maggie" , 5);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity4);
   double priceWithGivenQunatity5 = FreshMenu.search("Gobi Manchuri" , 3);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity5);
   double priceWithGivenQunatity6 = FreshMenu.search("Poori", 3);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity6);
   double priceWithGivenQunatity7 = FreshMenu.search("Kabab Leg Piece" , 4);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity7);
   double priceWithGivenQunatity8 = FreshMenu.search("Mutton Biryani" , 5);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity8);
   double priceWithGivenQunatity9 = FreshMenu.search("Chicken Strips" , 4);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity9);
   double priceWithGivenQunatity10 = FreshMenu.search("Peri Peri" , 3);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity10);
   double priceWithGivenQunatity11 = FreshMenu.search("Fried Chicken" , 2);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity11);
   double priceWithGivenQunatity12 = FreshMenu.search("Nipat Masala" ,2 );
   System.out.println("The price of the given dish is " + priceWithGivenQunatity12);
   double priceWithGivenQunatity13 = FreshMenu.search("Badam Milk" , 3);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity13);
   double priceWithGivenQunatity14 = FreshMenu.search("Hershey Choclate Milk" , 3);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity14);
   double priceWithGivenQunatity15 = FreshMenu.search("Mutton Roll" , 4);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity15);
   double priceWithGivenQunatity16 = FreshMenu.search("Classic Chicken Roll" , 3);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity16);
   double priceWithGivenQunatity17 = FreshMenu.search("Pepsi" , 4);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity17);
   double priceWithGivenQunatity18 = FreshMenu.search("Bread" , 3);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity18);
   double priceWithGivenQunatity19 = FreshMenu.search("Bun" , 2);
   System.out.println("The price of the given dish is " + priceWithGivenQunatity19);
   
   }



}
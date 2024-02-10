class SwiggyTester{

      public static void main(String test[]){
	  // Internal referencing                  argument 
	  double priceOfThefood = Swiggy.search("French Fries");
	  System.out.println("The price of food is " + priceOfThefood);
	  double priceOfThefood1 = Swiggy.search("Banana Milkshake");
	  System.out.println("The price of food is " + priceOfThefood1);
	  double priceOfThefood2 = Swiggy.search("Pineapple Juice");
	  System.out.println("The price of food is " + priceOfThefood2);
	  double priceOfThefood3 = Swiggy.search("Watermelon Juice");
	  System.out.println("The price of food is " + priceOfThefood3);
	  double priceOfThefood4 = Swiggy.search("Roti");
	  System.out.println("The price of food is " + priceOfThefood4);
	  double priceOfThefood5 = Swiggy.search("Coffe");
	  System.out.println("The price of food is " + priceOfThefood5);
	  double priceOfThefood6 = Swiggy.search("Tea");
	  System.out.println("The price of food is " + priceOfThefood6);
	  double priceOfThefood7  = Swiggy.search("Veg Salad");
	  System.out.println("The price of food is " + priceOfThefood7);
	  double priceOfThefood8 = Swiggy.search("Panner Palak Salad");
	  System.out.println("The price of food is " + priceOfThefood8);
	  double priceOfThefood9 = Swiggy.search("Omlet");
	  System.out.println("The price of food is " + priceOfThefood9);
	  double priceOfThefood10 = Swiggy.search("Chole bature");
	  System.out.println("The price of food is " + priceOfThefood10);
	  double priceOfThefood11 = Swiggy.search("Paratha ");
	  System.out.println("The price of food is " + priceOfThefood11);
	  double priceOfThefood12 = Swiggy.search("Butter Culka ");
	  System.out.println("The price of food is " + priceOfThefood12);
	  double priceOfThefood13 = Swiggy.search("Pav Bhaji");
	  System.out.println("The price of food is " + priceOfThefood13);
	  double priceOfThefood14 = Swiggy.search("Butter Roti");
	  System.out.println("The price of food is " + priceOfThefood14);
	  double priceOfThefood15 = Swiggy.search("Dahi Vada");
	  System.out.println("The price of food is " + priceOfThefood15);
	  double priceOfThefood16 = Swiggy.search("Masala Puri");
	  System.out.println("The price of food is " + priceOfThefood16);
	  double priceOfThefood17 = Swiggy.search("Pani Puri");
	  System.out.println("The price of food is " + priceOfThefood17);
	  double priceOfThefood18 = Swiggy.search("Bhel Puri");
	  System.out.println("The price of food is " + priceOfThefood18);
	  double priceOfThefood19 = Swiggy.search("Vada");
	  System.out.println("The price of food is " + priceOfThefood19);
	  
	  double priceWithGivenQunatity = Swiggy.search("French Fries" , 4);
	  System.out.println("The price of food is " + priceWithGivenQunatity);
	  double priceWithGivenQunatity1 = Swiggy.search("Banana Milkshake" , 2);
	  System.out.println("The price of food is " + priceWithGivenQunatity1);
	  double priceWithGivenQunatity2 = Swiggy.search("Pineapple Juice" , 3);
	  System.out.println("The price of food is " + priceWithGivenQunatity2);
	  double priceWithGivenQunatity3 = Swiggy.search("Watermelon Juice" , 3);
	  System.out.println("The price of food is " + priceWithGivenQunatity3);
	  double priceWithGivenQunatity4 = Swiggy.search("Roti" , 3);
	  System.out.println("The price of food is " + priceWithGivenQunatity4);
	  double priceWithGivenQunatity5 = Swiggy.search("Coffe" ,8);
	  System.out.println("The price of food is " + priceWithGivenQunatity5);
	  double priceWithGivenQunatity6 = Swiggy.search("Tea" ,9);
	  System.out.println("The price of food is " + priceWithGivenQunatity6);
	  double priceWithGivenQunatity7  = Swiggy.search("Veg Salad" , 2);
	  System.out.println("The price of food is " + priceWithGivenQunatity7);
	  double priceWithGivenQunatity8 = Swiggy.search("Panner Palak Salad" , 3);
	  System.out.println("The price of food is " + priceWithGivenQunatity8);
	  double priceWithGivenQunatity9 = Swiggy.search("Omlet" , 2);
	  System.out.println("The price of food is " + priceWithGivenQunatity9);
	  double priceWithGivenQunatity10 = Swiggy.search("Chole bature" , 4);
	  System.out.println("The price of food is " + priceWithGivenQunatity10);
	  double priceWithGivenQunatity11 = Swiggy.search("Paratha " , 3);
	  System.out.println("The price of food is " + priceWithGivenQunatity11);
	  double priceWithGivenQunatity12 = Swiggy.search("Butter Culka " , 2);
	  System.out.println("The price of food is " + priceWithGivenQunatity12);
	  double priceWithGivenQunatity13 = Swiggy.search("Pav Bhaji" , 9);
	  System.out.println("The price of food is " + priceWithGivenQunatity13);
	  double priceWithGivenQunatity14 = Swiggy.search("Butter Roti", 5);
	  System.out.println("The price of food is " + priceWithGivenQunatity14);
	  double priceWithGivenQunatity15 = Swiggy.search("Dahi Vada" , 2);
	  System.out.println("The price of food is " + priceWithGivenQunatity15);
	  double priceWithGivenQunatity16 = Swiggy.search("Masala Puri" , 8);
	  System.out.println("The price of food is " + priceWithGivenQunatity16);
	  double priceWithGivenQunatity17 = Swiggy.search("Pani Puri" , 7);
	  System.out.println("The price of food is " + priceWithGivenQunatity17);
	  double priceWithGivenQunatity18 = Swiggy.search("Bhel Puri" , 6);
	  System.out.println("The price of food is " + priceWithGivenQunatity18);
	  double priceWithGivenQunatity19 = Swiggy.search("Vada" , 7);
	  System.out.println("The price of food is " + priceWithGivenQunatity19);
	  }
      

}
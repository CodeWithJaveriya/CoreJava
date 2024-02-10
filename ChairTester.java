class ChairTester{


   public static void main(String sit[]){
	   // object 
	   Chair chair = new Chair();
	   chair.name = "Nirmala";
	   chair.price = 300.00;
	   chair.color = "Black";
	   chair.typeOfMaterial = "Plastic";
	   chair.toSit();
	   System.out.println("First chair!!!! Wohahhhhh!!!!");
	   System.out.println(chair.name + " "+ chair.price + " "+ chair.color + " "+ chair.typeOfMaterial);
	   
	   Chair chair1 = new Chair();
	   chair1.name = "Nirmala";
	   chair1.price = 900.00;
	   chair1.color = "Yellow";
	   chair1.typeOfMaterial = "Steel";
	   chair1.toSit();
	   System.out.println("Second chair!!!! Good!!!");
	   System.out.println(chair1.name + " "+ chair1.price + " "+ chair1.color + " "+ chair1.typeOfMaterial);
	   
	   Chair chair2 = new Chair();
	   chair2.name = "Govinda";
	   chair2.price = 700.00;
	   chair2.color = "Orange";
	   chair2.typeOfMaterial = "Fibre";
	   chair2.toSit();
	   System.out.println("Third chair!!!! OKIE!!");
	   System.out.println(chair2.name + " "+ chair2.price + " "+ chair2.color + " "+ chair2.typeOfMaterial);
   }
}
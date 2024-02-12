class LensKartTester{
     
	 public static void main(String test[]){
	 
	 
	 LensKart lenskart = new LensKart(67.00);
	 
	 // lenskart.typeOfLens = "Concave";
	 // lenskart.typeOfGlass = "Round";
	 // lenskart.price = 67.00;
	 // lenskart.materialOfGlass = "Fiber";
	 lenskart.forEyes();
	 System.out.println(lenskart.typeOfLens + " " + lenskart.typeOfGlass + " " + lenskart.price + " " + lenskart.materialOfGlass);
	 }
}
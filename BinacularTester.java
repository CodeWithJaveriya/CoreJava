class BinacularTester{

   public static void main(String test[]){
   
   
   Binacular binacular = new Binacular("Concave" , "Canon");
   // binacular.typeOfLens = "Cocave";
   // binacular.brandName = "Canon";
   // binacular.price = 15540.98;
   binacular.toSeeFarObjects();
   System.out.println(binacular.typeOfLens + " " + binacular.brandName + " " + binacular.price);
   
   }


}
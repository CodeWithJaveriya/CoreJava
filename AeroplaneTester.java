class AeroplaneTester{
  
   public static void main(String plain[]){
	   // to acess method as constructor
	   // Aeroplane.createInstance();
	   
	   Aeroplane aeroplane = new Aeroplane();
	   aeroplane.name = "Dubai";
	   aeroplane.noOfSeats = 345;
	   aeroplane.transportOverAir();
	   System.out.println(aeroplane.name + " "+ aeroplane.noOfSeats);
   }

}
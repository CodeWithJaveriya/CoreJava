class ParleFactory{
   
   static String name = "ParleG";
   int quantity;
   double price;
   int noOfBuiscuits;
   
   public ParleFactory(int quantity , double price , int noOfBuiscuits){
	   this.quantity = quantity;
	   this.price = price;
	   this.noOfBuiscuits = noOfBuiscuits;
   }
   
   public void toEat(){
	System.out.println("Eat ParleG Stay Happy!!!!");
}

}
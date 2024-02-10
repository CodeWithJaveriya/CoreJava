class FreshMenu{

  public static double search(String foodName){
  
  if("Hitt" == foodName){
  System.out.println("The searched food is" + foodName);
  return 67.90;
  }
  if("Fried Rice" == foodName){
  System.out.println("The searched food is" + foodName);
  return 50.00;
  }
  if("Maggie" == foodName){
  System.out.println("The searched food is" + foodName);
  return 45.00;
  }
  if("Cheese Maggi" == foodName){
  System.out.println("The searched food is" + foodName);
  return 100.90;
  }
  if("Masala Maggie" == foodName){
  System.out.println("The searched food is" + foodName);
  return 125.00;
  }
  if("Gobi Manchuri" == foodName){
  System.out.println("The searched food is" + foodName);
  return 100.00;
  }
  if("Poori" == foodName){
  System.out.println("The searched food is" + foodName);
  return 100.50;
  }
  if("Kabab Leg Piece" == foodName){
  System.out.println("The searched food is" + foodName);
  return 345.00;
  }
  if("Mutton Biryani" == foodName){
  System.out.println("The searched food is" + foodName);
  return 490.90;
  }
  if("Chicken Strips" == foodName){
  System.out.println("The searched food is" + foodName);
  return 245.90;
  }
  if("Peri Peri" == foodName){
  System.out.println("The searched food is" + foodName);
  return 140.80;
  }
  if("Fried Chicken" == foodName){
  System.out.println("The searched food is" + foodName);
  return 150.90;
  }
  if("Nipat Masala" == foodName){
  System.out.println("The searched food is" + foodName);
  return 30.50;
  }
  if("Badam Milk" == foodName){
  System.out.println("The searched food is" + foodName);
  return 77.90;
  }
  if("Hershey Choclate Milk" == foodName){
  System.out.println("The searched food is" + foodName);
  return 245.90;
  }
  if("Mutton Roll" == foodName){
  System.out.println("The searched food is" + foodName);
  return 323.90;
  }
  if("Classic Chicken Roll" == foodName){
  System.out.println("The searched food is" + foodName);
  return 180.90;
  }
  if("Pepsi" == foodName){
  System.out.println("The searched food is" + foodName);
  return 40.90;
  }
  if("Bread" == foodName){
  System.out.println("The searched food is" + foodName);
  return 49.90;
  }
  if("Bun" == foodName){
  System.out.println("The searched food is" + foodName);
  return 40.90;
  }
  return 0.0;
  }
  
    //method overloading 
  public static double search(String foodName , int quantity){
  
  if("Hitt" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 67.90 * quantity;
  }
  if("Fried Rice" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 50.00 * quantity;
  }
  if("Maggie" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 45.00 * quantity;
  }
  if("Cheese Maggi" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 100.90 * quantity;
  }
  if("Masala Maggie" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 125.00 * quantity;
  }
  if("Gobi Manchuri" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 100.00 * quantity;
  }
  if("Poori" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 100.50 * quantity;
  }
  if("Kabab Leg Piece" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 345.00 * quantity;
  }
  if("Mutton Biryani" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 490.90 * quantity;
  }
  if("Chicken Strips" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 245.90 * quantity;
  }
  if("Peri Peri" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 140.80 * quantity;
  }
  if("Fried Chicken" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 150.90 * quantity;
  }
  if("Nipat Masala" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 30.50 * quantity;
  }
  if("Badam Milk" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 77.90 * quantity;
  }
  if("Hershey Choclate Milk" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 245.90 * quantity;
  }
  if("Mutton Roll" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 323.90 * quantity;
  }
  if("Classic Chicken Roll" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 180.90 * quantity;
  }
  if("Pepsi" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 40.90 * quantity;
  }
  if("Bread" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 49.90 * quantity;
  }
  if("Bun" == foodName){
  System.out.println("The searched food is" + foodName +" and the qunatity is " + quantity);
  return 40.90 * quantity;
  }
  return 0.0;
  }
}
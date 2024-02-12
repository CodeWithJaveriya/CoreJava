class LensKart{

      String typeOfLens;
	  String typeOfGlass;
	  double price;
	  String materialOfGlass;
	  
	  public LensKart(){
	     System.out.println("Constructor LensKart is invocked");
	  }
	  
	  public LensKart(String typeOfLens, String typeOfGlass){
	  this.typeOfLens = typeOfLens;
	  this.typeOfGlass = typeOfGlass;
	  System.out.println("2 Parameterized constructor is invocked");
	  }
	  
	  public LensKart(String materialOfGlass){
		  this("Convex", "Oval");
		  this.materialOfGlass = materialOfGlass;
		  System.out.println("1 Parameterized constructor is invocked");

	  }
	  
	  public LensKart(double price){
		  this("Fiber");
		  this.price = price;
		  System.out.println("1 Parameterized constructor of price is invocked");
	  }
	  
	  public void forEyes(){
		  System.out.println("See Bright!! See Ahead!!!");
	  }

}

//constructor
//constructor overloading
//constructor chaning - this()


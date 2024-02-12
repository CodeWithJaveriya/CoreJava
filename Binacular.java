class Binacular{

    String typeOfLens;
	String brandName;
	double price;
	
    public Binacular(){
		System.out.println("Binacular constructor is invoked!!");
	}
	
	public Binacular(String typeOfLens, String brandName){
	    //this method 
		this(19999.45);
		this.typeOfLens = typeOfLens;
		this.brandName = brandName;
		
	}
	
	//constructor chaining 
	public Binacular(double price){
		this();
		// this("Convex" , "Canon");   //this method used from another constructor - calling to one constructor to another constructor   
		this.price = price;
	}
	
	public void toSeeFarObjects(){
		System.out.println("Happyyyy Seeing!!!");
	}

}
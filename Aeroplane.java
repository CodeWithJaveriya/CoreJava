class Aeroplane{

    String name;
	int noOfSeats;

    public Aeroplane(String name, int noOfSeats){
	this.name = name;
	this.noOfSeats = noOfSeats;
	
	}
	
	//objects can be created through our methods also
	// public static void createInstance(){
		
		// Aeroplane aeroplane = new Aeroplane("Dubai", 100);
		// System.out.println(aeroplane.name + " "+ aeroplane.noOfSeats);

	// }
	
	// tricks in Java Interview 
	
	//constructor recursion - when flow of the program has two same constructors then it gives error as stackOverFlowError
	//both object(tester) and in constructor has same object defined 
	public Aeroplane(){
		Aeroplane aeroplane = new Aeroplane();
		aeroplane.name = "Indigo";
		aeroplane.noOfSeats = 123;
	}
	
	public Aeroplane(){
		//recursive constructor invokation
		this();
	}
	
	
	//method recursion - we cannot call same method 
	public void transoportOverAir(){
		transoportOverAir();
	}


}
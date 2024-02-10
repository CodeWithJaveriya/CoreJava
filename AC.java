class AC{

     static String name = "Blue Star";
	 static int minTemparature;
	 static int currentTemparature;
	 static int maxTemparature = 28;
	 static boolean isConnected;
	
	 
      // method
    public static boolean onOrOff(){
	// logic 
	System.out.println("Invocking the onOrOff()");
	System.out.println("List of parameters" + 0);
	if(isConnected == false){
	   isConnected = true;
	   System.out.println("The AC is turned on!!!");
	}else if(isConnected == true){
	      isConnected = false;
		  System.out.println("The AC is turned off!!!");
	}
	return isConnected;
	}
		  
	public static  void increaseTemparature(){
		System.out.println("Invocking increaseTemparature()");
		System.out.println("List of parameters: " + 2);
		if(isConnected == true){
			if(currentTemparature < maxTemparature){
				currentTemparature = currentTemparature + 1;
				System.out.println("The currentTemparature is " + currentTemparature);	
			}else{
				System.out.println("Maximum value exceeded!!!");
			}
			}else{
			System.out.println("Please on the AC first");
		}
		System.out.println("End of increase temparature");
	}
	
	public static void decreaseTemparature(){
		System.out.println("Invocking decreaseTemparature()");
		System.out.println("List of parameters: " + 2);
		if(isConnected == true){
			if(currentTemparature > minTemparature){
				currentTemparature = currentTemparature - 1;
				System.out.println("The currentTemparature is " + currentTemparature);	
			}else{
				System.out.println("Minimum value exceeded!!!");
			}
			}else{
				System.out.println("Please on the AC first");
			}
		System.out.println("End of decrease temparature");
	}
}
	
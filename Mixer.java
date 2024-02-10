class Mixer{

      static String name = "Butterfly";
	  static int minSpeed;
	  static int currentSpeed;
	  static int maxSpeed = 5;
	  static boolean isConnected;
	  
	  //method
	  
	  public static boolean onOrOff(){
		  System.out.println("Inocking onOrOff()");
		  System.out.println("Parametere" + 0);
		  if(isConnected == false){
			  isConnected = true;
			  System.out.println("Mixer is turned on!!!!");
		  } else if(isConnected == true){
			  isConnected = false;
			  System.out.println("Mixer is turned off!!!!");
		  }
		  return isConnected;
	  }

	  // increase speed
	  // decrease speed 
	 
	  public static void  increaseSpeed(){
		System.out.println("Inocking increaseSpeed()");
	    System.out.println("List of Parameteres" + 2);
	  if(isConnected == true){		  
		  if(currentSpeed < maxSpeed){
			  currentSpeed = currentSpeed + 1;
			  System.out.println("The current Speed is " + currentSpeed);
			  }else{
				  System.out.println("Max speed Exceded!! ");
			  }
			}else{
				System.out.println("Please on the mixer first");
			}
			System.out.println("End of increase speed");
	  }
	  
	  public static void decreaseSpeed(){
		System.out.println("invoking decreaseSpeed()");
	    System.out.println("List of Parametere" + 2);
		  if(isConnected == true){
			  if(currentSpeed > minSpeed){
				  currentSpeed = currentSpeed - 1;
				  System.out.println("The current speed is " + currentSpeed);
				  }else{ 
				        System.out.println("Minimum speed Exceded!!!");
				  }	  
		  }else{
			  System.out.println("Please on the mixer first");
		  }
		  System.out.println("End of decrease speed");
	  }

}



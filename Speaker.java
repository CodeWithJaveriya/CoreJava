class Speaker{
      
	  static String name = "JB1";
	  static int minVolume;
	  static int currentVolume;
	  static int maxVolume = 10;
	  static boolean isConnected;
	  
	  //method
	  
	  public static boolean onOrOff(){
		  System.out.println("Inocking onOrOff()");
		  System.out.println("Parametere" + 0);
		  if(isConnected == false){
			  isConnected = true;
			  System.out.println("Speakers are oned!!!! Enjoy!!!!");
		  } else if(isConnected == true){
			  isConnected = false;
			  System.out.println("Speakers are off!!!!!!!");
		  }
		  return isConnected;
	  }

	  // increase volume
	  // decrease volume 
	 
	  public static void  increaseVolume(){
		System.out.println("Inocking increaseVolume()");
	    System.out.println("List of Parameteres" + 2);
	  if(isConnected == true){		  
		  if(currentVolume < maxVolume){
			  currentVolume = currentVolume + 1;
			  System.out.println("The current Volume is " + currentVolume);
			  }else{
				  System.out.println("Max Value Exceded!! ");
			  }
			}else{
				System.out.println("Please on the speaker first");
			}
			System.out.println("End of increase volume");
	  }
	  
	  public static void decreaseVolume(){
		System.out.println("invoking decreaseVolume()");
	    System.out.println("List of Parametere" + 2);
		  if(isConnected == true){
			  if(currentVolume > minVolume){
				  currentVolume = currentVolume - 1;
				  System.out.println("The current volume is " + currentVolume);
				  }else{ 
				        System.out.println("Minimum value Exceded!!!");
				  }	  
		  }else{
			  System.out.println("Please on the speaker first");
		  }
		  System.out.println("End of decrease volume");
	  }

}
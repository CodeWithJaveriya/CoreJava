class MixerTester{

   public static void main(String test[]){
   System.out.println("Main Started");
   boolean connected = Mixer.onOrOff();
   System.out.println("Is the Mixer on?" + connected);
   Mixer.increaseSpeed();
   Mixer.increaseSpeed();
   Mixer.increaseSpeed();
   Mixer.increaseSpeed();
   Mixer.increaseSpeed();
   boolean connected1 = Mixer.onOrOff();
   System.out.println("Is the Mixer on?" + connected1);   
   Mixer.increaseSpeed();
   Mixer.increaseSpeed(); 
   boolean connected2 = Mixer.onOrOff();
   System.out.println("Is the Mixer on?" + connected2);   
   Mixer.decreaseSpeed();  
   Mixer.decreaseSpeed();   
   }


}
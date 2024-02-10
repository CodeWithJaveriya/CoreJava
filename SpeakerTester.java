class SpeakerTester{
     
	 public static void main(String test[]){
	 
	 // inocking the method only for user
	 // invocking the logic 
	 System.out.println("Main Started");
	 // clasname. method names - code redabality
	 boolean connected = Speaker.onOrOff();
	 System.out.println("Is speaker connected " + connected);
	 // boolean connected1 = Speaker.onOrOff();
	 Speaker.increaseVolume();
	 Speaker.increaseVolume();
	 Speaker.increaseVolume();
	 Speaker.increaseVolume();
	 Speaker.increaseVolume();
	 boolean connected1 = Speaker.onOrOff();
	 System.out.println("Is speaker connected " + connected1);
	 Speaker.increaseVolume();
	 Speaker.increaseVolume();
	 Speaker.increaseVolume();
	 Speaker.decreaseVolume();
	 Speaker.decreaseVolume();
	 Speaker.decreaseVolume();
	 Speaker.decreaseVolume();
	 boolean connected2 = Speaker.onOrOff();
	 System.out.println("Is speaker connected " + connected2);
	 Speaker.decreaseVolume();
	 Speaker.decreaseVolume();
	 Speaker.decreaseVolume();
	 System.out.println("Main Ended");
	 }





}
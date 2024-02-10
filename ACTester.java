class ACTester{

   public static void main(String test[]){
   
    boolean connected = AC.onOrOff();
	System.out.println("Is the AC on?" + connected);
	AC.increaseTemparature();
	AC.increaseTemparature();
	AC.increaseTemparature();
	AC.increaseTemparature();
	AC.increaseTemparature();
	boolean connected1 = AC.onOrOff();
	System.out.println("Is the AC on?" + connected1);
    AC.decreaseTemparature();
	AC.decreaseTemparature();
	AC.decreaseTemparature();
	AC.decreaseTemparature();
	
   }




}
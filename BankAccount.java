class BankAccount{

   static double balance;

    public static boolean credit(int amount){
	    boolean isCredited = false; 
		if(amount > 0){
			balance = balance + amount;
			 isCredited = true;
		}
		return isCredited;
	}
	
	public static boolean debit(int amount){
       boolean isDebited = false;
	   if(amount <= balance){
		   balance = balance - amount;
		   isDebited = true;
	   }
	   return isDebited;
	   }
	   
	
	public static double getBalance(){
		System.out.println("The current balance is");
		return balance;
	}
}
JAVA FUNDAMENTALS    
// variable
// datatypes
// methods - Method overloading 
// arrays
// conditional
// looping stat - for 


// identifier
// literals
// keywords
// methods
// arrays
// looping stat
// conditional
// operators
// variables and datatypes
// class and object
// oops


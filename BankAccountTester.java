class BankAccountTester{

     public static void main(String bank[]){
	 
	BankAccount.credit(20000);
	double currentBalance = BankAccount.getBalance();
	System.out.println(currentBalance);
	BankAccount.debit(200);
	double currentBalance1 = BankAccount.getBalance();
	System.out.println(currentBalance1);
	BankAccount.credit(12000);
	BankAccount.credit(300);
	double currentBalance2 = BankAccount.getBalance();
	System.out.println(currentBalance2);
	 
	 }




}
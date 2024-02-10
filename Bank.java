class Bank{
// bank - bank name, location, branch code, ifsc code, noOf Accounts 

         static String bankName = "Union Bank of India";
		 static String location = "Gandhinagar";
		 static long branchCode =  55448397L;
		 static String ifscCode = "UBIN0550281";
		 static int noOfAccounts =  12;


  public static void main(String bank[]){
	  System.out.println("Bank Name :" + bankName);
	  System.out.println("Bank Location :" + location);
	  System.out.println("Branch Code :" + branchCode);
	  System.out.println("IFSC Code :" + ifscCode);
	  System.out.println("Total number of Accounts :" + noOfAccounts);
  
  }


}
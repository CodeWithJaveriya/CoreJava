class CustomersTester{

   public static void main(String cus[]){
   
    Customers customers = new Customers();
	
     customers.setCustomerId(1);
	 customers.setFirstName("Sanjay");
	 customers.setMiddleName("Leela");
	 customers.setLastName("Bhansali");
	 customers.setPhoneNo(9056433421L);
	 customers.setEmailId("sanjaylb421@gmail.com");
	 customers.setDob("20Aug1998");
	 customers.setAddress("Rajajinagar");
	 System.out.println(customers.getCustomerId() + " " + customers.getFirstName() + " " + customers.getMiddleName() + " " + customers.getLastName() + " " + customers.getPhoneNo() + " " + customers.getEmailId() + " "+ customers.getDob() + " " + customers.getAddress());
	 
	
   }
}
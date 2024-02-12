class Customers{  //encapsulated class
    
	// if you dont want to acess these variables outside the class then private is used - encapsulation
	 private int customerId;
	 private String firstName; 
	 private String  middleName; 
	 private String lastName;
	 private long phoneNo;
	 private String email;
	 private String dob;
	 private String address;
	 
	//getter and setter
    //setter method for customerId
     public void setCustomerId(int customerId){
		 this.customerId = customerId;
	 }	
	//getter method for customerId
	public int getCustomerId(){
		return customerId;
	}
    
	//setter for address 
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	//getter for firstName
	public String getFirstName(){
		return firstName;
	}
	
	//setter for middleName
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}
	
	//getter for middleName
	public String getMiddleName(){
		return middleName;
	}
	
	//setter for lastName
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	//getter for lastName
	public String getLastName(){
		return lastName;
	}
	
	//setter for phoneNo
	public void setPhoneNo(long phoneNo){
		this.phoneNo = phoneNo;
	}
	
	//getter for phoneNo
	public long getPhoneNo(){
		return phoneNo;
	}
	
	//setter for email
	public void setEmailId(String email){
		this.email = email;
	}
	
	//getter for email
	public String getEmailId(){
		return email;
	}
	
	//setter for dob
	public void setDob(String dob){
		this.dob = dob;
	}
	
	//getter for dob
	public String getDob(){
		return dob;
	}
	
	//setter for address
	public void setAddress(String address){
		this.address = address;
	}
	
	//getter for address
	public String getAddress(){
		return address;
	}
}
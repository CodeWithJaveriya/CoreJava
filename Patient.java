class Patient{
	// storingthe data and managing it
      // patient name, age, blood group, gender, phone no. , is Alive 
	         //Variable name 
	  static String patientName = "Hallappa";
	  static int age = 45;
	  static String bloodGroup = "B+";
	  static String gender = "Female";
	  static long phoneNumber = 9900828587L;	  // int doesnot take a long number so just use long with uppercase or lowercase "l"
	  static boolean isAlive = true;
	  

    public static void main(String doctor[]){
	
	      System.out.println("The patient name is " + patientName); //+ is concatenator
		  System.out.println("The patient age is " + age);
		  System.out.println("The patient blood group is " + bloodGroup);
		  System.out.println("The pateint gender is " + gender);
		  System.out.println("The patient phone number is " + phoneNumber);
		  System.out.println("Is the patient alive " + isAlive);
		  
	}
}
class SwitchBoard{

  // constructor 
  // public SwitchBoard(String bName, int nOS, String tpe, String clr, double prce){
	  // name = bName;
	  // noOfSwitches = nOS;
	  // type = tpe;
	  // color = clr;
	  // price = prce;
  // System.out.println("Constructor SwitchBoard is invocked");
  // }
    
                    //Hom
     public SwitchBoard(){
		 System.out.println("Invocking default SwitchBoard Constructor");
	 }
  
  
                      //parameters
  public SwitchBoard(String name, int noOfSwitches, String type, String color, double price){
	  
	  //when instance variable and parameters are same compiler will not get to know which is instance and which is parametere so we use this keyword telling compliler which is instance value
	  this.name = name;
	  this.noOfSwitches = noOfSwitches;
	  this.type = type;
	  this.color = color;
	  this.price = price;
	  
	  System.out.println("Constructor parametrized SwitchBoard is invoked");
  }
  
   // instance variables 
   String name;
   int noOfSwitches;
   String type;
   String color;
   double price;
   
   // istance method
   public void provideElectricity(){
   
   System.out.println("Electricity passing!!!");
   }



}
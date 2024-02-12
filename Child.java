class Child extends Parent{
   
   public Child(){
	   // if we dont write complier writes it and every constructir has it 
	   super(123);   //from child it is connected to parent - constructor chaining from one class to another class
   	System.out.println("Child object is invocked");

   }
     
	 
	public void contentCreator(){
		System.out.println("Children making vedios");

	}
}
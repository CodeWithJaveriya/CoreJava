class HighLighter{

       String brandName;
	   String skinType;
	   double price;
	   String itemForum;
	   String fragnance;
	   
	   
	   public HighLighter(){
	     System.out.println("Default Constructor is invocked");
	   }
	   
	   public HighLighter(String brandName, String skinType, String fragnance){
		   this("Lotion");
		   this.brandName = brandName;
		   this.skinType = skinType;
		   this.fragnance = fragnance;
		   System.out.println("Parameterized Constructor is invoked");
	   }
	   
	   public HighLighter(String itemForum){
		  this(345.89);
		  this.itemForum = itemForum;		  
		   
	   }
	   
	   public HighLighter(double price){
		   this();
		   this.price = price;
	   }
	   
	   public void forHighlighting(){
		   System.out.println("Highlight and look beautifull!!");
	   }
	   
}




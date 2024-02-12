class IndianRupeeTester{

   public static void main(String test[]){
	   
	   IndianRupee rupee = new IndianRupee();
	   rupee.setRupeeId(1);
	   rupee.setRupeeName("Taka");
	   rupee.setPrintDate("20-10-2002");
	   rupee.setColor("Yellow");
	   rupee.setSerialNo(45);
	   rupee.setNoOfLanguages(15);
	   rupee.setSize(3);
	   rupee.setBackSidePlaceName("Red Fort");
	   rupee.setLocation("GOI");
	   System.out.println(rupee.getRupeeId() + " " + rupee.getRupeeId()
	   + " " + rupee.getPrintDate() + " " + rupee.getColor() + " " +
	   rupee.getSerialNo() + " " + rupee.getNoOfLanguages() + " " + 
	   rupee.getSize() + " " + rupee.getBackSidePlaceName() + " " +
	   rupee.getLocation());
	   
   }

}
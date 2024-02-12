class MortgageeTester{

    public static void main(String test[]){
	
	Mortgagee mortgagee = new Mortgagee();
	mortgagee.setBankId(1);
	mortgagee.setBankName("Axis Bank");
	mortgagee.setBranch("Yelahanka Branch");
	mortgagee.setBranchCode("CRPO00745466");
	mortgagee.setAddress("Yelahnaka Banglore");
	mortgagee.setIfscCode("RTUYR374893829");
	mortgagee.setHelplineNo(4632849823L);
	mortgagee.setBankManager("Yashoda Pibpot");
	mortgagee.setMiscCode("DEROI6468328");
	mortgagee.setNoOfLockers(98);
	mortgagee.setNoOfEmployees(56);
	mortgagee.setTimings("9:30am");
	mortgagee.setWebsiteDetails("www.axisbank.com");
	System.out.println(mortgagee.getBankId() + " " + mortgagee.getBankName() + " " + mortgagee.getBranch() + " " + mortgagee.getBranchCode() + " " + mortgagee.getAddress() + " " + mortgagee.getIfscCode() + " " + mortgagee.getHelplineNo() + " " + mortgagee.getBankManager()
	+ " " + mortgagee.getMiscCode() + " " + mortgagee.getNoOfLockers() + " " + mortgagee.getNoOfEmployees() + " " + mortgagee.getTimings() + " " + mortgagee.getWebsiteDetails());
	
	Mortgagee mortgagee1 = new Mortgagee();
	mortgagee1.setBankId(2);
	mortgagee1.setBankName("Bank of Baroda");
	mortgagee1.setBranch("Kattengenahalli Branch");
	mortgagee1.setBranchCode("BOB058768466");
	mortgagee1.setAddress(" Kattengenahalli Banglore");
	mortgagee1.setIfscCode("WRGHFY3734829");
	mortgagee1.setHelplineNo(388344378L);
	mortgagee1.setBankManager("Keerthi Singh");
	mortgagee1.setMiscCode("HGFBK6468328");
	mortgagee1.setNoOfLockers(789);
	mortgagee1.setNoOfEmployees(326);
	mortgagee1.setTimings("10:30am");
	mortgagee1.setWebsiteDetails("www.bob.com");
	System.out.println(mortgagee1.getBankId() + " " + mortgagee1.getBankName() + " " + mortgagee1.getBranch() + " " + mortgagee1.getBranchCode() + " " + mortgagee1.getAddress() + " " + mortgagee1.getIfscCode() + " " + mortgagee1.getHelplineNo() + " " + mortgagee1.getBankManager()
	+ " " + mortgagee1.getMiscCode() + " " + mortgagee1.getNoOfLockers() + " " + mortgagee1.getNoOfEmployees() + " " + mortgagee1.getTimings() + " " + mortgagee1.getWebsiteDetails());
	
	Mortgagee mortgagee3 = new Mortgagee();
	mortgagee3.setBankId(1);
	mortgagee3.setBankName("Canara Bank");
	mortgagee3.setBranch("BTM Layout Branch");
	mortgagee3.setBranchCode("CP00745466");
	mortgagee3.setAddress("BTM Layout Banglore");
	mortgagee3.setIfscCode("IYTV6643829");
	mortgagee3.setHelplineNo(6437883298L);
	mortgagee3.setBankManager("Chetan Singh Bhatt");
	mortgagee3.setMiscCode("HRVIYE648328");
	mortgagee3.setNoOfLockers(468);
	mortgagee3.setNoOfEmployees(1038);
	mortgagee3.setTimings("11:30am");
	mortgagee3.setWebsiteDetails("www.canarabank.com");
	System.out.println(mortgagee3.getBankId() + " " + mortgagee3.getBankName() + " " + mortgagee3.getBranch() + " " + mortgagee3.getBranchCode() + " " + mortgagee3.getAddress() + " " + mortgagee3.getIfscCode() + " " + mortgagee3.getHelplineNo() + " " + mortgagee3.getBankManager()
	+ " " + mortgagee3.getMiscCode() + " " + mortgagee3.getNoOfLockers() + " " + mortgagee3.getNoOfEmployees() + " " + mortgagee3.getTimings() + " " + mortgagee3.getWebsiteDetails());
	
	}

}
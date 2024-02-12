public class Mortgagee{

    public Mortgagee(){
	
	}

    private int bankId;
	private String bankName;
	private String branch;
	private String branchCode;
	private String address;
	private String ifscCode;
	private long helplineNo;
	private String branchManager;
	private String miscCode;
	private int noOfLockers;
	private int noOfEmployees;
	private String timings;
	private String websiteDetails;
	
	//setter for bankId
	public void setBankId(int bankId){
		this.bankId = bankId;
	}
	
	//getter for bankId
	public int getBankId(){
		return bankId;
	}
	
    //setter for bankName
	public void setBankName(String bankName){
		this.bankName = bankName;
	}
	
	//getter for bankName
	public String getBankName(){
		return bankName;
	}
	
	//setter for branch
	public void setBranch(String branch){
		this.branch = branch;
	}
	
	//getter for branch
	public String getBranch(){
		return branch;
	}
	
	//setter for branchCode
	public void setBranchCode(String branchCode){
		this.branchCode = branchCode;
	}
	
	//getter for branchCode
	public String getBranchCode(){
		return branchCode;
	}
	
	//setter for address
	public void setAddress(String address){
		this.address = address;
	}
	
	//getter for branchCode
	public String getAddress(){
		return address;
	}
	
    //setter for ifscCode
	public void setIfscCode(String ifscCode){
		this.ifscCode = ifscCode;
	}
	
	//getter for branchCode
	public String getIfscCode(){
		return ifscCode;
	}
	
	//setter for helplineNo
	public void setHelplineNo(long helplineNo){
		this.helplineNo = helplineNo;
	}
	
	//getter for helplineNo
	public long getHelplineNo(){
		return helplineNo;
	}

	//setter for branchManager
	public void setBankManager(String branchManager){
		this.branchManager = branchManager;
	}
	
	//getter for branchManager
	public String getBankManager(){
		return branchManager;
	}
	
    //setter for miscCode
	public void setMiscCode(String miscCode){
		this.miscCode = miscCode;
	}
	
	//getter for miscCode
	public String getMiscCode(){
		return miscCode;
	}

	//setter for noOfLockers
	public void setNoOfLockers(int noOfLockers){
		this.noOfLockers = noOfLockers;
	}
	
	//getter for noOfLockers
	public int getNoOfLockers(){
		return noOfLockers;
	}
	
	//setter for noOfEmployees
	public void setNoOfEmployees(int noOfEmployees){
		this.noOfEmployees = noOfEmployees;
	}
	
	//getter for noOfEmployees
	public int getNoOfEmployees(){
		return noOfEmployees;
	}

    //setter for timings
	public void setTimings(String timings){
		this.timings = timings;
	}
	
	//getter for timings
	public String getTimings(){
		return timings;
	}
	
    //setter for websiteDetails
	public void setWebsiteDetails(String websiteDetails){
		this.websiteDetails = websiteDetails;
	}
	
	//getter for websiteDetails
	public String getWebsiteDetails(){
		return websiteDetails;
	}
	
}
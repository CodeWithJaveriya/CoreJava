class SuffererTester{

    public static void main(String test[]){
		
		Sufferer sufferer = new Sufferer();
		sufferer.setPatientId(1);
		sufferer.setName("Raghu");
		sufferer.setAge(33);
		sufferer.setBloodGroup("O -negative");
		sufferer.setGender("Male");
		sufferer.setAddress("Banglore");
		sufferer.setContactNo(988054321L);
		sufferer.setWardNo(901);
		sufferer.setAttenderName("Jagadish Kumar");
		sufferer.setDiseaseName("Cancer");
		sufferer.setConsultant("Tabiya Khannum - MBBS MD");
		sufferer.setHospitalName("Ramiah Hospital");
		sufferer.setFees(267777.90);
		System.out.println(sufferer.getPatientId() + " " + sufferer.getName() + " " + sufferer.getAge() + " " + sufferer.getBloodGroup() + " " + sufferer.getGender() + " " + sufferer.getAddress() + " " + sufferer.getContactNo() + " " + sufferer.getWardNo() + " " + sufferer.getAttenderName() + " " + sufferer.getDiseaseName() + " " + sufferer.getConsultant() + " " + sufferer.getHospitalName() + " " + sufferer.getFees());
		
		Sufferer sufferer1 = new Sufferer();
		sufferer1.setPatientId(2);
		sufferer1.setName("Bhakti");
		sufferer1.setAge(48);
		sufferer1.setBloodGroup("O +positive");
		sufferer1.setGender("Female");
		sufferer1.setAddress("HSR Layout");
		sufferer1.setContactNo(8985576789L);
		sufferer1.setWardNo(899);
		sufferer1.setAttenderName("Arun Pachel");
		sufferer1.setDiseaseName("Dialysis");
		sufferer1.setConsultant("Bhavana G M - MBBS MD");
		sufferer1.setHospitalName("Prolife Hospital");
		sufferer1.setFees(5677637.90);
		System.out.println(sufferer1.getPatientId() + " " + sufferer1.getName() + " " + sufferer1.getAge() + " " + sufferer1.getBloodGroup() + " " + sufferer1.getGender() + " " + sufferer1.getAddress() + " " + sufferer1.getContactNo() + " " + sufferer1.getWardNo() + " " + sufferer1.getAttenderName() + " " + sufferer1.getDiseaseName() + " " + sufferer1.getConsultant() + " " + sufferer1.getHospitalName() + " " + sufferer1.getFees());
		}



}
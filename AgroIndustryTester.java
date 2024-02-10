class AgroIndustryTester {

    public static void main(String[] args) {
        AgroIndustry agroIndustry1 = new AgroIndustry();
        agroIndustry1.name = "Mineral Crop Production Industry";
        agroIndustry1.location = "Banglore";
        agroIndustry1.yearEstablished = 2005;
        agroIndustry1.numberOfEmployees = 100;
        agroIndustry1.mainCrop = "Rice";
        agroIndustry1.hasCertification = true;
        agroIndustry1.annualRevenue = 500000.0;
        agroIndustry1.isExporting = true;
        agroIndustry1.website = "www.mcpi.com";
		agroIndustry1.processCrop();
		System.out.println("Introducing First Crop :");
		System.out.println(agroIndustry1.name + " " + agroIndustry1.location + "" + agroIndustry1.yearEstablished + " "+ agroIndustry1.numberOfEmployees + " "+ agroIndustry1.mainCrop + " " + agroIndustry1.hasCertification + " "+ agroIndustry1.annualRevenue + " "+ agroIndustry1.isExporting + " " + agroIndustry1.website);
		
		AgroIndustry agroIndustry2 = new AgroIndustry();
        agroIndustry2.name = "Water Mineral Industry";
        agroIndustry2.location = "Bidar";
        agroIndustry2.yearEstablished = 2010;
        agroIndustry2.numberOfEmployees = 150;
        agroIndustry2.mainCrop = "Wheat";
        agroIndustry2.hasCertification = false;
        agroIndustry2.annualRevenue = 300000.0;
        agroIndustry2.isExporting = false;
        agroIndustry2.website = "www.wmi.com";
		agroIndustry2.processCrop();
		System.out.println("Introducing Second Crop :");
		System.out.println(agroIndustry2.name + " " + agroIndustry2.location + "" + agroIndustry2.yearEstablished + " "+ agroIndustry2.numberOfEmployees + " "+ agroIndustry2.mainCrop + " " + agroIndustry2.hasCertification + " "+ agroIndustry2.annualRevenue + " "+ agroIndustry2.isExporting + " " + agroIndustry2.website);
		
		AgroIndustry agroIndustry3 = new AgroIndustry();
        agroIndustry3.name = "Crop Production Industry";
        agroIndustry3.location = "Kalburgi";
        agroIndustry3.yearEstablished = 2020;
        agroIndustry3.numberOfEmployees = 50;
        agroIndustry3.mainCrop = "Dal";
        agroIndustry3.hasCertification = true;
        agroIndustry3.annualRevenue = 400000.0;
        agroIndustry3.isExporting = false;
        agroIndustry3.website = "www.cpi.com";
		agroIndustry3.processCrop();
		System.out.println("Introducing Third Crop :");
		System.out.println(agroIndustry3.name + " " + agroIndustry3.location + "" + agroIndustry3.yearEstablished + " "+ agroIndustry3.numberOfEmployees + " "+ agroIndustry3.mainCrop + " " + agroIndustry3.hasCertification + " "+ agroIndustry3.annualRevenue + " "+ agroIndustry3.isExporting + " " + agroIndustry3.website);
		
		AgroIndustry agroIndustry4 = new AgroIndustry();
        agroIndustry4.name = "Ragi Crop Production Industry";
        agroIndustry4.location = "Shivmogga";
        agroIndustry4.yearEstablished = 2019;
        agroIndustry4.numberOfEmployees = 150;
        agroIndustry4.mainCrop = "Ragi";
        agroIndustry4.hasCertification = false;
        agroIndustry4.annualRevenue = 560000.0;
        agroIndustry4.isExporting = true;
        agroIndustry4.website = "www.rcpi.com";
		agroIndustry4.processCrop();
		System.out.println("Introducing Fourth Crop :");
		System.out.println(agroIndustry4.name + " " + agroIndustry4.location + " " + agroIndustry4.yearEstablished + " "+ agroIndustry4.numberOfEmployees + " "+ agroIndustry4.mainCrop + " " + agroIndustry4.hasCertification + " "+ agroIndustry4.annualRevenue + " "+ agroIndustry4.isExporting + " " + agroIndustry4.website);
		
		AgroIndustry agroIndustry5 = new AgroIndustry();
        agroIndustry5.name = "Maida Crop Production Industry";
        agroIndustry5.location = "Hassan";
        agroIndustry5.yearEstablished = 2009;
        agroIndustry5.numberOfEmployees = 50;
        agroIndustry5.mainCrop = "Maida";
        agroIndustry5.hasCertification = true;
        agroIndustry5.annualRevenue = 60000.0;
        agroIndustry5.isExporting = true;
        agroIndustry5.website = "www.mcpi.com";
		agroIndustry5.processCrop();
		System.out.println("Introducing Fifth Crop :");
		System.out.println(agroIndustry5.name + " " + agroIndustry5.location + " " + agroIndustry5.yearEstablished + " "+ agroIndustry5.numberOfEmployees + " "+ agroIndustry5.mainCrop + " " + agroIndustry5.hasCertification + " "+ agroIndustry5.annualRevenue + " "+ agroIndustry5.isExporting + " " + agroIndustry5.website);
		
		
		}
		}
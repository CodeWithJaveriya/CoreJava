class WaterHeaterTester {

    public static void main(String[] args) {
        WaterHeater waterHeater1 = new WaterHeater();
        waterHeater1.brand = "Butterfly";
        waterHeater1.model = "Model1";
        waterHeater1.energySource = "Electricity";
        waterHeater1.capacity = 50.0;
        waterHeater1.isSmart = true;
        waterHeater1.isEnergyEfficient = true;
        waterHeater1.temperatureRange = 40;
        waterHeater1.displayType = "LCD";
        waterHeater1.hasTimer = true;
        waterHeater1.warranty = "2 years";
		waterHeater1.heatWater();
		System.out.println(waterHeater1.brand + " " + waterHeater1.model + " " + waterHeater1.energySource + " " + waterHeater1.capacity + " " + waterHeater1.isSmart + " " + waterHeater1.isEnergyEfficient + " " + waterHeater1.temperatureRange + " " + waterHeater1.displayType);
		
		 WaterHeater waterHeater2 = new WaterHeater();
        waterHeater2.brand = "Milton";
        waterHeater2.model = "Model2";
        waterHeater2.energySource = "Gas";
        waterHeater2.capacity = 30.0;
        waterHeater2.isSmart = false;
        waterHeater2.isEnergyEfficient = false;
        waterHeater2.temperatureRange = 50;
        waterHeater2.displayType = "LED";
        waterHeater2.hasTimer = false;
        waterHeater2.warranty = "1 year";
		waterHeater2.heatWater();
		System.out.println(waterHeater2.brand + "" + waterHeater2.displayType);
		}
		
		}
		
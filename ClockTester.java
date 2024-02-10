class ClockTester{
	
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.brand = "ANJANA";
        clock.hour = 10;
        clock.minute = 30;
        clock.second = 45;
        clock.day = 14;
        clock.month = 7;
        clock.year = 2023;
        clock.isDigital = true;
        clock.is24HourFormat = false;
        clock.color = "Black";
        clock.displayTime();
		System.out.println(clock.brand + " " + clock.hour);

		
		Clock clock1 = new Clock();
        clock1.brand = "ADIDAS";
        clock1.hour = 10;
        clock1.minute = 30;
        clock1.second = 45;
        clock1.day = 14;
        clock1.month = 7;
        clock1.year = 2023;
        clock1.isDigital = true;
        clock1.is24HourFormat = false;
        clock1.color = "Black";
        clock1.displayTime();
        System.out.println(clock.brand + " " + clock.hour);
}
}
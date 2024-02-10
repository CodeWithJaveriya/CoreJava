class StationaryTester{

    public static void main(String tester[]){
	
	Stationary.addStationaryItem("Books");
	Stationary.addStationaryItem("Pens");
	Stationary.addStationaryItem("Pencils");
	Stationary.addStationaryItem("Eraser");
	Stationary.addStationaryItem("Paint");
	Stationary.addStationaryItem("Bags");
	Stationary.addStationaryItem("Sharpner");
	Stationary.addStationaryItem("Shining Pens");
	
	Stationary.getAllStationaryItems();
	
	Stationary.editStationaryItem("Shining Pens", "Sketches");
	
     int newLength =  Stationary.deleteStationaryItem("Sharpner");
	 System.out.println(newLength);
	 System.out.println("Calling out getAllStationaryItemsPostDeletion");
	 Stationary.getAllStationaryItemsPostDeletion();
	}




}
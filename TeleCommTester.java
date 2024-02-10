class TeleCommTester{

public static void main(String test[]){
	TeleComm.addSimCard("Airtel");
	TeleComm.addSimCard("Vodafone");
	TeleComm.addSimCard("Jio");
	TeleComm.addSimCard("BSNL");
	TeleComm.addSimCard("LTE");
	TeleComm.addSimCard("Ditac");
	TeleComm.addSimCard("LycaMobile");
	TeleComm.addSimCard("MAtrix");
	TeleComm.addSimCard("");

	TeleComm.getAllSimCards();
	
	boolean isUpdated = TeleComm.updateSimCard("Ditac", "Ditac USA");
	System.out.println(isUpdated);
	
	TeleComm.getAllSimCards();
	
	int newLength = TeleComm.deleteSimCard("LTE");
	
	System.out.println("Card names before deletion:");
	TeleComm.getAllSimCardsPostDeletion(newLength);
}

}
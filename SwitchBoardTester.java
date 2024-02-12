class SwitchBoardTester{

    public static void main(String switchBoard[]){
	
	SwitchBoard board = new SwitchBoard("JK" , 3 , "Fiber", "Black" , 299.00);
	
	System.out.println(board.name + " "+ board.noOfSwitches + " "+ board.type + " "+ board.color +" "+ board.price);
	
	SwitchBoard board1 = new SwitchBoard("JKJ" , 4 , "Plastic", "Orange" , 456.00);
	
	System.out.println(board1.name + " "+ board1.noOfSwitches + " "+ board1.type + " "+ board1.color +" "+ board1.price);	
	
	SwitchBoard board2 = new SwitchBoard("Madma" , 5 , "Steel", "Yellow" , 990.00);
	
	System.out.println(board2.name + " "+ board2.noOfSwitches + " "+ board2.type + " "+ board2.color +" "+ board2.price);

	SwitchBoard board4 = new SwitchBoard();
	System.out.println(board4);
	
    board.provideElectricity();
	
	}


}
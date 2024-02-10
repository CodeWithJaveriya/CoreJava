class DoorTester {
    public static void main(String[] args) {
        Door door = new Door();
        door.material = "Wood";
        door.color = "Brown";
        door.height = 80;
        door.width = 36;
        door.isOpen = false;
        door.isLocked = true;
        door.handleType = "Knob";
        door.hingeType = "Swing";
        door.lockType = "Key";
        door.manufacturer = "LED Doors";
door.open();
System.out.println(door.material + " " + door.width);

Door newdoor = new Door();
        newdoor.material = "Plastic";
        newdoor.color = "Black";
        newdoor.height = 80;
        newdoor.width = 36;
        newdoor.isOpen = false;
        newdoor.isLocked = true;
        newdoor.handleType = "Knob";
        newdoor.hingeType = "Swing";
        newdoor.lockType = "Key";
        newdoor.manufacturer = "MFC Doors";
newdoor.open();
System.out.println(newdoor.material + " " + newdoor.width);
	}
}
class WalletTester{

public static void main(String[] args) {
    Wallet wallet = new Wallet();
    wallet.brand = "Louis Vuitton";
    wallet.material = "Leather";
    wallet.color = "Brown";
    wallet.style = "Bifold";
    wallet.price = 250.50;
    wallet.capacity = 8;
    wallet.hasCoinPocket = true;
    wallet.hasIDSlot = true;
    wallet.isRFIDProtected = true;
    wallet.isZipperClosure = false;
wallet.holdMoney();
System.out.println(wallet.brand   + "" + wallet.style);

 Wallet wallet1 = new Wallet();
    wallet1.brand = "Vuitton";
    wallet1.material = "Leather";
    wallet1.color = "Black";
    wallet1.style = "Bifold";
    wallet1.price = 200.50;
    wallet1.capacity = 10;
    wallet1.hasCoinPocket = true;
    wallet1.hasIDSlot = true;
    wallet1.isRFIDProtected = true;
    wallet1.isZipperClosure = false;
wallet1.holdMoney();
System.out.println(wallet1.brand  + "" + wallet1.style);

}
}
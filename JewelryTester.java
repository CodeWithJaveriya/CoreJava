class JewelryTester {
    public static void main(String[] args) {
        Jewelry jewelry = new Jewelry();
        jewelry.name = "Diamond Necklace";
        jewelry.material = "Gold";
        jewelry.color = "Yellow";
        jewelry.weight = 10.5;
        jewelry.price = 5000.0;
        jewelry.brand = "Tiffany & Co.";
        jewelry.style = "Statement";
        jewelry.quantity = 1;
        jewelry.isAntique = false;
        jewelry.countryOfOrigin = "United States";
        jewelry.wear();
        System.out.println(jewelry.name + "  " + jewelry.color);

        Jewelry jewelry1 = new Jewelry();
        jewelry1.name = "Pearl Earrings";
        jewelry1.material = "Silver";
        jewelry1.color = "White";
        jewelry1.weight = 2.3;
        jewelry1.price = 250.0;
        jewelry1.brand = "Cartier";
        jewelry1.style = "Classic";
        jewelry1.quantity = 2;
        jewelry1.isAntique = false;
        jewelry1.countryOfOrigin = "France";
        jewelry1.wear();
        System.out.println(jewelry1.name + " by " + jewelry1.brand);
    }
}
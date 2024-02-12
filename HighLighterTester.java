class HighLighterTester{

   public static void main(String test[]){
       
	   HighLighter highlighter = new HighLighter("Maybelline", "All Skins", "Free");
	   highlighter.brandName = "Maybelline";
	   highlighter.skinType = "All Skins";
	   // highlighter.price = 345.89;
	   // highlighter.itemForum = "Lotion";
	   highlighter.fragnance = "Free";
	   System.out.println(highlighter.brandName + " " + highlighter.skinType +" "+ highlighter.price + " "+ highlighter.itemForum + " "+ highlighter.fragnance);
	   highlighter.forHighlighting();
   }

}
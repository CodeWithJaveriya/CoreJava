class Family{

   static String familyMembers[] = {"Father" , "Mother", "Brother", "Sister"};
   
   public static void main(String people[]){
   // for loop
   System.out.println("Main Started");
   for(int memberindex = 0; memberindex < familyMembers.length; memberindex++){
	   System.out.println(familyMembers[memberindex]);
   }
   System.out.println("Main Ended");
   }



}
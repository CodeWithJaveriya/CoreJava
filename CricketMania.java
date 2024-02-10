class CricketMania{

     static String batsman[] = {"Suryakumar Yadav", "Mohammad Rizwan", "Babar Azam", "Aiden Markram", "Shubman Gill", "David Warner",
	 "Harry Tector", "Virat Kohli", "Quinton de Kock", "Rohit Sharma"};
	 
	 static String iccTeamRankings[] = {"India", "Australia", "England", "South Africa", "New Zealeand", "Pakistan", "Sri Lanka", "West Indies",
	 "Bangladesh", "Zimbambwe"};
	 
	 static String iplTeamNames[] = {"Chennai Super Kings", "Royal Challengers BAnglore", "Gujrath Titans", "Kolkatha knight Riders",
	 "Dehli Capitals", "Rajasthan Royals", "Lucknow Super Giants", "Mumbai Indians", "Sunrises Hyderbad", "Punjab Kings"};
	 
       public static void main(String players[]){
		   
		   System.out.println("MAin Started");
		   System.out.println("Top 10 batsman are: ");
		   System.out.println(batsman[0] +" "+ batsman[1] +" "+ batsman[2] +" "+ batsman[3] +" "+ batsman[4] +" "+
		                      batsman[5] +" "+ batsman[6] +" "+ batsman[7] +" "+ batsman[8] +" "+ batsman[9]);
		   System.out.println("MAin Ended");
           System.out.println("-------------------");
		   
		   System.out.println("MAin Started");
		   System.out.println("ICC Team RAnkings are: ");
		   System.out.println(iccTeamRankings[0] +"  "+ iccTeamRankings[1] +"  "+ iccTeamRankings[2] +"  "+ iccTeamRankings[3] +"  "+
		                      iccTeamRankings[4] +"  "+ iccTeamRankings[5] +"  "+ iccTeamRankings[6] +"  "+ iccTeamRankings[7] +"  "+
							  iccTeamRankings[8] +"  "+ iccTeamRankings[9] );
		   System.out.println("MAin Ended");
           System.out.println("-------------------");
		   
		   System.out.println("MAin Started");
		   System.out.println("IPL Team Names are : ");
		   System.out.println(iplTeamNames[0] +"  "+ iplTeamNames[1] +"  "+ iplTeamNames[2] +"  "+ iplTeamNames[3] +"  "+ iplTeamNames[4] +"  "+
		                      iplTeamNames[5] +"  "+ iplTeamNames[6] +"  "+ iplTeamNames[7] +"  "+ iplTeamNames[8] +"  "+ iplTeamNames[9] );
		   System.out.println("MAin Ended");
           System.out.println("-------------------");				  
		   System.out.println("Length " + batsman.length);
		   System.out.println(iccTeamRankings.length);
		   System.out.println(iplTeamNames.length);
	   }

}

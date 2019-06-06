package com.method;

public class methodtut {
	public static void main (String[] args){
		//method calculateHighScorePosition send score return int
		//return 1 if score > 1000
		//return 2 if score >500 & <1000
		//return 3 if score is >100 & <500
		//return 4 in all other cases
		//score test - 1500, 900, 400, 50
		
		//method displayHighScorePosition send name & high score position
		//display message "-- managed to get into position -- on high score table"
		displayHighScorePosition("Sam", calculateHighScorePosition(1500));
		
		displayHighScorePosition("Bam", calculateHighScorePosition(900));
		
		displayHighScorePosition("Tam", calculateHighScorePosition(400));
		
		displayHighScorePosition("Cam", calculateHighScorePosition(50));
	
	}
		
	
	public static int calculateHighScorePosition (int score){
		
		if (score > 1000)
			return 1;
		else if (500<=score && score<=1000)
			return 2;
		else if (100<=score && score<500)
			return 3;
		else
			return 4;
	}
	public static void displayHighScorePosition (String name, int position){
		System.out.println(name+" managed to get position "+position+" on high score table");
	}
	
}

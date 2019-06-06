package com.overlod;

public class methodOL {
	public static void main (String[] args){
		
		double cm = calcFeetandInchesToCentimeters (1, 12);
		System.out.println ("1 ft = "+ cm+ " cms");
		
		cm = calcFeetandInchesToCentimeters (5);
		System.out.println ("5 inches = "+ cm+ " cms");
	}
	
	public static double calcFeetandInchesToCentimeters (int feet, int inches){
		double centimeter;
		if ((feet < 0)||(inches < 0 || inches > 12)){
			System.out.println("Error");
			return -1;
		}
		centimeter = (12 * feet + inches) * 2.54;
		return centimeter;
	}
	
	public static double calcFeetandInchesToCentimeters (int inches){
		double centimeter;
		if (inches < 0 || inches > 12)
			return -1;
		centimeter =  inches * 2.54;
		return centimeter;
	}
}

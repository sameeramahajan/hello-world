/**
 * 
 */
package com.calinterest;

/**
 * @author SM00470388
 *
 */
public class FDreturns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double mynum = 12.0001;
		System.out.println(String.format("%.2f", mynum));
		for (int i = 10; i >= 5; i--)
		System.out.println("FD returns for 1 year at "+ i+"% interest on 10000 is: "+ calinterest(10000.0, i));
	}
	
	public static double calinterest (double amt, double rate){
		double total = amt+ amt*rate/100;
		
		return total;
	}
}

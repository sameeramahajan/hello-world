package com.even;

public class evennum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		if(iseven(num)){
			System.out.println("Number "+ num+ " is even");
		}
		else 
			System.out.println("Number "+ num+ " is not even");
		
	}

	public static boolean iseven(int i){
		boolean chk = true;
		if (i%2 !=0)
			chk = false;
		return chk;
	}
}

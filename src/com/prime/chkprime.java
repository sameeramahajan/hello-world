package com.prime;

public class chkprime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime=0;
		for (int i=4; i<30; i++){
			
			if (isprime(i)){
				System.out.println("Prime number = "+ i +"\n");
				prime++;
				if (prime >= 3)
					break;
			}			
		}
		//System.out.println("number of prime nos.= "+ prime);
	}
	
	public static boolean isprime(int num){
		boolean chk = true;
		for (int i=2; i<=num/2; i++){
			if (num % i == 0){
				chk = false;
			}
		}
		return chk;
	}

}

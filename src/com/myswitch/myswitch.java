package com.myswitch;

public class myswitch {
	public static void main (String[] args){
		char switchval='C';
		
		String myname="Sameera";
		System.out.println (myname.toUpperCase());
		
		switch(switchval){
		
		case 'a':case 'A':
			System.out.println("sw val is a");
			break;
		case 'b':case 'B':
			System.out.println("sw val is b");
			break;
		case 'c':case 'C':
			System.out.println("sw val is c");
			break;
		default:
			System.out.println("Inside default");
			break;
		}
		
		System.out.println("Outside Switch");
	}
}

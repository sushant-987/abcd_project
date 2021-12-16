package com.string;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first="Sushant";
		String second="Pamu";
		String third="Sushant";
		
		boolean result1=first.equals(second);
		System.out.println("First String equals to second:" + result1);
		
		boolean result2=first.equals(third);
		System.out.println("First String equals to third :" + result2);

	}

}

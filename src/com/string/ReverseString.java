package com.string;

 public class ReverseString {
	public static void main(String[] args) {
		
		String str="Sushant Godbharle";
		String reversedStr="";
		
		 for(int i=str.length() -1; i>=0; i-- )
		{
			reversedStr =reversedStr + str.charAt(i);
		}
		 System.out.println("Original string:" + str);
		 System.out.println("Reverse of given String:" + reversedStr);

	}
}

/*
 * String string = "Dream big"; // Stores the reverse of given string String
 * reversedStr = "";
 * 
 * // Iterate through the string from last and add each character to // variable
 * reversedStr for (int i = string.length() - 1; i >= 0; i--) { reversedStr =
 * reversedStr + string.charAt(i); }
 * 
 * System.out.println("Original string: " + string); // Displays the reverse of
 * given string System.out.println("Reverse of given string: " + reversedStr);
 */
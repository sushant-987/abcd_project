package com.logical;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to reverse:");
		int no = input.nextInt();
		int rem, rev = 0;
		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("Reversed number is: " + rev);
	}

}

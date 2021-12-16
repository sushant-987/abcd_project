package com.logical;

import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first no:");
		int no1 = input.nextInt();
		System.out.println("Enter the second no:");
		int no2 = input.nextInt();

		Integer div;
		div = no1 / no2;
		System.out.println("Divison is:" + div);
	}

}

package com.practise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no:");
		int no1 = sc.nextInt();
		System.out.println("Enter Second no:");
		int no2 = sc.nextInt();
		System.out.println("Select Symbol(+,-,*,/)");
		String sym = sc.next();
		int res;

		switch (sym) {
		case "+":
			res = no1 + no2;
			System.out.println("Addition is:"+ res);
			break;
		case "-":
			res = no1 - no2;
			System.out.println("Substraction is:" + res);
			break;
		case "*":
			res = no1 * no2;
			System.out.println("Multiplication is:" + res);
			break;
		case "/":
			res = no1 / no2;
			System.out.println("Divison is :" + res);
			break;
		default:
			System.out.println("Invalid symbol");
			System.out.println();

		}
	}
}

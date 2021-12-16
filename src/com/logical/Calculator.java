package com.logical;

import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {
     // TODO Auto-generated method stubN 
	   String yn;
	   do{
	   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no:");
		int no1 = sc.nextInt();
		System.out.println("Enter Second no");
		int no2 = sc.nextInt();
		System.out.println("Select Symbol(+,-,*,/)");
		String sym = sc.next();
	//	sc.close();
		int res;
		switch (sym) {
		case "+":
			res = no1 + no2;
			System.out.println("Addition is:" + res);
			break;
		case "-":
			res = no1 - no2;
			System.out.println("Substraction is:" + res);
			break;
		case "*":
			res = no1 * no2;
			System.out.println("Multiplication is" + res);
			break;
		case "/":
			res = no1 / no2;
			System.out.println("Divison is" + res);
			break;
		default:
			System.out.println("Invalid input");
		}
		System.out.println("Do you want to continue (Press y for Yes and n for No)");
		yn=sc.next();
		}while(yn.equals("y")||yn.equals("Y"));
			
		}
	}

